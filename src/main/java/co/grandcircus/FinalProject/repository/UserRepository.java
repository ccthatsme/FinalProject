package co.grandcircus.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.FinalProject.jpaEntity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
