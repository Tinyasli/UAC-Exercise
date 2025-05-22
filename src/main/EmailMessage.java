package main;

public class EmailMessage extends Message {
	public EmailMessage(ILogin logintype, String Pengirim, String Penerima, String text) {
		super(logintype, Pengirim, Penerima, text);
	}

	@Override
	protected void send(String Username, String Credential) {
		// TODO Auto-generated method stub
		if (getLogin().authenticate(Username, Credential)) {
			System.out.println("Email sent from " + getEmailPengirim() + " to " + getEmailPenerima() +": " + getText());
		} else {
			System.out.println("Email authentication failed for user: " + Username);
		}
	}

//	@Override
//	protected void doSend() {
//		System.out.println("Email sent from " + getEmailPengirim() + " to " + getEmailPenerima() +": " + getText());
//	}
//
//	@Override
//	protected void doAuthFail(String username) {
//		// TODO Auto-generated method stub
//		System.out.println("Email authentication failed for user: " + username);
//	}
	
	
}
