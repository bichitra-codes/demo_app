import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter purchase amount:");
		double purchase=sc.nextDouble();
		if(purchase>=5000) {
			
			System.out.println("you will get 20% disccount");
			double  totalbill=purchase-(purchase*20/100);
			System.out.println("total bill = " + totalbill);
		}
		else if(purchase>=2000) {
			System.out.println("you will get 10% disccount");
			double totalbill=purchase-(purchase*10/100);
			System.out.println("total bill = " + totalbill);
		}
		else if(purchase>=1000) {
			System.out.println("you will get 5% disccount");
			double  totalbill=purchase-(purchase*5/100);
			System.out.println("total bill = " + totalbill);
		}
		else {
			System.out.println("no discount available ");
		}
		
	}

}
