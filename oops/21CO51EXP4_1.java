/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3

                                        EXPERIMENT NO. 4

  AIM :- PROGRAM TO DEMOSTRATE THE USE OF BRANCHING STATEMENTS (BREAKING WITHOUT LABEL (IN SWITCH CASE))

  Theory :-

  Branching Statements :-
  Branching statements are the statements used to jump the flow of execution from one part of a program to another. 
  The branching statements are mostly used inside the control statements. 
  Java has mainly three branching statements, i.e., continue, break, and return. 
  The branching statements allow us to exit from a control statement when a certain condition meet.
*/

import java.util.*;

class branchingBreakSwitch
{
    //Main Method
    public static void main(System.in);
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select one option from the Menu : \n 1)Add\n 2)Subtract\n 3)Multiply");
        int i=sc.nextInt();
        System.out.println("Please Enter Two Number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //Using Switch-Case Statements for breaking without label
        switch(i)
        {
            case 1 :
                System.out.println("Addition of "+a+" and "+b+" is : " +(a+b));
                break;
            case 2 :
                System.out.println("Subtraction of "+a" and "+b+" is : " +(a-b));
                break;
            case 3 :
                System.out.println("Multiplication of "+a" and "+b+" is : " +(a*b));
                break;
            default :
                break;
        }
    }
}
//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT BRANCHING STATEMENTS (BREAKING WITHOUT LABEL) IN JAVA