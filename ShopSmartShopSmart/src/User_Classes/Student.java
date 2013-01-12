package User_Classes;
import java.util.List;


public class Student extends User {

	public Student() {}
	public Student(String firstName, String lastName, String userName, int profVal, List<String> langs)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.levelOfProficiency = profVal;
		this.friendsList = null;
		this.languageList = langs;
		this.userLanguageGreeting = "Hello, "; //Will need to change this to query database for correct greeting!
	}

}
