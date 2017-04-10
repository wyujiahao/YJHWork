package com.neusoft.controller.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.neusoft.domain.User;
import com.neusoft.services.user.UserServices;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserServices userService;

	@RequestMapping("/login")
	public String toIndex(User user, Model model) {
		String  userId="1";
		if("1".equals(user.getUserCode())){
			 user = this.userService.getUserById(userId);
		} 
		System.out.println(JSON.toJSONString(user));
		model.addAttribute("userAAA", user);
		return "usermain";
	}

}
