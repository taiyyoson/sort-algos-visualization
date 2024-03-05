/***
 * This takes about 26 mins to run
 */

import java.util.Arrays;
import java.util.Random;

public class Main {

	//Main method
    public static void main(String[] args) {
        int[] test1 = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(test1));
        bubbleSort(test1);
        System.out.println(Arrays.toString(test1));

        int[] test2 = {6, 4, 8, 2, 9, 1, 0};
        System.out.println(Arrays.toString(test2));
        sort(test2, "merge");
        System.out.println(Arrays.toString(test2));
        /***
         * TODO: You can edit the main to implement the requested tests
         */
		int low = 50000;
        int high = 500000;  
        int step = 50000;

		//calls SortingTester class
        SortingTester.testRandArr(low, high, step);

        SortingTester.testNearlySorted(low, high, step);
    }
    
	//General sort method, choose which method to sort
    public static void sort(int[] arr, String method){
        /***
         * TODO: Edit this method
         * It should sort arr in place using the method
         * given in the String.  The allowed strings should be:
         * "insertion", "selection", "bubble", "merge", "quick"
         */
        switch(method) {
            case "selection":
                selectionSort(arr);
                break;
            case "bubble":
                bubbleSort(arr);
                break;
            case "insertion":
                insertionSort(arr);
                break;
            case "merge":
                mergeSort(arr);
                break;
            case "quick":
                quickSort(arr);
                break;
            default:   
            System.out.println("No matching method, try again");
			break;
        }
    }
	
    public static void selectionSort(int[] arr){
        /***
         * TODO: Implement SelectionSort
         */
        int k; 
		int temp;
		for (int i=0; i < arr.length; i++) {
			//finds index of smallest element in arr
			k = findMinIndex (arr, i);
			//swap 
			temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
    }
    public static int findMinIndex (int arr[], int min) {
		int index = min;
		for (int i=min; i < arr.length; i++) {
			if (arr[i] < arr[index]) {
				index = i;
			}
		}
		return index;
	}


    public static void bubbleSort(int[] arr){
        /***
         * TODO: Implement bubble sort
         */
        int temp;
		int len = arr.length - 1;
		for (int i=0; i < len; i++) {
			boolean swapper = false;
			for (int n=0; n < len - i; n++) {
				if (arr[n] > arr[n+1]) {
					temp = arr[n];
					arr[n] = arr[n+1];
					arr[n+1] = temp;
					//swap was made, array is not sorted
					swapper = true;
				}

			}
			//if false, means no swaps were made on the pass, so array is sorted
			if (swapper == false) {
				break;
			}
		}
    }


    public static void insertionSort(int[] arr){
        /***
         * TODO: implement insertion sort
         */
        int len = arr.length;
		for (int i=1; i < len; i++) {
			int temp = arr[i];
			int n = i-1;
			while (n >= 0 && temp < arr[n]) {
				arr[n+1] = arr[n];
				n--;
			}
			arr[n+1] = temp;
		}

    }



    public static void mergeSort(int[] arr){
        /***
         * TODO: implement merge sort
         * hint: you'll want 2 other methods of your creation
         */
        int low = 0;
        int high = arr.length;
        mergeSorts(arr, low, high);
    }

    public static void mergeSorts (int[] arr, int low, int high) {
		if (low + 1 == high || low == high) {
			return;
		}

		int mid = (low + high)/2;
		mergeSorts(arr, low, mid); 
		mergeSorts(arr, mid, high);

		merge(arr, low, mid, high);
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		int i = low;
		int j = mid;
		int k = 0;
		int sub[] = new int[high-low];

		while (i < mid && j < high) {
			if (arr[i] <= arr[j]) {
				sub[k] = arr[i];
				i++;
			}
			else {
				sub[k] = arr[j];
				j++;
			}
			k++;
		}

		while (i < mid) {
			sub[k] = arr[i];
			i++;
			k++;
		}
		while (j < high) {
			sub[k] = arr[j];
			j++;
			k++;
		} 
		k=0;
		for (int n = low; n < high; n++) {
			arr[n] = sub[k];
			k++;
		}
	}



    public static void quickSort(int[] arr){
        /***
         * TODO: implement quickSort
         * hint; you'll want 2 other methods of your own creation
         */

        int low = 0;
        int high = arr.length;
        quickSorts(arr, low, high);
    }

    public static void quickSorts (int[] arr, int low, int high) {
		if (high - low <= 1) {
			return;
		}
		int pivot = partition (arr, low, high);
		quickSorts(arr,low,pivot);
		quickSorts(arr,pivot+1,high);
	}

	public static int partition (int[] arr, int low, int high) {
		int i, j;
		i = low;
		
		
        //uses random pivot instead of n-1 index
		Random rand = new Random();
        int randIndex = rand.nextInt((high-low-1) + 1) + low;

        int temp = arr[high-1];
        arr[high-1] = arr[randIndex]; 
		arr[randIndex] = temp;
        
		int pivot = high-1; 
		for (j = low; j < pivot; j++) {
			if (arr[j] <= arr[pivot]) {
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				i++;
			}
		}
		int temp1 = arr[i];
		arr[i] = arr[pivot];
		arr[pivot] = temp1;
		//index of new pivot
		return i;
	}



}