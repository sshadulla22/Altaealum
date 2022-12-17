 /*NAME :- Shadulla khuurshid alm shaikh
ROLL NO. :- 21CO51
BATCH :- 3

                                EXPERIMENT NO. 17

AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF EXCEPTION HANDLING (TRY CATCH)

Theory :-
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow
of the application can be maintained.
In Java, an exception is an event that disrupts the normal flow of the program. 
It is an object which is thrown at runtime.
Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, 
RemoteException, etc.
*/ 
 public class JavaExceptionExample{  
      public static void main(String args[]){  
       try{  
          //code that may raise exception  
          int data=100/0;  
       }catch(ArithmeticException e){System.out.println(e);}  
       //rest code of the program   
       System.out.println("rest of the code...");  
      }  
    }  
