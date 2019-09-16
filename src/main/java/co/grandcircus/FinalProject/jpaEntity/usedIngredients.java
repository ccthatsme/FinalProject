package co.grandcircus.FinalProject.jpaEntity;

import java.util.List;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class usedIngredients {
	
	private Integer id;
	private Integer amount;
	private String unit;
	private String unitShort;
	private String aisle;
	private String name;
	private String original;
	private String originalString;
	private String originalName;
	private List<metaInformation> metaInformation;
	public usedIngredients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public usedIngredients(Integer id, Integer amount, String unit, String unitShort, String aisle, String name,
			String original, String originalString, String originalName,
			List<co.grandcircus.FinalProject.jpaEntity.metaInformation> metaInformation) {
		super();
		this.id = id;
		this.amount = amount;
		this.unit = unit;
		this.unitShort = unitShort;
		this.aisle = aisle;
		this.name = name;
		this.original = original;
		this.originalString = originalString;
		this.originalName = originalName;
		this.metaInformation = metaInformation;
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
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getUnitShort() {
		return unitShort;
	}
	public void setUnitShort(String unitShort) {
		this.unitShort = unitShort;
	}
	public String getAisle() {
		return aisle;
	}
	public void setAisle(String aisle) {
		this.aisle = aisle;
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
	public String getOriginalString() {
		return originalString;
	}
	public void setOriginalString(String originalString) {
		this.originalString = originalString;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public List<metaInformation> getMetaInformation() {
		return metaInformation;
	}
	public void setMetaInformation(List<metaInformation> metaInformation) {
		this.metaInformation = metaInformation;
	}
	@Override
	public String toString() {
		return "usedIngredients [id=" + id + ", amount=" + amount + ", unit=" + unit + ", unitShort=" + unitShort
				+ ", aisle=" + aisle + ", name=" + name + ", original=" + original + ", originalString="
					+ originalString + ", originalName=" + originalName + ", metaInformation=" + metaInformation + "]";
	}
	
	

}
