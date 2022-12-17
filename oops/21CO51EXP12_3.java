/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 12

    AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF INHERITENCE AND IT'S TYPES - 3) HIERARCHICAL INHERITENCE

    Theory :-

    Inheritence :-
    Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. 
    It is an important part of OOPs (Object Oriented programming system).
    The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. 
    When you inherit from an existing class, you can reuse methods and fields of the parent class. 
    Moreover, you can add new methods and fields in your current class also.

    3) Hierarchical Inheritence :-
    In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass. 
    For eg :- class A serves as a base class for the derived classes B, C, and D.
*/

// Java program to illustrate the
// concept of Hierarchical inheritance

//Class A is a Parent Class
class A 
{
	public void print_A() { System.out.println("Class A"); }
}
//Class B is a Child Class of Class A
class B extends A 
{
	public void print_B() { System.out.println("Class B"); }
}
//Child C is a Second Child Class of Class A
class C extends A 
{
	public void print_C() { System.out.println("Class C"); }
}
//Class D is a Third Child Class of Class A
class D extends A 
{
	public void print_D() { System.out.println("Class D"); }
}

// Driver Class
public class Test 
{
	public static void main(String[] args)
	{
		B obj_B = new B();
		obj_B.print_A();
		obj_B.print_B();

		C obj_C = new C();
		obj_C.print_A();
		obj_C.print_C();

		D obj_D = new D();
		obj_D.print_A();
		obj_D.print_D();
	}
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT HIERARCHICAL INHERITENCE IN JAVA
