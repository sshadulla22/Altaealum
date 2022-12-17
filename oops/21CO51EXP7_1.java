/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 7

    AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF TYPES OF ONSTRUCTORS AND CONSTRUCTOR OVERLOADING (DEFAULT CONSTRUCTOR)

    Theory :-
    Constructor :-
    In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. 
    At the time of calling constructor, memory for the object is allocated in the memory.
    It is a special type of method which is used to initialize the object.
    Every time an object is created using the new() keyword, at least one constructor is called.
    It calls a default constructor if there is no constructor available in the class. 
    In such case, Java compiler provides a default constructor by default.

    Default Constructor :-
    A constructor that has no parameter is known as the default constructor. 
    If we don't define a constructor in a class, then the compiler creates a default constructor(with no arguments) for the class. 
    And if we write a constructor with arguments or no arguments then the compiler does not create a default constructor. 
*/

class constructor1
{
    int a;
    float b;
    String s;
    char d;
    boolean x;
    double y;
    long z;
    short m;
    byte n;
    public static void main(String [] args)
    {
        //Creation and initialization of object
        //c will get all the instance variables and it will be initialized with the default values
        constructor1 c=new constructor1();
        //objectname.variablename--to access the instance variables belonnging to an object
        System.out.println(c.a);//0
        System.out.println(c.b);//0.0
        System.out.println(c.s);//null
        System.out.println(c.d);//null\0
        System.out.println(c.x);//false
        System.out.println(c.y);//0.0
        System.out.println(c.z);//0
        System.out.println(c.m);//0
        System.out.println(c.n);//0

    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT DEFAULT CONSTRUCTOR IN JAVA