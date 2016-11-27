package ssm;

import javax.ws.rs.GET;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zbx.pojo.User;
import com.zbx.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Test {
	
	private static Logger log = Logger.getLogger(Test.class);
	
	@Autowired
	private UserService userService;
	
	@org.junit.Test
	public void test01(){
		User user = userService.getUserById(1);
		//log.info(JSON.toJSONString(user));
		log.info(user);
	}
	
}
