package selectionsort;

public class SelectionSort {

    public static void main(String[] args) {
        // Create integer array to sort
        int[] array = new int[] {98, 9, 12, 3, 1, 67};
        
        for (int i : array)
        {
            System.out.print(i + " ");
        }
        
        selectionSort(array);
        System.out.println();
        
        for (int i : array)
        {
            System.out.print(i + " ");
        }
    }
    
    public static void selectionSort(int[] array)
    {
        for(int out = 0; out < array.length - 1; out++)
        {
            int min = out;
            
            for (int in = out + 1; in < array.length; in++)
            {
                if (array[in] < array[min])
                {
                    min = in;
                }
            }
            
            swap(array, out, min);
            
        }
    }
    
    public static void swap(int[] array, int start, int min)
    {
        int temp = array[start];
        array[start] = array[min];
        array[min] = temp;
    }
}
