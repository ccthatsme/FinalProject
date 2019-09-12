package co.grandcircus.FinalProject.recipeApiEntity;

public class UsedIngredients {

	private Integer id;
	private Integer amount;
	private String image;
	private String name;
	private String original;
	private Integer unit;
	
	public UsedIngredients() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedIngredients(Integer id, Integer amount, String image, String name, String original, Integer unit) {
		super();
		this.id = id;
		this.amount = amount;
		this.image = image;
		this.name = name;
		this.original = original;
		this.unit = unit;
	}

	public UsedIngredients(Integer amount, String image, String name, String original, Integer unit) {
		super();
		this.amount = amount;
		this.image = image;
		this.name = name;
		this.original = original;
		this.unit = unit;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "UsedIngredients [id=" + id + ", amount=" + amount + ", image=" + image + ", name=" + name
				+ ", original=" + original + ", unit=" + unit + "]";
	}
	
	
}
