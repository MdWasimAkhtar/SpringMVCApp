package springApp.userDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springApp.controller.Client.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	public UserDao() {
		super();
	}
	
	@Transactional
	public int saveUser(User user) {
     Integer saveUserNo  = (Integer) this.hibernatetemplate.save(user);
     return saveUserNo;
	}
	
	
}
