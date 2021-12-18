// import java.util.Arrays;

public class BasicJavaTest {

    public static void main(String[] args) {
        // BasicJava.allNumbers();
        // BasicJava.oddNumbers();
        BasicJava.simgaNumbers();

        int[] arr = {1,3,5,7,9,13};
        BasicJava.arrIterate(arr);
        // int[] arr1 = {2,8,10,2,11,15,16,21,100};
        // BasicJava.arrIterate(arr1);

        // int[] arr2 = {-2,5,7,0,-10};
        // BasicJava.findMax(arr2); // expect 7 to be returned.

        // BasicJava.arrOddNum();

        // BasicJava.avgArr(arr2); // expect 0 to be returned.
        int[] arr3 = {1,2,3,4,5};
        // BasicJava.avgArr(arr3); // expect 3 to be returned. 
        // BasicJava.greaterThanY(arr3, 3);

        // BasicJava.squareArr(arr3); // expect [1,4,9,16,25]

        // BasicJava.elimNegs(arr2);

        // int[] newArr = BasicJava.maxMinAvg(arr3);
        // System.out.println(Arrays.toString(newArr));

        BasicJava.shiftArr(arr3); // [2,3,4,5,0]

        
    }
}