/*NAME :-Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 14

    AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF SUPER KEYWORD

    Theory :-

    Super Keyword :-
    The super keyword in Java is a reference variable which is used to refer immediate parent class object.
    Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference 
    variable.
*/

class Animal
{  
    String color="white";  
}  
class Dog extends Animal
{  
    String color="black";  
    void printColor()
    {  
        System.out.println(color);//prints color of Dog class  
        System.out.println(super.color);//prints color of Animal class  
    }  
}  
class TestSuper1
{  
    public static void main(String args[])
    {  
        Dog d=new Dog();  
        d.printColor();  
    }
}  

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT SUPER KEYWORD IN JAVA