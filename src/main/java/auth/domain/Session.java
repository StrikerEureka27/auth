package auth.domain;

public class Session {
	
	private int idSession;
	private String secretKey;

	public int getIdSession() {
		return idSession;
	}

	public void setIdSession(int idSession) {
		this.idSession = idSession;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
}
