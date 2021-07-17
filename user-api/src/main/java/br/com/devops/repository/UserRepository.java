package br.com.devops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devops.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
