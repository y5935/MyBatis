package cn.hl.vo;

import java.util.List;

public class Person2 {
	private int personId;
	private String personName;
	private List<Account> cards;
	
	public Person2() {
		// TODO Auto-generated constructor stub
	}

	public Person2(int personId, String personName, List<Account> cards) {
		this.personId = personId;
		this.personName = personName;
		this.cards = cards;
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

	public List<Account> getCards() {
		return cards;
	}

	public void setCards(List<Account> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Person2 [personId=" + personId + ", personName=" + personName
				+ ", cards=" + cards + "]";
	}
}
