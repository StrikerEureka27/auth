package auth.domain;

import auth.persistence.entity.AdmRole;

public class User {
	
	private int userId;
	private String userName;
	private String userFirstName;
	private String userLastName;
	private String userPassword;
	private boolean userStatus;
	private int phone;
	private String guidCode;
	private AdmRole role;
	private int roleId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isUserStatus() {
		return userStatus;
	}

	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getGuidCode() {
		return guidCode;
	}

	public void setGuidCode(String guidCode) {
		this.guidCode = guidCode;
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

	public void setRoleId(int role) {
		this.roleId = role;
	}
}
