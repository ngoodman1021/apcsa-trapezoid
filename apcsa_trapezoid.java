import java.util.Scanner;

public class apcsa_trapezoid {

	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	
		 System.out.print("\nEnter a top: ");
         double top = in.nextDouble();
		 System.out.println("");
		 
         System.out.print("Enter a bottom: ");
         double bottom = in.nextDouble();
         System.out.println("");
		 
		 System.out.print("Enter a height: ");
         double height = in.nextDouble();
         System.out.println("");


         double area = ((top + bottom)/ 2 ) * height;
         System.out.printf("The area of the trapezoid is  %.2f\n", area);
		 //lol I finally got it :)!
	
	in.close();
	}
	
 }
