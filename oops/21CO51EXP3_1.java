/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3

                                        EXPERIMENT NO. 3

  AIM :- IMPLEMENTATION OF PROGRAM WITH SWITCH CASE

  Theory :-

  Switch Case :-
  The Java switch statement executes one statement from multiple conditions. 
  It is like if-else-if ladder statement. 
  The switch statement works with byte, short, int, long, enum types, String and some wrapper types like Byte, Short, Int, and Long. 
  Since Java 7, you can use strings in the switch statement.
  In other words, the switch statement tests the equality of a variable against multiple values.

*/

import java.util.*;
public class SwitchStatement {
    //Main Method
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int variable;
        System.out.println("Please enter the variable value");
        
        variable=sc.nextInt();
        //Use of Switch Case
        switch(variable)
        {
            case 1:
            System.out.println("The value of the variable = "+variable);
            break;
            case 2:
            System.out.println("The value of the variable ="+variable);
            break;
            case 3:
            System.out.println("The value of the variable ="+variable);
            break;
            default:
            System.out.println("The value of the variable is neither 1 nor 2 nor 3");
        }
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT SWITCH-CASE IN JAVA