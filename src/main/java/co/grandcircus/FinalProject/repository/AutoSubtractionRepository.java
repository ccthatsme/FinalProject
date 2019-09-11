package co.grandcircus.FinalProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.grandcircus.FinalProject.jpaEntity.AutoSubtraction;
import co.grandcircus.FinalProject.jpaEntity.Pantry;

public interface AutoSubtractionRepository extends JpaRepository<AutoSubtraction, Integer> {

	List<AutoSubtraction> findByPantry(Pantry pantry);
	
}
