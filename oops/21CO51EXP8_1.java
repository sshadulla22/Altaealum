/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 8

    AIM :- WORKING WITH ARRAYS IN JAVA (1D ARRAYS)

    Theory :-

    Array :-
    Java array is an object which contains elements of a similar data type. 
    Additionally, The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements. 
    We can store only a fixed set of elements in a Java array.
    Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.
*/

class array
{
    public static void main(String [] args)
    {
        //creating an integer array of size 5
        //int [] arr=new int[5]
        int []arr={11,22,33,44,55};
        //storing value onto the array
        arr[0]=11;
        arr[0]=16;
        //print the content
        /*for(int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        */ 
        //for each loop for displaying the content of the array
        for(int j:arr)
        {
            System.out.println(j);
        }
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT 1D ARRAY IN JAVA