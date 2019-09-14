package co.grandcircus.FinalProject.jpaEntity;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties
public class metaInformation {
	private String image;

	public metaInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public metaInformation(String image) {
		super();
		this.image = image;
	}

	@Override
	public String toString() {
		return "metaInformation [image=" + image + "]";
	}
	
	

}
