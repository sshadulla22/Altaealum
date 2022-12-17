/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 5

    AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF METHOD OVERLOADING (ADD METHOD)

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
    //Add method with 2 integer varaibles
    int add(int a, int b)
    {
        System.out.println("Add method with 2 integer variables performed addition");
        return a+b;
    }
    //Add method with 3 integer variables
    int add(int x, int y, int z)
    {
        System.out.println("Add method with 3 integer variables performed addition");
        return x+y+z;
    }
    //Add method with 2 float variables
    float add(float m, float n)
    {
        System.out.println("Add method with 2 float variables performed addition");
        float sum=m+n;
        return sum;
    }
    //Main method
    public static void main(String[]args)
    {
        methodoverloading m=new methodoverloading();
        System.out.println(m.add(4.5f, 7.5f));
        System.out.println(m.add(29,22));
        System.out.println(m.add(29,28,26));
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT METHOD-OVERLOADING (WITH ADD METHOD) IN JAVA