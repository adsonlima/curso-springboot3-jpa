package com.siah.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.siah.curso.entities.Order;
import com.siah.curso.entities.User;
import com.siah.curso.repositories.OrderRepository;
import com.siah.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Ruth Souza", "ruth@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Rodrigo Augusto", "rodrigo@gmail.com", "977777777", "123456");

		Order o1 = new Order(null, Instant.parse("2023-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2023-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2023-07-22T15:21:22Z"), u1);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}