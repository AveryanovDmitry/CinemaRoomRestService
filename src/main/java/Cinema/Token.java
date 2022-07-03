package Cinema;

public class Token {
    private String token;
    public Token(String token){
        this.token = token;
    }

    public boolean equals(Token obj) {
        return token.equals(obj.getToken());
    }

    public boolean equals(String obj) {
        return token.equals(obj);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
