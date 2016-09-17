package bidding_app.biddingApp.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import bidding_app.biddingApp.pojo.User;
@Component
public class DaoUtil {
	@Autowired
	@Qualifier(value="sessionfactory")
	private SessionFactory sf;
	
	public void insertData(User u){

		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(u);
		
		t.commit();
		
	}
	public User getData(int id){
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		User u=(User) s.get(User.class, id);
		
		t.commit();
		return u;
		
		
	}
}
