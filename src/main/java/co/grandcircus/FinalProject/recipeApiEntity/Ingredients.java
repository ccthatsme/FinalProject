package co.grandcircus.FinalProject.recipeApiEntity;

import javax.persistence.Entity;

@Entity
public class Ingredients {

	private Double totalCost;
	private Double totalCostPerServing;
	Amount amount;
	
	public Ingredients() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ingredients(Double totalCost, Double totalCostPerServing, Amount amount) {
		super();
		this.totalCost = totalCost;
		this.totalCostPerServing = totalCostPerServing;
		this.amount = amount;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public Double getTotalCostPerServing() {
		return totalCostPerServing;
	}

	public void setTotalCostPerServing(Double totalCostPerServing) {
		this.totalCostPerServing = totalCostPerServing;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Ingredients [totalCost=" + totalCost + ", totalCostPerServing=" + totalCostPerServing + ", amount="
				+ amount + "]";
	}
	
}
