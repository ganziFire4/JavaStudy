package chap00_practice;

import java.util.Scanner;

public class Account {
	public int balance;
	public String accountNum;
	public String accountName;
	public int initDeposit;
	
	public Account() {
		
	}
	
	public Account(String accountNum, String accountName, int initDeposit) {
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.balance = initDeposit;
	}
	
	public int getBalance() {
		return balance;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public String getAccountName() {
		return accountName;
	}

	public int getInitDeposit() {
		return initDeposit;
	}
	
	public void createAccount(Account[] accounts, int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		
		System.out.println("계좌번호");
		accountNum = sc.nextLine();
		System.out.println("계좌주");
		accountName = sc.nextLine();
		System.out.println("초기 입금액");
		initDeposit = balance + sc.nextInt();
		
		if(accountNum != null && accountName != null && initDeposit > 0) {
			accounts[count] = new Account(accountNum, accountName, initDeposit);
			System.out.println("결과 : 계좌가 생성되었습니다.");
		}
	}

	public void accountList(Account[] accounts, int count) {
		System.out.println("계좌목록");
		System.out.println("-------------");
		
		for(int i = 0; i < count; i++) {
			System.out.println(accounts[i].getAccountNum() + "   " 
		+ accounts[i].getAccountName() + "   " + accounts[i].getBalance());
		}
		System.out.println(count);
	}
	
	public void deposit(Account[] accounts, int count) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("예금");
	    System.out.println("-------------");
	    System.out.println("계좌번호: ");
	    String accountNum = sc.nextLine();
	    System.out.println("예금액 : ");
	    int money = sc.nextInt();

	    for(int i = 0; i < count; i++) {
	        if(accountNum.equals(accounts[i].getAccountNum())) {
	            if(money > 0) {
	                accounts[i].balance += money;
	                return;
	            } else {
	                System.out.println("입금액은 0보다 커야합니다.");
	                return;
	            }
	        }
	    }
	    System.out.println("계좌를 찾지 못했습니다.");
	}
	
	public void withdraw(Account[] accounts, int count) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("출금");
	    System.out.println("-------------");
	    System.out.println("계좌번호: ");
	    String num = sc.nextLine();
	    System.out.println("출금액 : ");
	    int money = sc.nextInt();

	    for(int i = 0; i < count; i++) {
	        if(num.equals(accounts[i].getAccountNum())) {
	            if(money > 0 && money <= accounts[i].getBalance()) {
	                accounts[i].balance -= money;
	                System.out.println("결과 : 출금이 성공되었습니다.");
	                return;
	            } else if (money <= 0) {
	                System.out.println("출금액은 0보다 커야합니다.");
	                return;
	            } else {
	                System.out.println("잔액이 부족합니다.");
	                return;
	            }
	        }
	    }
	    System.out.println("계좌를 찾지 못했습니다.");
	}
}