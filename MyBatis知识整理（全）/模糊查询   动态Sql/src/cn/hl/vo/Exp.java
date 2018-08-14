package cn.hl.vo;

public class Exp {
	private int minId;
	private int maxId;
	private String account;
	
	public Exp() {
		// TODO Auto-generated constructor stub
	}

	public Exp(int minId, int maxId) {
		this.minId = minId;
		this.maxId = maxId;
	}
	

	public Exp(int minId, int maxId, String account) {
		super();
		this.minId = minId;
		this.maxId = maxId;
		this.account = account;
	}

	public int getMinId() {
		return minId;
	}

	public void setMinId(int minId) {
		this.minId = minId;
	}

	public int getMaxId() {
		return maxId;
	}

	public void setMaxId(int maxId) {
		this.maxId = maxId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Exp [minId=" + minId + ", maxId=" + maxId + ", account="
				+ account + "]";
	}
	
	
}
