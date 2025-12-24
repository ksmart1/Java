package hashtablelinearprobing;
import java.util.Scanner;

public class HashTableLinearProbing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, n, aKey;
        int keysPerCell = 10;
        
        
        System.out.print("Enter size of HashTable: ");
        size = Integer.parseInt(sc.nextLine());
        
        System.out.print("Enter initial number of items: ");
        n = Integer.parseInt(sc.nextLine());
        
        HashTable myHashTable = new HashTable(n);
        
        // Insert a bunch of random values into the hash table
        for(int i=0; i<n; i++)
        {
            aKey = (int) (java.lang.Math.random() * size * keysPerCell);
            DataItem item = new DataItem(aKey);
            myHashTable.insert(item);
        }
        
        myHashTable.displayHashTable();
        
        // Search HashTable for a value using a key.
        System.out.print("Enter a key value to find: ");
        aKey = Integer.parseInt(sc.nextLine());
        DataItem item2 = myHashTable.find(aKey);
        
        if(item2 != null)
        {
            System.out.println("Found item with value " + item2.getIData());
        }
        else
        {
            System.out.println("Did not find the key " + aKey);
        }
        
        // Delete an item fomr the hashTable
        System.out.print("Enter a key value to delete: ");
        aKey = Integer.parseInt(sc.nextLine());
        item2 = myHashTable.delete(aKey);
        if(item2 != null)
        {
            System.out.println("Deleted item with value " + item2.getIData());
        }
        else
        {
            System.out.println("Did not find item " + aKey + " to delete.");
        }
    }
    
}
