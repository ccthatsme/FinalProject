package co.grandcircus.FinalProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.FinalProject.jpaEntity.Food;
import co.grandcircus.FinalProject.jpaEntity.User;

public interface FoodRepository extends JpaRepository<Food, Integer> {

	public List<Food> findByName(String name);
}
