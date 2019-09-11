package co.grandcircus.FinalProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.grandcircus.FinalProject.jpaEntity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {

	public List<Food> findByName(String name);
	//public Food findByFoodId(int id);
	//@Query (value='UPDATE `pantry_db`.`food` SET `quantity` = '?' WHERE (`id` = '?')');
	
	
	
}
