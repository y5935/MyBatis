package cn.hl.vo;

public class Person {
	private int personId;
	private String name;
	private IdCard cardId;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String name, IdCard cardId) {
		this.personId = personId;
		this.name = name;
		this.cardId = cardId;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IdCard getCardId() {
		return cardId;
	}

	public void setCardId(IdCard cardId) {
		this.cardId = cardId;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", cardId="
				+ cardId + "]";
	}
	
}
