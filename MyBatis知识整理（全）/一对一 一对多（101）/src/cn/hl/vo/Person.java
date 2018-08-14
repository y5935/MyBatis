package cn.hl.vo;

public class Person {
	private int personId;
	private String personName;
	//表中外键列对应的实体类型
	private IdCard cardId;
	
	public Person() {
	}

	public Person(int personId, String personName, IdCard cardId) {
		this.personId = personId;
		this.personName = personName;
		this.cardId = cardId;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public IdCard getCardId() {
		return cardId;
	}

	public void setCardId(IdCard cardId) {
		this.cardId = cardId;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName
				+ ", cardId=" + cardId + "]";
	}
	
}
