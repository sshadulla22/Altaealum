/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 12

    AIM :- PROGRAM TO DEMONSTRATE THE CONCEPT OF INHERITENCE AND IT'S TYPES - 2) MULTILEVEL INHERITENCE

    Theory :-

    Inheritence :-
    Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. 
    It is an important part of OOPs (Object Oriented programming system).
    The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. 
    When you inherit from an existing class, you can reuse methods and fields of the parent class. 
    Moreover, you can add new methods and fields in your current class also.

    2) Multilevel Inheritence :-
    When there is a chain of inheritance, it is known as multilevel inheritance. 
    As you can see in the example given below, BabyDog class inherits the Dog class which again inherits the Animal class, so there is a 
    multilevel inheritance.
*/

//Animal Class is a Parent Class
class Animal
{  
    void eat(){System.out.println("eating...");}  
}  
//Dog Class is a child class of an Animal Class
class Dog extends Animal
{  
    void bark(){System.out.println("barking...");}  
}  
//BabyDog Class is a child class of a Dog Class
class BabyDog extends Dog
{  
    void weep(){System.out.println("weeping...");}  
}  
class TestInheritance2
{  
    public static void main(String args[])
    {  
        BabyDog d=new BabyDog();  
        d.weep();  
        d.bark();  
        d.eat();  
    }
}  

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT MULTILEVEL INHERITENCE IN JAVA