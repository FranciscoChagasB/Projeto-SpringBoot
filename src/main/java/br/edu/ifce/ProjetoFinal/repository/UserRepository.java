package br.edu.ifce.ProjetoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.ProjetoFinal.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
