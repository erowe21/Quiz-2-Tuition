import java.util.Scanner;

public class tuition {

	public static double StartTuition;
	public static double Interest;

	
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter first year tuition cost");
		Scanner q1 = new Scanner(System.in);
		double StartTuition = q1.nextDouble();
		
		System.out.println("Enter interest rate percentage");
		Scanner q2 = new Scanner(System.in);
		double Interest = q2.nextDouble();
		
		double FullTuition = StartTuition;
		for (int i = 0; i < 3; i++) {
			StartTuition += StartTuition * (Interest/100);
			FullTuition += StartTuition;
		}
		q1.close();
		q2.close();
		System.out.printf("Your four year tuition will be $%.2f", FullTuition);
		}

}




