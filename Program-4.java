import java.util.Scanner;

public class Problem3 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size=sc.nextInt();
		int[] n=new int[size];
		System.out.println("Enter the numbers:");
		for(int i=0;i<size;i++) {
			n[i]=sc.nextInt();		
			}
		 int[]count=new int[10];
		 for(int num :n) {
			 for(int i=1;i<=9;i++) {
				 if(num%i==0) {
					 count[i]++;
				 }
				 
			 }
		 }
		 System.out.println("Result:");
		   System.out.print("{");
		   for(int i=1;i<=9;i++) {
			   System.out.print(i+":"+count[i]);
			   if(i<9) {
				   System.out.print(", ");
			   }
			   
			  
		   }
		   System.out.println("}");
		   sc.close();
	}

}
