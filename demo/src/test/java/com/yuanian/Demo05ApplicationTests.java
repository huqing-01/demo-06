package com.yuanian;

import com.yuanian.controller.User_JobController;
import com.yuanian.service.UserService;
import com.yuanian.service.User_JobService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo05ApplicationTests {

	@Autowired
	private User_JobController user_jobController;
	@Autowired
	private UserService userService;
	@Autowired
	private User_JobService user_jobService;
	@Test
	public void contextLoads() {
//		user_jobController.findByIds(String.valueOf(3));
//		System.out.println(userService.findByUserCode(String.valueOf(5)));
		System.out.println(user_jobService.findById("3"));
	}

}
