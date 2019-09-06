package co.grandcircus.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.FinalProject.jpaEntity.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {

}
