package heuser.luke;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // instantiating an array that has 4 elements,
        // each element is an array with a length of 4
        int[][] array2 = new int[5][4];
        System.out.println(Arrays.toString(array2));

        System.out.println("array2.length = " + array2.length);

        // this for-each loop, loops through the outer array
        // and each element is an array of integers
        for (int[] outer : array2 ) {
            System.out.println(Arrays.toString(outer));
        }

        // This is very common
        // Var is used because Java can determine the type
        for (int i = 0; i < array2.length; i++) {
            var interArray = array2[i];
            for (int j = 0; j < interArray.length; j++) {
//              System.out.println(array2[i][j]);
                array2[i][j] = (i * 10) + (j + 1);
            }
//            System.out.println();
        }


//        for(var outer : array2) {
//            for(var element : outer) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(array2));

        // can not use an anonymous array
        array2[1] = new int[]{10, 20, 30};
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"a", "b", "c",};
        System.out.println(Arrays.deepToString(anyArray));

        // This is an array creation expressions with an array initializer
        anyArray[1] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));


        anyArray[2] = new int[2][2][2];

        // The code below is trying to cast something that's a STRING to an array of object
        // later in the code
        // anyArray[2] = "Hello";
        System.out.println(Arrays.deepToString(anyArray));


        for(Object element : anyArray) {
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            // This is a call to Arrays.deepToString with a cast to Object
            // Java does not know that this array is a multi-dimensional array.
            // We know that each element of this array IS AN ARRAY!!! The Arrays.deepToString
            // method TAKES AN ARRAY so we need to cast our element to an array of Object

            System.out.println(Arrays.deepToString((Object[]) element));
        }

    }

}
