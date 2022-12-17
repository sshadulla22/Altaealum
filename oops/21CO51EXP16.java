/*NAME :- Shadulla khurshid alam shaikh
ROLL NO. :- 21CO51
BATCH :- 3

                                EXPERIMENT NO. 16

AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF ABSTRACT CLASS AND METHODS

Theory :-
A class which is declared with the abstract keyword is known as an abstract class in Java. 
It can have abstract and non-abstract methods (method with the body).
Abstraction is a process of hiding the implementation details and showing only functionality to the user.
Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where 
you type the text and send the message. 
You don't know the internal processing about the message delivery.
*/ 
abstract class Bike{  
       Bike(){System.out.println("bike is created");}  
       abstract void run();  

      
       void changeGear(){System.out.println("gear changed");}  
     }  
    //Creating a Child class which inherits Abstract class  
     class Honda extends Bike{  
     void run(){System.out.println("running safely..");}
       void changeGear(){System.out.println("gear changed VVV"); }
         }
    //Creating a Test class which calls abstract and non-abstract methods  
     class TestAbstraction2{  
     public static void main(String args[]){  

      Honda obj = new Honda();  
  obj.run();  
  obj.changeGear();  
     }  
    }  
