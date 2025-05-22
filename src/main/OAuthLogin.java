package main;

public class OAuthLogin implements ILogin {
	private String token;

	public OAuthLogin(String token) {
		this.token = token;
	}

	@Override
	public boolean authenticate(String username, String credential) {
		return this.token.equals(credential);
	}
}
