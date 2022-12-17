/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3

                                        EXPERIMENT NO. 3

  AIM :- IMPLEMENTATION OF PROGRAM WITH IF-ELSE STATEMENTS

  Theory :-

  If-Else Statements :-
  In programming, we use the if..else statement to run a block of code among more than one alternatives.

For example, assigning grades (A, B, C) based on the percentage obtained by a student.

1. if the percentage is above 90, assign grade A
2. if the percentage is above 75, assign grade B
3. if the percentage is above 65, assign grade C

*/

//For Scanning User-Input Value
import java.util.Scanner;

class exp3
{
    //Main Method
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a number :: ");
        int a=sc.nextInt();
        //If-else condition statements
        if (a>10)
        {
            System.out.println("Number is greater than 10");
        }
        else if (a==10)
        {
            System.out.println("Number is equal to 10");
        }
        else
        {
            System.out.println("Number is lesser than 10");
        }
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT IF-ELSE STATEMENTS IN JAVA