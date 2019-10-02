import java.util.Scanner;

public class apcsa_rectangle {

	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	
		 System.out.print("\nEnter a length: ");
         double length = in.nextDouble();
		 System.out.println("");
		 
         System.out.print("Enter a width: ");
         double width = in.nextDouble();
         System.out.println("");


         double area = length * width;
         System.out.printf("The rectangle's area is %.2f\n", area);
		 //lol I finally got it :)!
	
	in.close();
	}
	
 }
