package co.grandcircus.FinalProject.jpaEntity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pantry {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(mappedBy = "pantry")
    private User user;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
	  name = "pantry_food", 
	  joinColumns = @JoinColumn(name = "pantry_id"), 
	  inverseJoinColumns = @JoinColumn(name = "food_id"))
	List<Food> pantryFood;
	
	@OneToMany(mappedBy="pantry", cascade=CascadeType.ALL, orphanRemoval=true)
	List<AutoSubtraction> autosubtraction = new ArrayList<>();

	public Pantry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pantry(User user, List<Food> pantryFood, List<AutoSubtraction> autosubtraction) {
		super();
		this.user = user;
		this.pantryFood = pantryFood;
		this.autosubtraction = autosubtraction;
	}

	
	public Pantry(List<Food> pantryFood, List<AutoSubtraction> autosubtraction) {
		super();
		this.pantryFood = pantryFood;
		this.autosubtraction = autosubtraction;
	}

	public Pantry(Integer id, User user, List<Food> pantryFood, List<AutoSubtraction> autosubtraction) {
		super();
		this.id = id;
		this.user = user;
		this.pantryFood = pantryFood;
		this.autosubtraction = autosubtraction;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Food> getPantryFood() {
		return pantryFood;
	}

	public void setPantryFood(List<Food> pantryFood) {
		this.pantryFood = pantryFood;
	}

	public List<AutoSubtraction> getAutosubtraction() {
		return autosubtraction;
	}

	public void setAutosubtraction(List<AutoSubtraction> autosubtraction) {
		this.autosubtraction = autosubtraction;
	}

	@Override
	public String toString() {
		return "Pantry [id=" + id + ", user=" + user + ", pantryFood=" + pantryFood + ", autosubtraction="
				+ autosubtraction + "]";
	}

	
}
