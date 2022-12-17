/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 10

    AIM :- PROGRAM TO DEMONSTRATE THE CREATION OF STRING AND APPLYING ITS VARIOUS METHODS

    Theory :-

    String :-
    In Java, string is basically an object that represents sequence of char values. 
    An array of characters works same as Java string.
    Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.
    The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.

*/

class strings
{
    public static void main(String[]args)
    {
        //Creating String using String literals
        char[] ch={'a','i','K','T','c'};
        //Converting  Character Array into String
        String s = new String(ch);
        //Printing out String
        System.out.println(s);
        //To check the length of the string
        System.out.println("\n The length of the string is " +s.length());
        //Fetching Character 1
        System.out.println("\n The character at index 1 is " +s.charAt(1));
        //Fetching the character at particular index
        System.out.println("\n The substring from index 2 is " +s.substring(2));
        //Concatenating the String in a Sentence
        String s2 = "\nThe String is " .concat(s);
        System.out.println(s2);
        //Converting String into Upper case
        System.out.println("\n The String in Upper case is " +s.toUpperCase());
        //Converting String into Lower case
        System.out.println("\n The String in Lower case is " +s.toLowerCase());
        //Checking whether the String is equal or not. If it is, then it will print true, else false.
        System.out.println("\n Is this String equal??\n " +s.equals(s2));
        //Searching the sequence of characters in a new string. If it is found, then iit will print true, else false
        String s3 = "My favourite actor is Thalapathy Vijay";
        System.out.println("\n Is this String contains character 'Vijay'??\n" +s3.contains("Vijay"));
        //Checking if the string is empty or not. If it is, then it will print true, else false
        System.out.println("\n Is this string empty??\n " +s.isEmpty());
        //Replacing all the old character to a new character
        System.out.println("\n The string Vijay is replaced by " +s3.replace("Vijay","Mahesh"));
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT STRINGS AND IT'S METHODS IN JAVA