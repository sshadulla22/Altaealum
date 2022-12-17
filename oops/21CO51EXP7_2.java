/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51 
  BATCH :- 3
                                        EXPERIMENT NO. 7

    AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF TYPES OF ONSTRUCTORS AND CONSTRUCTOR OVERLOADING (PARAMETERIZED CONSTRUCTOR)

    Theory :-
    Constructor :-
    In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. 
    At the time of calling constructor, memory for the object is allocated in the memory.
    It is a special type of method which is used to initialize the object.
    Every time an object is created using the new() keyword, at least one constructor is called.
    It calls a default constructor if there is no constructor available in the class. 
    In such case, Java compiler provides a default constructor by default.

    Parameterized Constructor :-
    A constructor that has parameters is known as parameterized constructor. 
    If we want to initialize fields of the class with our own values, then use a parameterized constructor.
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
    constructor1(int k, String s1)
    {
        a=k;
        s=s1;
    }
    constructor1()
    {
        a=67;
    }
    constructor1(float q, boolean w)
    {
        b=q;
        x=w;
    }
    public static void main(String [] args)
    {
        //Creation and initialization of object
        //c will get all the instance variables and it will be initialized with the default values
        constructor1 c = new constructor1(2.5f,false); 
        constructor1 c1 = new constructor1();
        constructor1 c2 = new constructor();

        //objectname.variablename--to access the instance variables belonnging to an object
        System.out.println(c.b);
        System.out.println(c.x);
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT PARAMETERIZED CONSTRUCTOR IN JAVA