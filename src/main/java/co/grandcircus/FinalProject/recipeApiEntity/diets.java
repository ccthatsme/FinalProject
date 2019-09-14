package co.grandcircus.FinalProject.recipeApiEntity;

public class diets {

	private Boolean glutenFree;
	private Boolean ketogenic;
	private Boolean lowFodmap;
	
	public diets() {
		super();
		// TODO Auto-generated constructor stub
	}

	public diets(Boolean glutenFree, Boolean ketogenic, Boolean lowFodmap) {
		super();
		this.glutenFree = glutenFree;
		this.ketogenic = ketogenic;
		this.lowFodmap = lowFodmap;
	}

	public Boolean getGlutenFree() {
		return glutenFree;
	}

	public void setGlutenFree(Boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

	public Boolean getKetogenic() {
		return ketogenic;
	}

	public void setKetogenic(Boolean ketogenic) {
		this.ketogenic = ketogenic;
	}

	public Boolean getLowFodmap() {
		return lowFodmap;
	}

	public void setLowFodmap(Boolean lowFodmap) {
		this.lowFodmap = lowFodmap;
	}

	@Override
	public String toString() {
		return "diets [glutenFree=" + glutenFree + ", ketogenic=" + ketogenic + ", lowFodmap=" + lowFodmap + "]";
	}
	
	
}
