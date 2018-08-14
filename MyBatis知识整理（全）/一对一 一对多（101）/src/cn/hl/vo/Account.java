package cn.hl.vo;

public class Account {
	private String cardNo;
	private int personId;
	private int blance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String cardNo, int personId, int blance) {
		this.cardNo = cardNo;
		this.personId = personId;
		this.blance = blance;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getBlance() {
		return blance;
	}

	public void setBlance(int blance) {
		this.blance = blance;
	}

	@Override
	public String toString() {
		return "Account [cardNo=" + cardNo + ", personId=" + personId
				+ ", blance=" + blance + "]";
	}
	
}
