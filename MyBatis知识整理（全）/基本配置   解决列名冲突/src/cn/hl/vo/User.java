package cn.hl.vo;

public class User {
	private int id;
	private String account;
	private String name;
	private String password;
	private int age;
	private boolean gender;
	
	public User() {
	}

	public User(int id, String account, String name, String password, int age,
			boolean gender) {
		this.id = id;
		this.account = account;
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "User [id=" + id + ", account=" + account + ", name=" + name
				+ ", password=" + password + ", age=" + age + ", gender="
				+ gender + "]";
	}
	
}
