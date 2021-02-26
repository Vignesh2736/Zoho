/******************************************************************************
1. Assume that the input will be a word with odd letter count. Print the output as given below.
    
Input : W E L C O M E
Explanation : start with middle letter from first line. Next line two letter from middle . Continue still you print all letters in last line. Then start with the first letter and continue for the remaining letters. 
  
output :  


                     C
                 C O
              C O M
           C O M E
       C O M E W
   C O M E W E
C O M E W E L

Input : W A T E R
Output :

            T
         T E
      T E R
   T E R W
T E R W A

Written By: Vignesh Ramesh

*******************************************************************************/

public class WordPrint
{
  public static void main (String[]args)
  {
    String str = "";
    Scanner in = new Scanner (System.in);
    boolean flag = true;

      System.out.println ("Enter a String : ");
      str = in.next ();

    if (str.length () % 2 == 0)
      flag = false;


    if (flag)
      {
	int mid = str.length () / 2;

	for (int i = 0; i < str.length (); i++)
	  {
	    for (int j = 0; j < str.length () - i - 1; j++)
	      System.out.print (" ");

	    if (i < mid)
	      {
		System.out.print (str.substring (mid, (mid + i + 1)));
	      }
	    else
	      {
		System.out.print (str.substring (mid, str.length ()));
		System.out.print (str.substring (0, i - mid));
	      }
	    System.out.println ();
	  }

      }
    else
      {
	    System.out.println ("String length is even number");
      }

  }
}
