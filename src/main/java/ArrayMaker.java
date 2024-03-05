import java.util.Random;
//import java.util.Arrays; 

public class ArrayMaker {
  /***
 * TODO: add methods.
 * You should add any methods or variables you need in order to create the arrays
 * described in the Project (random arrays and nearly sorted arrays).
 */   

  /*public static void main (String args[]) {
    int[] arr = createRand(7);
    int[] arr2 = createNearlySorted(5);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr2));
  }*/

  //creates array of random elements, elements can only get as big as the size of the array itself
  public static int[] createRand (int size) {
    Random rand = new Random();  
    int[] arr = new int[size];
    for (int i=0; i < size; i++) {
      arr[i] = rand.nextInt(size);
    }

    return arr;
  }

  //creates nearly sorted arrays, then makes 10 random swaps of elements
  public static int[] createNearlySorted (int size) {
    Random rn = new Random();
    int[] arr = new int[size];
    for (int n=0; n < size; n++) {
      arr[n] = n;
    }

    int i=0, j=-1;
    for (int k=1; k <= 10; k++) {
      i = rn.nextInt(size-1);
      //find second element to swap arr[i] with
      while (j < 0 || j >= size) {
        j = rn.nextInt((i+10)-(i-10) + 1) + (i-10);
      }

      //swap
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }

    return arr;
  }

}
