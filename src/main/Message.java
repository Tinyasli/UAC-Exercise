package main;
// Abstract adalah class yang wujudnya tidak ada pengkategorian
// harus implement di anak nya
public abstract class Message{
	private ILogin login;
	private String pengirim;
	private String Penerima;
	private String text;
	
	public Message(ILogin logintype, String emailPengirim, String emailPenerima, String text) {
		this.login = logintype;
		this.pengirim = emailPengirim;
		this.Penerima = emailPenerima;
		this.text = text;
	}
	

	public ILogin getLogin() {
		return login;
	}


	public void setLogin(ILogin login) {
		this.login = login;
	}


	public String getEmailPengirim() {
		return pengirim;
	}


	public void setEmailPengirim(String emailPengirim) {
		this.pengirim = emailPengirim;
	}


	public String getEmailPenerima() {
		return Penerima;
	}


	public void setEmailPenerima(String emailPenerima) {
		this.Penerima = emailPenerima;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	protected abstract void send(String Username, String Credential);


//	public void send(String username, String Credential) {
//        if (this.login.authenticate(username, Credential)) {
//            doSend();
//        } else {
//            doAuthFail(username);
//        }
//        
//    }
////	
//	
//	protected abstract void doAuthFail(String username);
//	protected abstract void doSend();
	
	
	
}
