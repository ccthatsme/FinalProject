package co.grandcircus.FinalProject.jpaEntity;

import java.util.List;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class PossibleRecipe {
	
	private Integer id;
	private String title;
	private String image;
	private Integer usedIngredientCount;
	private Integer missedIngredientCount;
	private List<missedIngredients> missedIngredients;
	private List<usedIngredients> usedIngredients;
	
	public PossibleRecipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PossibleRecipe(Integer id, String title, String image, Integer usedIngredientCount,
			Integer missedIngredientCount,
			List<co.grandcircus.FinalProject.jpaEntity.missedIngredients> missedIngredients,
			List<co.grandcircus.FinalProject.jpaEntity.usedIngredients> usedIngredients) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.usedIngredientCount = usedIngredientCount;
		this.missedIngredientCount = missedIngredientCount;
		this.missedIngredients = missedIngredients;
		this.usedIngredients = usedIngredients;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getUsedIngredientCount() {
		return usedIngredientCount;
	}

	public void setUsedIngredientCount(Integer usedIngredientCount) {
		this.usedIngredientCount = usedIngredientCount;
	}

	public Integer getMissedIngredientCount() {
		return missedIngredientCount;
	}

	public void setMissedIngredientCount(Integer missedIngredientCount) {
		this.missedIngredientCount = missedIngredientCount;
	}

	public List<missedIngredients> getMissedIngredients() {
		return missedIngredients;
	}

	public void setMissedIngredients(List<missedIngredients> missedIngredients) {
		this.missedIngredients = missedIngredients;
	}

	public List<usedIngredients> getUsedIngredients() {
		return usedIngredients;
	}

	public void setUsedIngredients(List<usedIngredients> usedIngredients) {
		this.usedIngredients = usedIngredients;
	}

	@Override
	public String toString() {
		return "PossibleRecipe [id=" + id + ", title=" + title + ", image=" + image + ", usedIngredientCount="
				+ usedIngredientCount + ", missedIngredientCount=" + missedIngredientCount + ", missedIngredients="
				+ missedIngredients + ", usedIngredients=" + usedIngredients + "]";
	} 
	
	

}
