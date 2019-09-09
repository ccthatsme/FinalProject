package co.grandcircus.FinalProject.jpaEntity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String email;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pantry_id", referencedColumnName = "id")
    private Pantry pantry;
	
	@ManyToMany
	@JoinTable(
	  name = "user_restriction", 
	  joinColumns = @JoinColumn(name = "user_id"), 
	  inverseJoinColumns = @JoinColumn(name = "restriction_id"))
	List<Restriction> userRestriction;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String email, String password, Pantry pantry,
			List<Restriction> restriction) {
		super();
		this.email = email;
		this.password = password;
		this.pantry = pantry;
		this.userRestriction = restriction;
	}

	public User(Integer id, String email, String password, Pantry pantry, 
			List<Restriction> restriction) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.pantry = pantry;
		this.userRestriction = restriction;
	}
	
	

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Pantry getPantry() {
		return pantry;
	}

	public void setPantry(Pantry pantry) {
		this.pantry = pantry;
	}

	public List<Restriction> getRestriction() {
		return userRestriction;
	}

	public void setRestriction(List<Restriction> restriction) {
		this.userRestriction = restriction;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", pantry=" + pantry
				 + ", restriction=" + userRestriction + "]";
	}
	
	
}
