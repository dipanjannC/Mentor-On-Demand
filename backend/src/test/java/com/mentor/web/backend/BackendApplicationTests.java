package com.mentor.web.backend;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mentor.web.model.User;
import com.mentor.web.repository.UserRepository;
import com.mentor.web.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BackendApplicationTests {

	@Autowired
	private UserService userService;

	@MockBean
	private UserRepository userRepository;

// Default method that was created	
//	@Test
//	public void contextLoads() {
//	}

	@Test
	public void getUsersTest() {
		
		when(userRepository.findAll()).thenReturn( Stream
				.of(new User(10001, "alpha", "yuewrtuhvdsja", "aplha", "X", "7234510286",
						"alpha@gmail.com", "user", true),
					new User(10002, "beta", "ghfdsgfjhds", "beta", "Y", "6235715193",
								"beta@hotmail.com", "user", true))
				.collect(Collectors.toList()));
		assertEquals(2, userService.findAll().size());
	}

}
