package co.grandcircus.FinalProject.entity.jsonEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    private String food_name;
    private String brand_name;
    private Integer serving_qty;
    private String serving_unit;
    private Integer nf_calories;
    private Integer nf_total_fat;
    private Integer nf_sodium;
    private Integer nf_serving_weight_grams;
    private Integer nf_sugars;
    private Integer nf_protein;
    private Integer nf_total_carbohydrates;
    
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public Product(String food_name, String brand_name, Integer serving_qty, String serving_unit, Integer nf_calories,
			Integer nf_total_fat, Integer nf_sodium, Integer nf_serving_weight_grams, Integer nf_sugars,
			Integer nf_protein, Integer nf_total_carbohydrates) {
		super();
		this.food_name = food_name;
		this.brand_name = brand_name;
		this.serving_qty = serving_qty;
		this.serving_unit = serving_unit;
		this.nf_calories = nf_calories;
		this.nf_total_fat = nf_total_fat;
		this.nf_sodium = nf_sodium;
		this.nf_serving_weight_grams = nf_serving_weight_grams;
		this.nf_sugars = nf_sugars;
		this.nf_protein = nf_protein;
		this.nf_total_carbohydrates = nf_total_carbohydrates;
	}




	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public Integer getServing_qty() {
		return serving_qty;
	}

	public void setServing_qty(Integer serving_qty) {
		this.serving_qty = serving_qty;
	}

	public String getServing_unit() {
		return serving_unit;
	}

	public void setServing_unit(String serving_unit) {
		this.serving_unit = serving_unit;
	}

	public Integer getNf_calories() {
		return nf_calories;
	}

	public void setNf_calories(Integer nf_calories) {
		this.nf_calories = nf_calories;
	}

	public Integer getNf_total_fat() {
		return nf_total_fat;
	}

	public void setNf_total_fat(Integer nf_total_fat) {
		this.nf_total_fat = nf_total_fat;
	}

	public Integer getNf_sodium() {
		return nf_sodium;
	}

	public void setNf_sodium(Integer nf_sodium) {
		this.nf_sodium = nf_sodium;
	}

	public Integer getNf_serving_weight_grams() {
		return nf_serving_weight_grams;
	}

	public void setNf_serving_weight_grams(Integer nf_serving_weight_grams) {
		this.nf_serving_weight_grams = nf_serving_weight_grams;
	}

	public Integer getNf_sugars() {
		return nf_sugars;
	}

	public void setNf_sugars(Integer nf_sugars) {
		this.nf_sugars = nf_sugars;
	}

	public Integer getNf_protein() {
		return nf_protein;
	}

	public void setNf_protein(Integer nf_protein) {
		this.nf_protein = nf_protein;
	}
	
	public Integer getNf_total_carbohydrates() {
		return nf_total_carbohydrates;
	}

	public void setNf_total_carbohydrates(Integer nf_total_carbohydrates) {
		this.nf_total_carbohydrates = nf_total_carbohydrates;
	}

	@Override
	public String toString() {
		return "Product [food_name=" + food_name + ", brand_name=" + brand_name + ", serving_qty=" + serving_qty
				+ ", serving_unit=" + serving_unit + ", nf_calories=" + nf_calories + ", nf_total_fat=" + nf_total_fat
				+ ", nf_sodium=" + nf_sodium + ", nf_serving_weight_grams=" + nf_serving_weight_grams + ", nf_sugars="
				+ nf_sugars + ", nf_protein=" + nf_protein + "]";
	}
    
}