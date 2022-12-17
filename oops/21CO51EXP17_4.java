/*NAME :- Shadulla khurshid alam shaikh
ROLL NO. :- 21CO51
BATCH :- 3

                                EXPERIMENT NO. 17

AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF EXCEPTION HANDLING (THROW FINALLY)

Theory :-
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow
of the application can be maintained.
In Java, an exception is an event that disrupts the normal flow of the program. 
It is an object which is thrown at runtime.
Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, 
RemoteException, etc.
*/ 

public class throws_example {
  static void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}
