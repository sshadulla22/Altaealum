/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 6

    AIM :- PROGRAM TO DEMONSTRATE THE DIFFERENT TYPES OF VARIABLES (INSTANCE VARIABLES)

    Theory :-
    Variables :-
    A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.
    Variable is a name of memory location. There are three types of variables in java: local, instance and static.

    2. Instance Variables :-
    A variable declared inside the class but outside the body of the method, is called an instance variable. 
    It is not declared as static.
    It is called an instance variable because its value is instance-specific and is not shared among instances.
*/

class Students
{
    //This Instance Variable is Visible for any Student Class
    public String name;
    //Pointer Variable is Visible in Student Class only
    private double pointer;
    //The Name Variable is assigned in the Constructor
    public Student (String stuname)
    {
        name = stuname;
    }
    //The Pointer Variable is assigned a Value
    public void setPointer(double stupoi)
    {
        pointer = stupoi;
    }
    //This method prints the Student Details
    public void printStu()
    {
        System.out.println("Name : " +name);
        System.out.println("Exam Pointer : " +pointer);
    }
    public static void main(String[]args)
    {
        Student StuOne=new Student("Amaan");
        stuOne.setpointer(6.95);
        stuOne.printStu();
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT INSTANCE VARIABLES IN JAVA