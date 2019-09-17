package co.grandcircus.FinalProject.jpaEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PossibleRecipe {
	
	private Integer id;
	private String title;
	private String image;
	private Integer usedIngredientCount;
	private Integer missedIngredientCount;
	private String sourceUrl;
	private List<missedIngredients> missedIngredients;
	private List<usedIngredients> usedIngredients;
	
	public PossibleRecipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PossibleRecipe(Integer id, String title, String image, Integer usedIngredientCount,
			Integer missedIngredientCount, String sourceUrl,
			List<co.grandcircus.FinalProject.jpaEntity.missedIngredients> missedIngredients,
			List<co.grandcircus.FinalProject.jpaEntity.usedIngredients> usedIngredients) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.usedIngredientCount = usedIngredientCount;
		this.missedIngredientCount = missedIngredientCount;
		this.sourceUrl = sourceUrl;
		this.missedIngredients = missedIngredients;
		this.usedIngredients = usedIngredients;
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
	
	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "PossibleRecipe [title=" + title + ", image=" + image + ", usedIngredientCount=" + usedIngredientCount
				+ ", missedIngredientCount=" + missedIngredientCount + ", sourceUrl=" + sourceUrl
				+ ", missedIngredients=" + missedIngredients + ", usedIngredients=" + usedIngredients + "]";
	}



}
