package com.groupone.springbootappdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootAppDemoApplicationTests {

	@Test
	void contextLoads() {
		int x=1;
		if (x == 0) {
		  System.out.println("0");
		} else if (x == 1) {
		  System.out.println("1");
		} else if (x == 2) {
		  System.out.println("2");
		}
	}

}
