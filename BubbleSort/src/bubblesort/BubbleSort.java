package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        // Create and array and then sort array
        int[] array = new int[] {14, 3, 1, 9, 12, 11, 4};
        
        for (int val : array)
        {
            System.out.print(val + " ");
        }
        
        bubbleSort(array);
        
        System.out.println();
        
        for (int val : array)
        {
            System.out.print(val + " ");
        }
    }
    
    public static void bubbleSort(int[] iArray)
    {
        int in, out;
        // Outer loop to control comparisons
        // NOTE: This loop decrements
        for(out = iArray.length - 1; out > 0; out--)
        {
            for(in = 0; in < out; in++)
            {
                if(iArray[in] > iArray[in+1])
                {
                    swap(iArray, in, in+1);
                }
            }
        }
    }
    
    public static void swap(int[] array, int leftIndex, int rightIndex)
    {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }
    
}
