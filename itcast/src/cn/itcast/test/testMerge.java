package cn.itcast.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.test.service.TestService;

public class testMerge {
	ClassPathXmlApplicationContext ctx;

	@Before
	public void loadCtx() {
		// fail("Not yet implemented");

		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		
	}

	@Test
	public void testSpring() {
		// ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestService ts = (TestService) ctx.getBean("testService");

		ts.say();

	}

	@Test
	public void testHibernate() {

	}

}
