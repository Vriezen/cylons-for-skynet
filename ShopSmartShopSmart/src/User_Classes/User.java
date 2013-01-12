package User_Classes;
import java.util.List;

public class User {
	
	//Constants to be implemented in every type of user
	protected String firstName;
	protected String lastName;
	protected String userName;
	protected int levelOfProficiency;
	protected String userLanguageGreeting;
	protected List<String> friendsList;
	protected List<String> languageList;
	protected String languageForGreeting;
	
	//Getter Methods
	public String getFirstName(){return this.firstName;}
	public String getLastName(){return this.lastName;}
	public String getUserName(){return this.userName;}
	public int getLevelOfProficiency(){return this.levelOfProficiency;}
	public String getGreeting(){return this.userLanguageGreeting;}
	public String getLanguageForGreeting(){return this.languageForGreeting;}
	
	//Setter Methods
	protected void setFirstName(String firstName){this.firstName = firstName;}
	protected void setLastName(String lastName){this.lastName = lastName;}
	protected void setUserName(String userName){this.userName = userName;}
	protected void setLevelOfProficiency(int value){this.levelOfProficiency = value;}
	protected void setUserLanguageGreeting(String greeting){this.userLanguageGreeting = greeting;}
	protected void setLanguageForGreeting(String lang){this.languageForGreeting = lang;}
	
	//Other Methods
	protected void addFriend(User user)
	{
		this.friendsList.add(user.userName);
	}
	
	protected void removeFriend(User user)
	{
		this.friendsList.remove(user.userName);
	}
	
	protected void addLanguage(String lang)
	{
		this.languageList.add(lang);
	}
	
	protected void removeLanguage(String lang)
	{
		this.languageList.remove(lang);
	}
	
	public boolean isFriendsWith(User user)
	{
		if(this.friendsList.contains(user.getUserName()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	

}
