package com.yedam.lhw.classes;

public class Account0203 {
	private String ano;
	private String owner;
	private int balance;

	public Account0203(String ano, String owner, int balance) { // 생성자 만듬
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int amount) {
		if (amount >= 10 && amount <= 100000) {
			balance = balance + amount;
		} else {
			balance = balance + 0;

		}
	}

	public void withdrawBalance(int amount) {
		if (amount >= 10 && amount <= 10000) {
			balance = balance - amount;
		} else {
			balance = balance - 0;

		}
	}

	@Override
	public String toString() {

		
		return "Accout [" + "계좌번호:" + ano + "," + " 이름:" + owner + "," + " 잔액:" + balance + "]";
			
	}
}
