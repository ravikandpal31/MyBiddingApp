package bidding_app.biddingApp.pojo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bet {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int id;
	private int amount;
	private String product;
	public int getAmount() {
		return amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	
}
