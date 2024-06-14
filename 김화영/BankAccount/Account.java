package BankAccount;

import java.util.Scanner;

public class Account {
 
	private String account_num;
	private String name;
	private int balance;
	private int money;

	
	public Account() {
		
	}
	public Account(String account_num, String name, int balance) {
		this.account_num = account_num;
		this.name = name;
		this.balance = balance;
	
	}

	public String getAccount_num() {
		return account_num;
	}

	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

	
	

	
}


