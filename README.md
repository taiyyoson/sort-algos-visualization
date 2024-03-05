## Starter Code for Project 1: Sorting Nearly Sorted Arrays
Please see the Project description on Coursera for instructions.  

My implementation is simple and efficient, with various methods to help me. Besides the methods given in the starter code, I included sub-methods to help me with certain sorting algorithms. In ArrayMaker.java, I had two methods, each for the different type of array. In SortingTester.java, I wrote a calculateTime method, copyArray method, and writeCSV method. 

`long calculateTime` was a method that takes a string indicating which sort algorithm and the array to be sorted, and returns how long it took for that one algorithm to sort that one array. This is the only method that calls the Main class (to access the sorting methods). 

`int[] copyArray` returns a duplicate arr of the arr specified in the parameters. This was so that I could make duplicate arrays for each of the FIVE sorting algorithms. 

`void writeCSV` was a method that implements the OpenCSV library. It takes an array and some `File filepath`, and writes that array to the file. The arrays passed into this method were String arrays filled with the times it took each of the 5 algorithms to sort one array of size `i`. There was also an append parameter, that indicated whether to create a whole new file or to append to the existing one.


## Graphs

### Random Arrays

<img width="1003" alt="Screenshot 2024-03-02 at 1 24 14 PM" src="https://github.com/Veomett/project-1-sorting-nearly-sorted-arrays-taiyyoson/assets/123409233/15545c2a-ec62-418c-9f16-ed9b81e8e461">
This graph shows that Bubble Sort took by far the most time to sort increasingly larger arrays. 

<img width="999" alt="Screenshot 2024-03-02 at 1 24 20 PM" src="https://github.com/Veomett/project-1-sorting-nearly-sorted-arrays-taiyyoson/assets/123409233/c34f4b81-cc22-4db5-a067-fc422ade3936">
*Faster methods shown by themselves, since Merge and Quick were too fast that the scope doesn't include them in the first graph.

### Nearly Sorted Arrays
<img width="1005" alt="Screenshot 2024-03-02 at 1 24 26 PM" src="https://github.com/Veomett/project-1-sorting-nearly-sorted-arrays-taiyyoson/assets/123409233/f20cff4e-d156-4dff-815d-4a2ade445631">
This graph shows that selection sort takes the most time to sort nearly sorted arrays. Bubble sort had an inconsistency, indicating that the swaps made to the array were a little strange, allowing it to sort faster.

<img width="1009" alt="Screenshot 2024-03-02 at 1 24 32 PM" src="https://github.com/Veomett/project-1-sorting-nearly-sorted-arrays-taiyyoson/assets/123409233/642bf495-638b-4580-ad5f-0d16122424ff">
*Faster methods shown by themselves: here Insertion always took at most 1 millisecond, which is insane. 
