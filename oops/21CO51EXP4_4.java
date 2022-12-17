/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3

                                        EXPERIMENT NO. 4

  AIM :- PROGRAM TO DEMOSTRATE THE USE OF RETURN STATEMENTS

  Theory :-

  Return Statements :-
  In Java programming, the return statement is used for returning a value when the execution of the block is completed. 
  The return statement inside a loop will cause the loop to break and further statements will be ignored by the compiler.
  In Java, every method is declared with a return type such as int, float, double, string, etc.
  These return types required a return statement at the end of the method. 
  A return keyword is used for returning the resulted value.
*/

class exp4_3
{
    //Main Method
    public static void main(String[]args)
    {
        exp4_3 e=new exp4_3();
        int area_rect=e.area(5,4);
        System.out.println("The area of rectangle is " +area_rect);
    }
    //Area Function
    int area(int l, int b)
    {
        int ans=l*b;
        return ans;                 //Returning the value to the main method
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT RETURN STATEMENTS IN JAVA