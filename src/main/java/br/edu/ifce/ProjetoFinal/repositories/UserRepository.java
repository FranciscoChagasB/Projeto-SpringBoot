package br.edu.ifce.ProjetoFinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifce.ProjetoFinal.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
