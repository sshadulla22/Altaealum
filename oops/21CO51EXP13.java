/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 13

    AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF INTERFACE AND IMMPLEMENTING MULTIPLE INHERITENCE USING THE CONCEPT OF INTERFACE

    Theory :-

    Interface :-
    An interface is a set of specifications or statements that define what a class can do without specifying how the class will do it. 
    The interface is always abstract. A concrete class must implement all the abstract methods specified in the interface. 
    Java does not support the concept of multiple inheritances to avoid the diamond problem encountered in C++ without using a virtual base 
    class. 
    However, Java supports multiple interface inheritance where an interface extends more than one super interfaces.
*/

// Java program to demonstrate
// the multiple inheritance
// in interface

// Interface to implement the
// addition and subtraction methods
interface Add_Sub 
{
	public void add(double x, double y);
	public void subtract(double x, double y);
}

// Interface to implement the
// multiplication and division
interface Mul_Div 
{
	public void multiply(double x, double y);
	public void divide(double x, double y);
}

// Calculator interface which extends
// both the above defined interfaces
interface Calculator extends Add_Sub, Mul_Div 
{
	public void printResult(double result);
}

// Calculator class which
// implements the above
// interface
public class MyCalculator implements Calculator 
{

	// Implementing the addition
	// method
	public void add(double x, double y)
	{
		double result = x + y;
		printResult(result);
	}

	// Implementing the subtraction
	// method
	public void subtract(double x, double y)
	{
		double result = x - y;
		printResult(result);
	}

	// Implementing the multiplication
	// method
	public void multiply(double x, double y)
	{
		double result = x * y;
		printResult(result);
	}

	// Implementing the division
	// method
	public void divide(double x, double y)
	{
		double result = x / y;
		printResult(result);
	}

	// Implementing a method
	// to print the result
	public void printResult(double result)
	{
		System.out.println(
			"The result is : " + result);
	}

	// Driver code
	public static void main(String args[])
	{

		// Creating the object of
		// the calculator
		MyCalculator c = new MyCalculator();
		c.add(5, 10);
		c.subtract(35, 15);
		c.multiply(6, 9);
		c.divide(45, 6);
	}
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT INTERFACE WITH THE HELP OF INHERITENCE IN JAVA.