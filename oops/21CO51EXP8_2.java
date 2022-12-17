/*NAME :- Shadulla khurshid alam shaikh
  ROLL NO. :- 21CO51
  BATCH :- 3
                                        EXPERIMENT NO. 8

    AIM :- WORKING WITH ARRAYS IN JAVA (2D ARRAYS)

    Theory :-

    Array :-
    Java array is an object which contains elements of a similar data type. 
    Additionally, The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements. 
    We can store only a fixed set of elements in a Java array.
    Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.
*/

class array2
{
    public static void main(String[]args)
    {
        //instancing a 2d array
        //datatype [][]arrayname=new datatype[rows][columns]
        int [][]a={{1,2,3},{4,5,6},{7,8,9}};
        //int [][]a=new int[3][3];
        /* storing values in the 2d array
        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=3;
        a[1][0]=4;
        a[1][1]=5;
        a[1][2]=6;
        a[2][0]=7;
        a[2][1]=8;
        a[2][2]=9;*/
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
}

//CONCLUSION :- HENCE, WE HAVE LEARNED ABOUT 2D ARRAY IN JAVA