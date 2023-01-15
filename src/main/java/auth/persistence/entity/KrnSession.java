package auth.persistence.entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "krn_session")
public class KrnSession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name = "end_time")
	private LocalDateTime endTime;
	
	@ManyToOne
	@JoinColumn(name = "user", insertable = false, updatable = false)
	private AdmUser user;
	
	@ManyToOne
	@JoinColumn(name = "session", insertable = false, updatable = false)
	private AdmSession session;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public AdmUser getUser() {
		return user;
	}

	public void setUser(AdmUser user) {
		this.user = user;
	}

	public AdmSession getSession() {
		return session;
	}

	public void setSession(AdmSession session) {
		this.session = session;
	}
}
