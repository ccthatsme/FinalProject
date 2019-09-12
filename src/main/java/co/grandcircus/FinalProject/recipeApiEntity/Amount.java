package co.grandcircus.FinalProject.recipeApiEntity;

public class Amount {

	private String image;
	private String name;
	private Double price;
	Metric metric;
	Us us;
	
	public Amount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Amount(String image, String name, Double price, Metric metric, Us us) {
		super();
		this.image = image;
		this.name = name;
		this.price = price;
		this.metric = metric;
		this.us = us;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Metric getMetric() {
		return metric;
	}

	public void setMetric(Metric metric) {
		this.metric = metric;
	}

	public Us getUs() {
		return us;
	}

	public void setUs(Us us) {
		this.us = us;
	}

	@Override
	public String toString() {
		return "Amount [image=" + image + ", name=" + name + ", price=" + price + ", metric=" + metric + ", us=" + us
				+ "]";
	}
	
}
