package main;

public class SMSMessage extends Message {

	public SMSMessage(ILogin logintype, String Pengirim, String Penerima, String text) {
		super(logintype, Pengirim, Penerima, text);
	}

//	@Override
//	protected void doSend() {
//		System.out.println("SMS sent from " + getEmailPengirim() + " to " + getEmailPenerima() +": " + getText());
//	}
//	
//	@Override
//	protected void doAuthFail(String username) {
//		// TODO Auto-generated method stub
//		System.out.println("SMS authentication failed for user: " + username);
//	}

	@Override
	protected void send(String Username, String Credential) {
		if (getLogin().authenticate(Username, Credential)) {
			System.out.println("SMS sent from " + getEmailPengirim() + " to " + getEmailPenerima() +": " + getText());
		} else {
			System.out.println("SMS authentication failed for user: " + Username);
		}
	}

	
}
