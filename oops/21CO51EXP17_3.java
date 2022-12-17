/*NAME :- Shadulla khurshid alam shaikh
ROLL NO. :- 21CO51
BATCH :- 3

                                EXPERIMENT NO. 17

AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF EXCEPTION HANDLING (THROW)

Theory :-
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow
of the application can be maintained.
In Java, an exception is an event that disrupts the normal flow of the program. 
It is an object which is thrown at runtime.
Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, 
RemoteException, etc.
*/ 
public class TestThrow1 {   
        //function to check if person is eligible to vote or not   
        public static void validate(int age) {  
            if(age<18) {  
                //throw Arithmetic exception if not eligible to vote  
                throw new ArithmeticException("Person is not eligible to vote");    
            }  
            else {  
                System.out.println("Person is eligible to vote!!");  
            }  
        }  
        //main method  
        public static void main(String args[]){  
            //calling the function  
            validate(13);  
            System.out.println("rest of the code...");    
      }    
    }    
