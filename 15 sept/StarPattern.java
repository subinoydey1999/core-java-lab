/*
@author : subinoy dey
@date : 15 sept 2022
*/.
class StarPattern
/*      noOfRows=4
          *   i=1     spaces: 3(noOfrows-i)
		 **   i=2             2
		***   i=3             1
       ****   i=4             0
*/
    static void firstPattern(int noOfRows)
{
     for(int int=1;i<=noOfRows;i++)
     {
          System.out.println();
          for(int spaces=noOfRows-i;spaces>=0;spaces--)
          {
              System.out.print(" ");
          }
          for(int j=1;j<=i;j++)
          {
			System.out.print(" ")
		  }
		  
	    }	  	 
    }		