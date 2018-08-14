package cn.hl.vo;

public class User {
	private int userId;
	private String account;
	private String pwd;
	private String userName;
	private int age;
	private boolean gender;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String account, String pwd, String userName,
			int age, boolean gender) {
		super();
		this.userId = userId;
		this.account = account;
		this.pwd = pwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", account=" + account + ", pwd="
				+ pwd + ", userName=" + userName + ", age=" + age + ", gender="
				+ gender + "]";
	}
}
