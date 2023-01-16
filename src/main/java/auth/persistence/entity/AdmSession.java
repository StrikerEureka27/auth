package auth.persistence.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "adm_session")
public class AdmSession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "secret_key")
	private String secretKey;
	
	/*
	@OneToMany(mappedBy = "session")
	private List<KrnSession> session;
	*/
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	
	/*
	public List<KrnSession> getSession() {
		return session;
	}

	public void setSession(List<KrnSession> session) {
		this.session = session;
	}*/
}
