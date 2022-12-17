/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3

                                        EXPERIMENT NO. 4

  AIM :- PROGRAM TO DEMOSTRATE THE USE OF BRANCHING STATEMENTS (BREAKING WITH LABEL) 

  Theory :-

  Branching Statements :-
  Branching statements are the statements used to jump the flow of execution from one part of a program to another. 
  The branching statements are mostly used inside the control statements. 
  Java has mainly three branching statements, i.e., continue, break, and return. 
  The branching statements allow us to exit from a control statement when a certain condition meet.
*/

class branching
{
    //Main Method
    public static void main(String[]args)
    {
        String []
        names = {"abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yzz"};
        System.out.println("\n\t\t Searching for jkl \n");
        for(int i=0; i<8; i++)
        {
            //Using If-Else Statements for breaking with label
            if(names[i] == "jkl")
            {
                System.out.println("Element found at Index Number : " +i);
                break;                                      //Use of Break Tag according to following condition
            }
            else
            {
                System.out.println("Element not found at Index : " +i);
            }
        }
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT BRANCHING STATEMENTS (BREAKING WITH LABEL) IN JAVA