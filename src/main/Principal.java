package main;

public class Principal {
    private String username;
    private String credential;

    public Principal(String username, String credential) {
        this.username = username;
        this.credential = credential;
    }

    public String getUsername() {
        return username;
    }

    public String getCredential() {
        return credential;
    }
}

