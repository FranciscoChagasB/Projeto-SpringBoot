package br.edu.ifce.ProjetoFinal.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.edu.ifce.ProjetoFinal.model.Order;
import br.edu.ifce.ProjetoFinal.model.User;
import br.edu.ifce.ProjetoFinal.repository.OrderRepository;
import br.edu.ifce.ProjetoFinal.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Green", "maria@gmail.com", "911111111", "123456");
		User u2 = new User(null, "Alex Brown", "alex@gmail.com", "922222222", "123456");
		Order o1 = new Order(null, Instant.parse("2024-01-01T16:00:00Z"), u1);
		Order o2 = new Order(null, Instant.parse("2024-01-01T17:00:00Z"), u2);
		Order o3 = new Order(null, Instant.parse("2024-01-01T18:00:00Z"), u1); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	
}
