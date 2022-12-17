/*NAME :- Shadulla khurshid alam shikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 5

    AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF METHOD OVERLOADING

    Theory :-
    If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
    If we have to perform only one operation, having same name of the methods increases the readability of the program.
    Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as 
    a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to 
    understand the behavior of the method because its name differs.
    So, we perform method overloading to figure out the program quickly.
*/

class methodoverloading
{
    //Method for printing witth integer value
    void print1(int n)
    {
        System.out.println("Welcome to Lab " +n);
    }
    //Method for printing with string value
    void print1(String s)
    {
        System.out.println("Welcome to Lab " +s);
    }
    //Main method
    public static void main(String[]args)
    {
        methodoverloading m=new methodoverloading();
        m.print1("ESP Lab");
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT METHOD-OVERLOADING IN JAVA