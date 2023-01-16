package auth.persistence.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity(name = "adm_user")
public class AdmUser {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "last_name")
	private String lastName;
	
	private String password;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name = "number")
	private Integer number;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "guid")
	private String guid;
	
	@Column(name = "role")
	private Integer roleId;
	
	@ManyToOne
	@JoinColumn(name = "role", insertable = false, updatable = false)
	private AdmRole role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public AdmRole getRole() {
		return role;
	}

	public void setRole(AdmRole role) {
		this.role = role;
	}
	
	public int getRoleId() {
		return roleId;
	}
	
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	
}
