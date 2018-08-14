package cn.hl.vo;

public class IdCard {
	private String cardId;
	private String address;
	
	public IdCard() {
		// TODO Auto-generated constructor stub
	}

	public IdCard(String cardId, String address) {
		this.cardId = cardId;
		this.address = address;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "IdCard [cardId=" + cardId + ", address=" + address + "]";
	}
}
