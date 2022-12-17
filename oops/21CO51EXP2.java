/*NAME:-Shadulla khurshid alam shaikh
  ROLL NO.:- 21CO51
  BATCH :- 2

                                        EXPERIMENT NO. 2

  AIM:-IMPLEMENT CLASS, OBJECTS AND METHODS
    
  Theory :-
    
  Class:-
    Class is a set of object which shares common characteristics/ behavior and common properties/ attributes.
    Class is not a real world entity. It is just a template or blueprint or prototype from which objects are created.
    Class does not occupy memory.
    Class is a group of variables of different data types and group of methods. 

  Objects:-
    It is a basic unit of Object-Oriented Programming and represents real life entities. 
    A typical Java program creates many objects, which as you know, interact by invoking methods.

  Methods:-
    A method is a block of code which only runs when it is called.
    You can pass data, known as parameters, into a method.
    Methods are used to perform certain actions, and they are also known as functions.
*/

class exp2
{
    //Main Method
    public static void main(String[]args)
    {
        exp2 e = new exp2();
        double result = e.cir(3.14,22);
        int result1 = e.rec(29,22);
        int result2 = e.squ(29);
        System.out.println("The area of circle is " +result);
        System.out.println("The area of rectangle is " +result1);
        System.out.println("The area of square is " +result2);
    }
    //Circle Method to perform operation on area of circle
    double cir(double pi, int r)
    {
        double circle = pi*r*r;
        return circle;
    }
    //Rectangle Method to perform operation on area of rectangle
    int rec(int l, int b)
    {
        int rectangle = l*b;
        return rectangle;
    }
    //Square Method to perform operation on area of square
    int squ(int side)
    {
        int square = side*side;
        return square;
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT CLASS, OBJECTS AND METHODS.