package bubblesortgeneric;

public class BubbleSortGeneric <T extends Comparable<T>> {

    public static void main(String[] args) {
        Integer iArray[] = new Integer[] {2, 6, 3, 8, 4, 9, 1};
        Double dArray[] = new Double[] {4.4, 9.9, 6.6, 1.1};
        String sArray[] = new String[] {"Williams", "Jones", "Anderson", "Nelson"};
        Character cArray[] = new Character[] {'W', 'J', 'A', 'N'};
        
        // Sort Integer array
        for (Integer iVal : iArray)
        {
            System.out.print(iVal + " ");
        }
        
        bubbleSort(iArray);
        System.out.println();
        
        for (Integer iVal : iArray)
        {
            System.out.print(iVal + " ");
        }
        
        System.out.println();
        
        // Sorting Double array
        for (Double dVal : dArray)
        {
            System.out.print(dVal + " ");
        }
        
        bubbleSort(dArray);
        System.out.println();
        
        for (Double dVal : dArray)
        {
            System.out.print(dVal + " ");
        }
        
        System.out.println();
        
        // Sorting String array
        for (String sVal : sArray)
        {
            System.out.print(sVal + " ");
        }
        
        bubbleSort(sArray);
        System.out.println();
        
        for (String sVal : sArray)
        {
            System.out.print(sVal + " ");
        }
        
        System.out.println();
        
        // Sorting Character array
        for (Character cVal : cArray)
        {
            System.out.print(cVal + " ");
        }
        
        bubbleSort(cArray);
        System.out.println();
        
        for (Character cVal : cArray)
        {
            System.out.print(cVal + " ");
        }
    }
    
    public static <T extends Comparable<T>> void bubbleSort(T[] iArray)
    {
        int in, out;
        for(out = iArray.length - 1; out > 0; out--)
        {
            for(in = 0; in < out; in++)
            {
                if((iArray[in].compareTo(iArray[in+1]) > 0))
                {
                    swap(iArray, in, in+1);
                }
            }
        }
    }
    
    public static <T> void swap(T[] array, int one, int two)
    {
        T temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
    
}
