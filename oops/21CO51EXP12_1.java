/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 12

    AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF INHERITENCE AND IT'S TYPES - 1) SINGLE INHERITENCE

    Theory :-

    Inheritence :-
    Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. 
    It is an important part of OOPs (Object Oriented programming system).
    The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. 
    When you inherit from an existing class, you can reuse methods and fields of the parent class. 
    Moreover, you can add new methods and fields in your current class also.

    1) Single Inheritence :-
    When a class inherits another class, it is known as a single inheritance. 
    In the example given below, Dog class inherits the Animal class, so there is the single inheritance.
*/

//Animal Class is a Parent Class
class Animal
{  
    void eat(){System.out.println("eating...");}  
}  
//Dog Class is a Child Class of Animal Class
class Dog extends Animal
{  
    void bark(){System.out.println("barking...");}  
}  
class TestInheritance
{  
    public static void main(String args[])
    {  
        Dog d=new Dog();  
        d.bark();  
        d.eat();  
    }
}  

// CONCLUSION :- HENCE WE HAVE LEARNED ABOUT SINGLE INHERITENCE IN JAVA.