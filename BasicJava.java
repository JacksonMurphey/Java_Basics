import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {

    // print 1-255 
    public static void allNumbers() {
        for(int i = 0; i <= 255; i++) {
            System.out.println(i);
        }
    }


    // print odd numbers from 1-255
    public static void oddNumbers() {
        for(int i = 0; i <= 255; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


    // Sum all numbers up to 255, Sigma of 255
    public static void simgaNumbers() {
        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum = sum + i; 
            System.out.println("i = " + i + " Sum: " + sum);
        }
    }


    // Iterating through an array
    // given array X say [1,3,5,7,9,13]
    public static void arrIterate(int[] x) {
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        } 
        // NOTE: if dealing with and ArrayList, then it would be x.size(); in my for loop. not x.length; 
    }


    // Find MAX. 
    // write method that accepts any array and rpints the max value in the array. should work even if negative numbers are given. 
    public static void findMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }


    // Array with Odd Numbers. 
    public static void arrOddNum() {
        ArrayList<Integer> y = new ArrayList<Integer>();

        for(int i = 0; i <= 255; i++) {
            if(i % 2 != 0) {
                y.add(i);
            }
        }
        System.out.println(y);
    }


    // get the average of an array. 
    public static void avgArr(int[] arr) {
        int sum = 0;
        int avg = 0;
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println(avg);
    }


    // Greater Than Y. 
    // Write a method that takes an array and returns a number of values from the array whose value is greater than a given value for y.
    public static void greaterThanY(int[] arr, int y) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > y){
                count++;
            }
        }
        System.out.println(count);
    }


    // Square the Values
    // given any array x, weite a method that squares each value in the array. Then return an array with the squared values. 
    public static void squareArr(int[] x) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i<x.length; i++) {
            x[i] = x[i] * x[i];
            newArr.add(x[i]);
        }
        System.out.println(newArr);
    }

    // BELOW IS HOW SOLUTION VIDEO DID IT> 

//     public static void squareArr(int[] x) {
//         for(int i = 0; i<x.length; i++) {
//             x[i] = x[i] * x[i];
//     }
//     System.out.println(Arrays.toString(x));
// }


    // Eliminate Negative Numbers
    // given array x, replace and negative numbers with the value of 0.
    public static void elimNegs(int[] x) {
        for(int i = 0; i<x.length; i++) {
            if(x[i] < 0){
                x[i] = 0;
            }
        }
        System.out.println(Arrays.toString(x)); 
        // I had to specifically import java.util.Arrays;
    }


    // Max, Min, and Avg. 
    // given any array, return array with max # in arr, min value in arr, and avg. of the values form arr. rreturn arr should be 3 elements long 
    public static int[] maxMinAvg(int[] arr) {
        int[] newArr = new int[3];
        
        int max = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        newArr[0] = max;

        int min = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        newArr[1] = min;

        int sum = 0;
        int avg = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        avg = sum / arr.length;
        newArr[2] = avg;

        return newArr;
    }


    // Shifting the values in the Array
    // Given any array. shift each number by one, to the front. 
    // if arr [1,2,3,4,5], then it should become [2,3,4,5,0].
    // you do not need to wrap around values. 
    public static void shiftArr(int[] arr) {
        // ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i<arr.length; i++) {
            if( i == arr.length - 1){
                arr[i] = 0;
                break;
            }
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }


}