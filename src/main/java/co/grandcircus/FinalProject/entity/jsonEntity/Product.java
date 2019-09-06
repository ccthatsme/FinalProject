package co.grandcircus.FinalProject.entity.jsonEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    private String item_id;
    private String item_name;
    private String brand_id;
    private String brand_name;
    private String item_description;
    //private List<Nutrition> nutris;
    //private List<Allergens> allergy;
    private String nf_ingredient_statement;
    private Integer nf_calories;
    private Integer nf_calories_from_fat;
    private Integer nf_total_fat;
    private Integer nf_sodium;
    private Integer nf_total_carbohydrate;
    private Integer nf_dietary_fiber;
    private Double nf_servings_per_container;
    private Double nf_serving_size_qty;
    private String nf_serving_size_unit;
    private Integer nf_serving_weight_grams;
    private Integer nf_saturated_fat;
    private Integer nf_trans_fatty_acid;
    private Integer nf_cholesterol;
    private Integer nf_sugars;
    private Integer nf_protein;
    private Integer nf_vitamin_a_dv;
    private Integer nf_vitamin_c_dv;
    private Integer nf_calcium_dv;
    private Integer nf_iron_dv;
    
   
    
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    



	public Product(String item_id, String item_name, String brand_id, String brand_name, String item_description,
			String nf_ingredient_statement, Integer nf_calories, Integer nf_calories_from_fat, Integer nf_total_fat,
			Integer nf_sodium, Integer nf_total_carbohydrate, Integer nf_dietary_fiber,
			Double nf_servings_per_container, Double nf_serving_size_qty, String nf_serving_size_unit,
			Integer nf_serving_weight_grams, Integer nf_saturated_fat, Integer nf_trans_fatty_acid,
			Integer nf_cholesterol, Integer nf_sugars, Integer nf_protein, Integer nf_vitamin_a_dv,
			Integer nf_vitamin_c_dv, Integer nf_calcium_dv, Integer nf_iron_dv) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.brand_id = brand_id;
		this.brand_name = brand_name;
		this.item_description = item_description;
		this.nf_ingredient_statement = nf_ingredient_statement;
		this.nf_calories = nf_calories;
		this.nf_calories_from_fat = nf_calories_from_fat;
		this.nf_total_fat = nf_total_fat;
		this.nf_sodium = nf_sodium;
		this.nf_total_carbohydrate = nf_total_carbohydrate;
		this.nf_dietary_fiber = nf_dietary_fiber;
		this.nf_servings_per_container = nf_servings_per_container;
		this.nf_serving_size_qty = nf_serving_size_qty;
		this.nf_serving_size_unit = nf_serving_size_unit;
		this.nf_serving_weight_grams = nf_serving_weight_grams;
		this.nf_saturated_fat = nf_saturated_fat;
		this.nf_trans_fatty_acid = nf_trans_fatty_acid;
		this.nf_cholesterol = nf_cholesterol;
		this.nf_sugars = nf_sugars;
		this.nf_protein = nf_protein;
		this.nf_vitamin_a_dv = nf_vitamin_a_dv;
		this.nf_vitamin_c_dv = nf_vitamin_c_dv;
		this.nf_calcium_dv = nf_calcium_dv;
		this.nf_iron_dv = nf_iron_dv;
	}





	public String getItem_id() {
        return item_id;
    }
    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }
    public String getItem_name() {
        return item_name;
    }
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }
    public String getBrand_id() {
        return brand_id;
    }
    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }
    public String getBrand_name() {
        return brand_name;
    }
    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }
    public String getItem_description() {
        return item_description;
    }
    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }
    
    public String getNf_ingredient_statement() {
		return nf_ingredient_statement;
	}

	public void setNf_ingredient_statement(String nf_ingredient_statement) {
		this.nf_ingredient_statement = nf_ingredient_statement;
	}

	public Integer getNf_calories() {
		return nf_calories;
	}

	public void setNf_calories(Integer nf_calories) {
		this.nf_calories = nf_calories;
	}

	public Integer getNf_calories_from_fat() {
		return nf_calories_from_fat;
	}

	public void setNf_calories_from_fat(Integer nf_calories_from_fat) {
		this.nf_calories_from_fat = nf_calories_from_fat;
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

	public Integer getNf_total_carbohydrate() {
		return nf_total_carbohydrate;
	}

	public void setNf_total_carbohydrate(Integer nf_total_carbohydrate) {
		this.nf_total_carbohydrate = nf_total_carbohydrate;
	}

	public Integer getNf_dietary_fiber() {
		return nf_dietary_fiber;
	}

	public void setNf_dietary_fiber(Integer nf_dietary_fiber) {
		this.nf_dietary_fiber = nf_dietary_fiber;
	}

	public Double getNf_servings_per_container() {
		return nf_servings_per_container;
	}

	public void setNf_servings_per_container(Double nf_servings_per_container) {
		this.nf_servings_per_container = nf_servings_per_container;
	}

	public Double getNf_serving_size_qty() {
		return nf_serving_size_qty;
	}

	public void setNf_serving_size_qty(Double nf_serving_size_qty) {
		this.nf_serving_size_qty = nf_serving_size_qty;
	}

	public String getNf_serving_size_unit() {
		return nf_serving_size_unit;
	}

	public void setNf_serving_size_unit(String nf_serving_size_unit) {
		this.nf_serving_size_unit = nf_serving_size_unit;
	}

	public Integer getNf_serving_weight_grams() {
		return nf_serving_weight_grams;
	}

	public void setNf_serving_weight_grams(Integer nf_serving_weight_grams) {
		this.nf_serving_weight_grams = nf_serving_weight_grams;
	}





	public Integer getNf_saturated_fat() {
		return nf_saturated_fat;
	}





	public void setNf_saturated_fat(Integer nf_saturated_fat) {
		this.nf_saturated_fat = nf_saturated_fat;
	}





	public Integer getNf_trans_fatty_acid() {
		return nf_trans_fatty_acid;
	}





	public void setNf_trans_fatty_acid(Integer nf_trans_fatty_acid) {
		this.nf_trans_fatty_acid = nf_trans_fatty_acid;
	}





	public Integer getNf_cholesterol() {
		return nf_cholesterol;
	}





	public void setNf_cholesterol(Integer nf_cholesterol) {
		this.nf_cholesterol = nf_cholesterol;
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





	public Integer getNf_vitamin_a_dv() {
		return nf_vitamin_a_dv;
	}





	public void setNf_vitamin_a_dv(Integer nf_vitamin_a_dv) {
		this.nf_vitamin_a_dv = nf_vitamin_a_dv;
	}





	public Integer getNf_vitamin_c_dv() {
		return nf_vitamin_c_dv;
	}





	public void setNf_vitamin_c_dv(Integer nf_vitamin_c_dv) {
		this.nf_vitamin_c_dv = nf_vitamin_c_dv;
	}





	public Integer getNf_calcium_dv() {
		return nf_calcium_dv;
	}





	public void setNf_calcium_dv(Integer nf_calcium_dv) {
		this.nf_calcium_dv = nf_calcium_dv;
	}





	public Integer getNf_iron_dv() {
		return nf_iron_dv;
	}





	public void setNf_iron_dv(Integer nf_iron_dv) {
		this.nf_iron_dv = nf_iron_dv;
	}





	@Override
	public String toString() {
		return "Product [item_id=" + item_id + ", item_name=" + item_name + ", brand_id=" + brand_id + ", brand_name="
				+ brand_name + ", item_description=" + item_description + ", nf_ingredient_statement="
				+ nf_ingredient_statement + ", nf_calories=" + nf_calories + ", nf_calories_from_fat="
				+ nf_calories_from_fat + ", nf_total_fat=" + nf_total_fat + ", nf_sodium=" + nf_sodium
				+ ", nf_total_carbohydrate=" + nf_total_carbohydrate + ", nf_dietary_fiber=" + nf_dietary_fiber
				+ ", nf_servings_per_container=" + nf_servings_per_container + ", nf_serving_size_qty="
				+ nf_serving_size_qty + ", nf_serving_size_unit=" + nf_serving_size_unit + ", nf_serving_weight_grams="
				+ nf_serving_weight_grams + ", nf_saturated_fat=" + nf_saturated_fat + ", nf_trans_fatty_acid="
				+ nf_trans_fatty_acid + ", nf_cholesterol=" + nf_cholesterol + ", nf_sugars=" + nf_sugars
				+ ", nf_protein=" + nf_protein + ", nf_vitamin_a_dv=" + nf_vitamin_a_dv + ", nf_vitamin_c_dv="
				+ nf_vitamin_c_dv + ", nf_calcium_dv=" + nf_calcium_dv + ", nf_iron_dv=" + nf_iron_dv
				+ ", getItem_id()=" + getItem_id() + ", getItem_name()=" + getItem_name() + ", getBrand_id()="
				+ getBrand_id() + ", getBrand_name()=" + getBrand_name() + ", getItem_description()="
				+ getItem_description() + ", getNf_ingredient_statement()=" + getNf_ingredient_statement()
				+ ", getNf_calories()=" + getNf_calories() + ", getNf_calories_from_fat()=" + getNf_calories_from_fat()
				+ ", getNf_total_fat()=" + getNf_total_fat() + ", getNf_sodium()=" + getNf_sodium()
				+ ", getNf_total_carbohydrate()=" + getNf_total_carbohydrate() + ", getNf_dietary_fiber()="
				+ getNf_dietary_fiber() + ", getNf_servings_per_container()=" + getNf_servings_per_container()
				+ ", getNf_serving_size_qty()=" + getNf_serving_size_qty() + ", getNf_serving_size_unit()="
				+ getNf_serving_size_unit() + ", getNf_serving_weight_grams()=" + getNf_serving_weight_grams()
				+ ", getNf_saturated_fat()=" + getNf_saturated_fat() + ", getNf_trans_fatty_acid()="
				+ getNf_trans_fatty_acid() + ", getNf_cholesterol()=" + getNf_cholesterol() + ", getNf_sugars()="
				+ getNf_sugars() + ", getNf_protein()=" + getNf_protein() + ", getNf_vitamin_a_dv()="
				+ getNf_vitamin_a_dv() + ", getNf_vitamin_c_dv()=" + getNf_vitamin_c_dv() + ", getNf_calcium_dv()="
				+ getNf_calcium_dv() + ", getNf_iron_dv()=" + getNf_iron_dv() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
    
}