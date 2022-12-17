/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 11

    AIM :- PROGRAM TO DEMONSTRATE THE CREATION OF STRING-BUFFER AND APPLYING IT'S VARIOUS METHODS

    Theory :-

    String-buffer :-
    StringBuffer is a peer class of String that provides much of the functionality of strings. 
    The string represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences. 
    StringBuffer may have characters and substrings inserted in the middle or appended to the end. 
    It will automatically grow to make room for such additions and often has more characters preallocated than are actually needed, 
    to allow room for growth.
    StringBuffer class is used to create mutable (modifiable) string. 
    The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
*/

class StringBuffer1
{
    public static void main(String[]args)
    {
        //Creating our String-Buffer
        StringBuffer sb = new StringBuffer("Hello");
        //Other ways to create String Buffer
        StringBuffer sb1 = new StringBuffer(10);
        StringBuffer sb2 = new StringBuffer();
        //Printing the String Buffer
        System.out.println(sb);
        //To append the String Buffer
        sb.append("Java");
        System.out.println(sb);
        //To insert the string with the given string at a particular position
        sb.insert(1,"Java");  
        System.out.println(sb);
        //Replacing the string
        sb.replace(1,3,"Java");  
        System.out.println(sb);
        //Delete the String
        sb.delete(1,3);  
        System.out.println(sb);
        //Reverse the current String
        sb.reverse();  
        System.out.println(sb);
        //Returning the current capacity of the String
        sb.append("java is my favourite language");  
        System.out.println(sb.capacity());
        //To ensure the given capacity of the string
        sb.ensureCapacity(10);  
        System.out.println(sb.capacity());
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT STRINGS BUFFERS AND IT'S METHODS IN JAVA