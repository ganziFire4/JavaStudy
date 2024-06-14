package BankAccount;

import java.util.Scanner;

public class BankApplication {
	
	//메모리를 많이 잡아먹기 때문에 보통 선언을 static으로 하지 않는다.
	static Scanner sc = new Scanner(System.in);
	static Account account = null;
	static Account[] accountArr = new Account[100];
	
	private static void createAccount() {
		account = new Account();
		
		//계좌번호 입력
		System.out.println("계좌번호를 입력해주세요.");
		String account_num = sc.nextLine();
		account.setAccount_num(account_num);
		
		
		//이름입력
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		account.setName(name);
		
		//초기 예금
		System.out.println("초기 입금액");
		int balance = sc.nextInt();
		account.setBalance(balance);	
		
		System.out.println(account.getAccount_num());
		

		for(int i = 0; i < accountArr.length; i++) {			
			if(accountArr[i] == null) {
				accountArr[i] = account;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}	
		
	  
	}
	

	private static void accountList() {
			for (Account account : accountArr) {
	            if (account != null) {
	                System.out.println("계좌번호: " + account.getAccount_num() + ", 이름: " + account.getName()
	                + ", 잔액: " + account.getBalance());
	            }
	        }
	    }

	

	private static void deposit() {
		
		System.out.println("현재 잔고: " + account.getBalance());
		System.out.println("예금할 금액을 입력해주세요.");
		int money = sc.nextInt();
		account.setBalance(money);
		 if (money > 0) {
	            account.setBalance(money);
	            System.out.println(money + "원이 입금되었습니다."); 
	        } else {
	            System.out.println("입금할 금액이 없습니다.");
	        }
	//예금 전후 잔액다른지 확인해보기
		 System.out.println("예금후 잔액: " + account.getBalance()); 
	    }
		
	

	private static void witdraw() {
		System.out.println("출금할 금액을 입력해주세요.");
		int money = sc.nextInt();
	
		System.out.println(account.getBalance()-money);
	}
	
	

	
	
	public static void main(String[] args) {


	

	while(true) {
		
		BankApplication bankapplication = new BankApplication();
		
		System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5. 종료");
		int inputNum = sc.nextInt();
		sc.nextLine();
		
			switch(inputNum) {
			
			case 1: 
			
				bankapplication.createAccount();
		
				break;
			
			case 2:
				bankapplication.accountList();
				break;
				
			case 3:
				bankapplication.deposit();
				break;
				
			case 4:
				bankapplication.witdraw();
				break;
				
			case 5:
				System.out.println("종료되었습니다.");
				sc.close();
				break;
			
		
			} 
		}

		
		
}
	
	
	
}