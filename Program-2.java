import java.util.Scanner;
public class Problem2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int temp=1;
		for(int i=1;i<=a;i++) {
			if(i<a) {
				System.out.print(temp+",");
			}
			else {
				System.out.print(temp);
			}
			
			 temp=temp+2;
		}
	}

}
