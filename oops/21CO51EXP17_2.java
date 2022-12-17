/*NAME :- Shadulla khurshid alam shaikh
ROLL NO. :- 21CO51
BATCH :- 3

                                EXPERIMENT NO. 17

AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF EXCEPTION HANDLING (TRY CATCH FINALLY)

Theory :-
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow
of the application can be maintained.
In Java, an exception is an event that disrupts the normal flow of the program. 
It is an object which is thrown at runtime.
Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, 
RemoteException, etc.
*/ 
public class TestFinallyBlock2{    
          public static void main(String args[]){   
      
          try {    
      
            System.out.println("Inside try block");  
      
            //below code throws divide by zero exception  
           int data=25/0;    
           System.out.println(data);    
          }   
      
          //handles the Arithmetic Exception / Divide by zero exception  
          catch(ArithmeticException e){  
            System.out.println("Exception handled");  
            System.out.println(e);  
          }   
      
          //executes regardless of exception occured or not   
          finally {  
            System.out.println("finally block is always executed");  
          }    
      
          System.out.println("rest of the code...");    
          }    
        }  
