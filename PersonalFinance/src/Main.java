
import java.util.Scanner;

public class Main {
	
	static double initCapital;
	static double percentGain;
	static double contribution;
	static int week;
	static String payFreq;
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the Personal Finance App\n");
		
		System.out.println("Please enter initial monetary amount");
		initCapital = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Please enter expected weekly percent gain");
		percentGain = sc.nextDouble() * 0.01;
		sc.nextLine();
		
		System.out.println("Please enter paycheck contribution");
		contribution = sc.nextDouble();
		sc.nextLine().toLowerCase();
		
		System.out.println("Please enter frequency of paychecks");
		payFreq = sc.nextLine();
		
		System.out.println("Please enter current week of the year");
		week = sc.nextInt();
		sc.nextLine();
		
		switch(payFreq) {
		case "biweekly": 
			System.out.println("Your yearly gain is $" + biweekly());
			break;
		}
		
	}
	
	public static double biweekly() {
		double total = initCapital;
		
		for(int i = week; i < 52; i += 2) {
			total += contribution;
			total += (total * percentGain);	
		}
		
		return total;
	}
}
