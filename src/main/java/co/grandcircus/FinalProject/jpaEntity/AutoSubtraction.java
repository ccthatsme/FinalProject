package co.grandcircus.FinalProject.jpaEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AutoSubtraction {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Double quantity;
	private String quantityUnit;
	private Integer frequency;
	
	@ManyToOne
	@JoinColumn(name="pantry_fk", insertable=false, updatable=false) //These false values are because this data should only 
	//be managed from the team table
	private Pantry pantry;
	
	@ManyToOne
	@JoinColumn(name="food_fk", insertable=false, updatable=false) //These false values are because this data should only 
	//be managed from the team table
	private Food food;

	public AutoSubtraction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AutoSubtraction(Double quantity, String quantityUnit, Integer frequency, Pantry pantry, Food food) {
		super();
		this.quantity = quantity;
		this.quantityUnit = quantityUnit;
		this.frequency = frequency;
		this.pantry = pantry;
		this.food = food;
	}

	public AutoSubtraction(Integer id, Double quantity, String quantityUnit, Integer frequency, Pantry pantry,
			Food food) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.quantityUnit = quantityUnit;
		this.frequency = frequency;
		this.pantry = pantry;
		this.food = food;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public Integer getFrequency() {
		return frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	public Pantry getPantry() {
		return pantry;
	}

	public void setPantry(Pantry pantry) {
		this.pantry = pantry;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "AutoSubtraction [id=" + id + ", quantity=" + quantity + ", quantityUnit=" + quantityUnit
				+ ", frequency=" + frequency + ", pantry=" + pantry.getUser().getEmail() + ", food=" + food.getId() + "]";
	}
	
	
}
