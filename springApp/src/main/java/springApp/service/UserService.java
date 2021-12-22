package springApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springApp.controller.Client.User;
import springApp.userDao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao usrDao;
	
	public int createUSer(User user ) {
		return this.usrDao.saveUser(user);
	}

}
