/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3

                                        EXPERIMENT NO. 4

  AIM :- PROGRAM TO DEMOSTRATE THE USE OF CONTINUE STATEMENTS

  Theory :-

  Branching Statements :-
  Branching statements are the statements used to jump the flow of execution from one part of a program to another. 
  The branching statements are mostly used inside the control statements. 
  Java has mainly three branching statements, i.e., continue, break, and return. 
  The branching statements allow us to exit from a control statement when a certain condition meet.
*/

class exp4
{
    //Main Method
    public static void main(String[]args)
    {
        String[]names={"SHAIKH AMAAN RAFIQUE","SHAIKH ARBAZ ALI","SHAIKH
        MOHAMAD NOMAN SHER ALI","SHAIKH MOHAMMED AMAAN","SHAIKH
        MOHAMMED ASIF GULAM HUSSAIN","SHAIKH MOHD AJMAL IMTEYAZ AHMED",
       "SHAIKH MOHD ARQUAM SHAMIM AHMED","SHAIKH MOHD RAFEY RASHID",
       "SHAIKH MOHD SHADULLA KHURSHEED","SHAIKH MOHD TABISH ASHRAFI
        ABDUL RAEES","SHAIKH MOHD WASIULLAH NIZAMUDDIN","SHAIKH
        MUHAMMAD ISMAIL ISHAQUE","SHEIKH MOHAMMED REHAN YUSUF","SIDDIQUI
        MOHD SUFIYAN MD IMRAN","SIDDIQUI UMAR FAROOQUE HAMIDULLAH ASMA",
       "SOBAN WAJUDDIN MARUF","SONDE ARFAT ASIF","TOHA AYYUB BURONDKAR",
       "TRIPATHI ANUBHAV ASHOK","WANGDE AMIN ZAHEER","YADAV SUNIL
        KESHAV"};
        String[]absentees={"SHAIKH MOHAMAD NOMAN SHER ALI", "SHAIKHA MOHAMMED AMAAN",
        "SHAIKH MOHD RAFEY RASHID", "SHAIKH MOHD TABISH ASHRAFI ABDUL RAEES", "SIDDIQUI MOHD SUFIYAN MD IMRAN",
        "SIDDIQUI UMAR FAROOQUE HAMIDULLAH ASMA"};
        out = for(int i=0; i<names.length;i++)
        {
            String names=names[i];
            for(int j=0; j<absentees.length; j++)
            {
                if(name.equals(absentees[j]))
                {
                    continue out;                                       //Use of Continue Statements according to the particular condition
                }
            }
            System.out.println("Hello "+names[i]+" ");
        }
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT CONTINUE STATEMENTS IN JAVA