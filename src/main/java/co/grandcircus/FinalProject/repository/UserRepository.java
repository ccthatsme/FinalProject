package co.grandcircus.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.grandcircus.FinalProject.jpaEntity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	

	User findByEmail(String email);

}
