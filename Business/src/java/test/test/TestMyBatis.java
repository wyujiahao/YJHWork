package test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.neusoft.domain.User;
import com.neusoft.services.user.UserServices;

@RunWith(SpringJUnit4ClassRunner.class)            //��ʾ�̳���SpringJUnit4ClassRunner��
@ContextConfiguration(locations = {"classpath*:conf/spring/applicationContext_mybatis.xml"})
public class TestMyBatis { 
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
       /* private ApplicationContext ac = null;  */
@Resource  
private UserServices userService = null;
/*
        @Before
                public void before() {
                        ac = new ClassPathXmlApplicationContext("classpath*:conf/spring/applicationContext_mybatis.xml");
                       userService =(UserServices) ac.getBean("userService");// (UserService) ac.getBean("userService");
                }*/

  @Test  
  public void test1() {
    User user = userService.getUserById("1");
     System.out.println(user.getUserName());    
     logger.info("ֵ��"+user.getUserName());    
    logger.info(JSON.toJSONString(user));
  }
}


