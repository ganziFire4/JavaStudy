package chap00_practice;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		Account[] accountArr = new Account[100]; 
		int count = 0;
		while(true) {
			System.out.println("--------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택>"); 
			int num = sc.nextInt();
			if(num == 1) {
				account.createAccount(accountArr, count);
				count++; 
			}
			else if(num == 2) {
				account.accountList(accountArr, count);
			}
			else if(num == 3) {
				account.deposit(accountArr, count);
			}
			else if(num == 4) {
				account.withdraw(accountArr, count);
			}
			else if(num == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘 못 입력하셨습니다.");
			}
		}
		sc.close();
	}

}