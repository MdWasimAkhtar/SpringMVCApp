package springApp.controller.Client;
import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int usrid;
	
	private String userName;
	private String emailaddress;
	private String passwd;
	
	public User(){
		super();
	}

	public User(String userName, String emailaddress, String passwd) {
		super();
		this.userName = userName;
		this.emailaddress = emailaddress;
		this.passwd = passwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", emailaddress=" + emailaddress + ", passwd=" + passwd + "]";
	}
   
	

}
