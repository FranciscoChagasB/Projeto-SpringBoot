package br.edu.ifce.ProjetoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.ProjetoFinal.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
