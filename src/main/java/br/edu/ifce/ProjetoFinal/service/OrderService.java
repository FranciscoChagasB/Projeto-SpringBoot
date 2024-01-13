package br.edu.ifce.ProjetoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifce.ProjetoFinal.repository.OrderRepository;
import br.edu.ifce.ProjetoFinal.model.Order;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		
		return repository.findAll();
		
	}
	
	public Order findById(Long id) {
		Optional <Order> obj = repository.findById(id);
		return obj.get();
	}
}
