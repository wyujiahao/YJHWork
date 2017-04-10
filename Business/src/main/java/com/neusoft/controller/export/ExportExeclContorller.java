package com.neusoft.controller.export;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/import")
public class ExportExeclContorller {
	
	 /**
     * @Title: exporttEmplate
     * @Description:导入图片流
     * @param fileName
     * @return String
     */
	@RequestMapping("/importImage")
    public String exportImage(HttpServletRequest request,HttpServletResponse response,HttpSession session,Model model){
		String uploadFilePath=request.getSession().getServletContext().getRealPath("/upload");
		String filename ="";
		String message="";
		try {  
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;     
	        MultipartFile uploadFile = multipartRequest.getFile("importFile"); 
	        filename = uploadFile.getOriginalFilename();  
	        InputStream is = uploadFile.getInputStream();  
	        // 如果服务器已经存在和上传文件同名的文件，则输出提示信息  
	        File tempFile = new File(uploadFilePath +"\\"+ filename);
	        if (tempFile.exists()) {  
	            boolean delResult = tempFile.delete();  
	            System.out.println("删除已存在的文件：" + delResult);  
	        }  
	        // 开始保存文件到服务器  
	        if (!filename.equals("")) {  
	            FileOutputStream fos = new FileOutputStream(uploadFilePath+"\\"+ filename);  
	            byte[] buffer = new byte[8192]; // 每次读8K字节  
	            int count = 0;  
	            // 开始读取上传文件的字节，并将其输出到服务端的上传文件输出流中  
	            while ((count = is.read(buffer)) > 0) {  
	                fos.write(buffer, 0, count); // 向服务端文件写入字节流  
	            }  
	            fos.close(); // 关闭FileOutputStream对象  
	            is.close(); // InputStream对象
	            message="文件:"+ filename+"导入成功";  
	        }  
	    } catch (FileNotFoundException e) {  
	        e.printStackTrace();  
	        message="文件:"+ filename+"导入失败";
	    } catch (IOException e) {  
	        e.printStackTrace();  
	        message="文件:"+ filename+"导入失败";
	    }  
		    model.addAttribute("filePath", uploadFilePath+"\\"+ filename);
		    model.addAttribute("filename",  filename);
		    model.addAttribute("message", message);
			return "uploadResult";
		 }

}