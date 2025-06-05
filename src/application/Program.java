package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account(0, null, 0);
		
		System.out.print("Enter account number: ");
		account.accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		account.accountHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit: (y/n)");
		
		char charactere = sc.next().charAt(0);
		
		if (charactere == 'y') {
			System.out.print("Enter incial deposit value: ");
			account.deposit(sc.nextDouble());
		}
		else {
			account.deposit(0);
		}
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(account.data());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account.data());
		System.out.println();
		
		System.out.print("enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account.data());
		
		sc.close();
	}

}
