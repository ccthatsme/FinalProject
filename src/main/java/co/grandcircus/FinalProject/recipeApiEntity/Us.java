package co.grandcircus.FinalProject.recipeApiEntity;

public class Us {

	private Double unit;
	private Double value;
	
	public Us() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Us(Double unit, Double value) {
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
		return "Us [unit=" + unit + ", value=" + value + "]";
	}
	
	
}
