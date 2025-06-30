import java.util.Scanner;

public class Problem1 {
     public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a first Number:");
		 double a=sc.nextDouble();
		 System.out.println("Enter a second Number:");
		 double b=sc.nextDouble();
		 sc.nextLine();
		 System.out.println("Enter Operation:");
		 String opr=sc.nextLine();
		 String operation=opr.toLowerCase();
		switch(operation) {
		case "add":
			System.out.println("Result:"+(a+b));
			break;
		case "subtract":
			System.out.println("Result:"+(a-b));
			break;
		case "multiplication":
			System.out.println("Result:"+(a*b));
			break;
		case "division":
			System.out.println("Result:"+(a/b));
			break;
		default:
			System.out.println("Invalid operation...");
			
		}

	}

}
