package by.test;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.model.page.User;
import by.service.UserServiceI;

public class TestHibernate {
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring.xml",
						"classpath:spring-hibernate.xml" });
		UserServiceI userService = (UserServiceI) ac.getBean("userService");
		// Tuser t = new Tuser();
		User t = new User();
		t.setId(UUID.randomUUID().toString());
		t.setName("admin");
		t.setPwd("123456");
		t.setCreatedatetime(new Date());

		userService.save(t);
	}
}
