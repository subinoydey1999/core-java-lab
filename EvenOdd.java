/*class: EvenOdd
@author: Subinoy Dey
@date: 29sept2022
*/
// class EvenOdd
public class EvenorOddUsingIf {
   private static Scanner sc;
   import java.utill.Scanner;
   public static void main(String[] args) {
	   int Number;
	   sc = new Scanner(System.in);
	   System.out.println("\n Please Enter any interger Value: ");
	   Number = sc.nextInt();
	   if (Number % 2 == 0){
		   System.out.println("\n You have entered EVEN Number");
	   }
	   else {
		   System.out.println("\n You have entered ODD Number")
	   }
	   
   }
}