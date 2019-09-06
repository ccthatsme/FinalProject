package co.grandcircus.FinalProject.jpaEntity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Restriction {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToMany
	@JoinTable(
	  name = "food_restriction", 
	  joinColumns = @JoinColumn(name = "restriction_id"), 
	  inverseJoinColumns = @JoinColumn(name = "food_id"))
	Set<Food> restrictedFood;
	
	@ManyToMany(mappedBy = "userRestriction")
	Set<User> user;

	public Restriction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restriction(Set<Food> restrictedFood, Set<User> user) {
		super();
		this.restrictedFood = restrictedFood;
		this.user = user;
	}

	public Restriction(Integer id, Set<Food> restrictedFood, Set<User> user) {
		super();
		this.id = id;
		this.restrictedFood = restrictedFood;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Food> getRestrictedFood() {
		return restrictedFood;
	}

	public void setRestrictedFood(Set<Food> restrictedFood) {
		this.restrictedFood = restrictedFood;
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Restriction [id=" + id + ", restrictedFood=" + restrictedFood + ", user=" + user + "]";
	}
	
	
}
