package main;

public class BasicLogin implements ILogin {
	private String userName;
	private String passWord;
	
	public BasicLogin(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	
	 @Override
    public boolean authenticate(String username, String credential) {
        return userName.equals(username) && passWord.equals(credential);
    }
	
}
