package cn.hl.vo;

public class IdCard {
	private int cardId;
	private String cardNo;
	private int state;
	
	public IdCard() {
		// TODO Auto-generated constructor stub
	}

	public IdCard(int cardId, String cardNo, int state) {
		this.cardId = cardId;
		this.cardNo = cardNo;
		this.state = state;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "IdCard [cardId=" + cardId + ", cardNo=" + cardNo + ", state="
				+ state + "]";
	}
}
