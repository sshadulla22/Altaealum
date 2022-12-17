/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 14

    AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF FINAL KEYWORD

    Theory :-

    Final Keyword :-
    The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. 
    It can be initialized in the constructor only. 
    The blank final variable can be static also which will be initialized in the static block only. 
*/

class Bike9
{  
 final int speedlimit=90;//final variable  
 void run()
 {  
  speedlimit=400;  
 }  
 public static void main(String args[])
 {  
    Bike9 obj=new  Bike9();  
    obj.run();  
 }  
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT FINAL KEYWORD IN JAVA