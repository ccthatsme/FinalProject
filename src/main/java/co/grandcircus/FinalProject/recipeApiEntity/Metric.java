package co.grandcircus.FinalProject.recipeApiEntity;

public class Metric {

	private Double unit;
	private Double value;
	
	public Metric() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Metric(Double unit, Double value) {
		super();
		this.unit = unit;
		this.value = value;
	}

	public Double getUnit() {
		return unit;
	}

	public void setUnit(Double unit) {
		this.unit = unit;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Metric [unit=" + unit + ", value=" + value + "]";
	}
	
}
