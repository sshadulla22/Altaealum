/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 9

    AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF DYNAMIC ARRAY i.e. VECTORS IN JAVA

    Theory :-

    Vectors :-
    Vector is like the dynamic array which can grow or shrink its size. 
    Unlike array, we can store n-number of elements in it as there is no size limit. 
    It is a part of Java Collection framework since Java 1.2. 
    It is found in the java.util package and implements the List interface, so we can use all the methods of List interface here.
    It is recommended to use the Vector class in the thread-safe implementation only. 
    If you don't need to use the thread-safe implementation, you should use the ArrayList, the ArrayList will perform better in such case.
*/

import java.util.*;  
public class VectorExample {  
       public static void main(String args[]) {  
          //Create a vector  
          Vector<String> vec = new Vector<String>();  
          //Adding elements using add() method of List  
          vec.add("Tiger");  
          vec.add("Lion");  
          vec.add("Dog");  
          vec.add("Elephant");  
          //Adding elements using addElement() method of Vector  
          vec.addElement("Rat");  
          vec.addElement("Cat");  
          vec.addElement("Deer");  
            
          System.out.println("Elements are: "+vec);  
       }  
}  

// CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT VECTORS IN JAVA