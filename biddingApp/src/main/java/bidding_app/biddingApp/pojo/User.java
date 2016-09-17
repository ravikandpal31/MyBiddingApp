package bidding_app.biddingApp.pojo;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String city;
	private String Country;
	@ElementCollection(fetch=FetchType.EAGER)
	private List<Bet> bet;
	
	public User(String email, String firstName, String lastName, String password, String city, String country,
			List<Bet> bet) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.city = city;
		Country = country;
		this.bet = bet;
	}

	public List<Bet> getBet() {
		return bet;
	}

	public void setBet(List<Bet> bet) {
		this.bet = bet;
	}

	public User( ) {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	
}
