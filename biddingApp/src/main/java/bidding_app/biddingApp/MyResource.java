package bidding_app.biddingApp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bidding_app.biddingApp.Dao.DaoUtil;
import bidding_app.biddingApp.pojo.User;

@Component
@Path("myresource")
public class MyResource {

  
	@Autowired
	DaoUtil d;
	

	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String InsertData() {
		User u=new User("jaideepsharma32@gmail.com", "Jaideep", "Sharma", "jaideep", "pilani", "India", null);
		
		if(d.insertData(u).equals(1)){
			
			return u.getFirstName()+" "+u.getLastName()+" your resgistration is successful";
		}
		else{
			
			return "Registration was unsuccessful";
		}
    	
    }
}
