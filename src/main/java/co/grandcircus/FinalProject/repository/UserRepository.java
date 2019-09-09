package co.grandcircus.FinalProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.grandcircus.FinalProject.jpaEntity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	

	public List<User> findByEmail(String email);

}
