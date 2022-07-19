package application;

import java.util.Locale;
import java.util.Scanner;

import services.InterestService;
import services.USAInterestService;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new USAInterestService();
		
		System.out.println("Payment after " + months + " months:");
		System.out.print(String.format("%.2f", is.payment(amount, months)));
		
		sc.close();
	}

}
