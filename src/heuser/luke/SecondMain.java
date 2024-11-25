package heuser.luke;

import java.util.Arrays;

public class SecondMain {
    public static void main(String[] args) {

        int[][] array = new int[3][];

        // Can not use an anonymous array initializer
        // to instantiate a 2D array
        // array[0] = {23,42,52};


        // The code below will COMPILE but will throw a nullPointerException
        // This the code below is finding row 0 (our first array)
        // and changing the value at the 0 indices (column) to 42. HOWEVER,
        // there is no value set because the value is currently NULL
        // from the initialization.
        // array[0][0] = 42;



        // The array length can be as long as we want
        // In other words, the indices (columns) of our arrays (rows) can
        // be as long as we want them to be!
        array[0] = new int[]{10,54,56};
        array[0][1] = 42;
        array[1] = new int[]{1,2,3,4,5,6};
        array[2] = new int[]{9,8,7,6,5,4,3,2,1,0};



        System.out.println(Arrays.deepToString(array));

    }
}
