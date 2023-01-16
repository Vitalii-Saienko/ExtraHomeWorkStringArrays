import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

         System.out.println("Task1: create new array without one element using Arrays methods");
         String[] myArray = {"1", "2", "3", "4", "5"};
         String[] array1 = Arrays.copyOfRange(myArray, 0, 2);
         String[] array2 = Arrays.copyOfRange(myArray, 3, 5);
         String[] finalArray = Arrays.copyOf(array1, 4);
         for (int i = 2; i < finalArray.length; i++) {
             finalArray [i] = array2[i-2];
         }
         System.out.println(Arrays.toString(myArray));
         System.out.println(Arrays.toString(finalArray));

         System.out.println("Task2: change order of array's elements");
         String [] extraArray = new String[myArray.length];
         int counter = myArray.length-1;
         for (int i = 0; i < myArray.length; i++) {
             extraArray[i] = myArray[counter];
             counter--;
         }
         System.out.println(Arrays.toString(extraArray));
    }
}