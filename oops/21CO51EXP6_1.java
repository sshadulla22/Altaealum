/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 6

    AIM :- PROGRAM TO DEMONSTRATE THE DIFFERENT TYPES OF VARIABLES (LOCAL VARIABLES)

    Theory :-
    Variables :-
    A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.
    Variable is a name of memory location. There are three types of variables in java: local, instance and static.

    1. Local Variables :-
    A variable declared inside the body of the method is called local variable. 
    You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
    A local variable cannot be defined with "static" keyword.

*/

class localvariable
{
    //We are using void return type
    public void COST()
    {
        //Calculating Total No. of Students by Adding Total No. of Boys and Girls
        int stg = 10;
        int stb = 53;
        int st = stg + stb;
        //Printing the sum total of students
        System.out.println("There are "+st+" students in the Second Year Computer Department in the 2022-23 batch."); 
    }
    public static void main(String[]args)
    {
        localvariable l=new localvariable();
        //Calling the user-defined method inside the main method
        l.COST();
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT LOCAL VARIABLES IN JAVA