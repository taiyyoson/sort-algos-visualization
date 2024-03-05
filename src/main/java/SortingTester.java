import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Arrays;

public class SortingTester {

     /*public static void main (String args[]) {
        int low = 5000;
        int high = 50000;  
        int step = 5000;

        testRandArr(low, high, step);

        testNearlySorted(low, high, step);
    }*/





    public static void testRandArr(int low, int high, int step) {
        testArray("random", low, high, step);
    }
    public static void testNearlySorted(int low, int high, int step) {
        testArray("nearly sorted", low, high, step);
    }
    
    private static void testArray(String arrayType, int low, int high, int step){
        /***
         * TODO: Edit this method
         * It should find the clock time needed to sort an array of type arrayType
         * for each sorting algorithm, on arrays ranging from size low to high, in
         * intervals of size step.  That is, arrays of size low, low+step, low+2step, . . . high
         * The possible values for arrayType are "nearly sorted" and "random"
         * It should call the ArrayMaker class to create those arrays.
         */

        //x is the multiplier for step
        int x;
        //creating header for csv file
        String[] setupArr = {"Array Size", "Selection", "Insertion", "Bubble", "Merge", "Quick"};
        if (arrayType == "random") {
            File randFile = new File("random.csv");
            x = 0;
            //create header row
            writeCSV(setupArr, randFile, false);
            //loop through all aray sizes
            for (int i=low; i <= high; i+= (step * x)) {
                //create arrays of size [i]
                int[] arr = ArrayMaker.createRand(i);
                int[] arr2 = copyArray(arr);
                int[] arr3 = copyArray(arr);
                int[] arr4 = copyArray(arr);
                int[] arr5 = copyArray(arr);
                String[] csvArr = new String[6];
                //call calculateTime, store in CSV arr
                csvArr[0] = Integer.toString(i);
                csvArr[1] = Long.toString(calculateTime("selection", arr));
                csvArr[2] = Long.toString(calculateTime("insertion", arr2));
                csvArr[3] = Long.toString(calculateTime("bubble", arr3));
                csvArr[4] = Long.toString(calculateTime("merge", arr4));
                csvArr[5] = Long.toString(calculateTime("quick", arr5));
                //arr gets written to csv file
                writeCSV(csvArr, randFile, true);
                x++;
                i = low;
            }

        }

        if (arrayType == "nearly sorted") {
            File nearlySortedFile = new File("nearlySorted.csv");
            x = 0;
            //create header row
            writeCSV(setupArr, nearlySortedFile, false);
            //loop through all aray sizes
            for (int i=low; i <= high; i+= (step * x)) {
                //creating arrays of size [i]
                int[] arr = ArrayMaker.createNearlySorted(i);
                int[] arr2 = copyArray(arr);
                int[] arr3 = copyArray(arr);
                int[] arr4 = copyArray(arr);
                int[] arr5 = copyArray(arr);
                String[] csvArr = new String[6];
                //calculateTime gets stored in CSV arr
                csvArr[0] = Integer.toString(i);
                csvArr[1] = Long.toString(calculateTime("selection", arr));
                csvArr[2] = Long.toString(calculateTime("insertion", arr2));
                csvArr[3] = Long.toString(calculateTime("bubble", arr3));
                csvArr[4] = Long.toString(calculateTime("merge", arr4));
                csvArr[5] = Long.toString(calculateTime("quick", arr5));
                //write arr to csv file
                writeCSV(csvArr, nearlySortedFile, true);
                x++;
                //reset i every iteration
                i = low;
            }
        }

    }

    //this function calculates and returns time for given sort algorithm
    public static long calculateTime (String sort, int[] arr) {
        long startTime = System.currentTimeMillis();
        Main.sort(arr, sort);
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }
    //takes arr and returns a copy
    public static int[] copyArray (int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i=0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //takes file name and some arr (filled with sorting times), and writes it to file
    public static void writeCSV (String[] arr, File filepath, boolean append) {
        try {
            FileWriter outputfile = new FileWriter(filepath, append);
            CSVWriter writer = new CSVWriter(outputfile);
            writer.writeNext(arr);
            writer.close();
            //to track progress
            System.out.println(Arrays.toString(arr));
        }
            
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}