/*NAME :Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3

                                        EXPERIMENT NO. 3

  AIM :- IMPLEMENTATION OF PROGRAM WITH FOR LOOP STATEMENTS

  Theory :-

  If-Else Statements :-
  A simple for loop is the same as C/C++. We can initialize the variable, check condition and increment/decrement value.
   It consists of four parts:

    1. Initialization: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition.
    2. Condition: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.
    3. Increment/Decrement: It increments or decrements the variable value. It is an optional condition.
    4. Statement: The statement of the loop is executed each time until the second condition is false.
*/

//For Scanning User-Input Value
import java.util.Scanner;

public class exp3
{
    //Main method
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a number :: ");
        int a=sc.nextInt();
        //Use of For-Loop
        for(int i=1; i<=10; i++)
        {
            System.out.println(a*i);
        }
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT LOOP STATEMENTS IN JAVA