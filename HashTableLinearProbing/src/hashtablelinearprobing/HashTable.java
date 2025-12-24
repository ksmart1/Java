package hashtablelinearprobing;

public class HashTable {
    private DataItem[]  hashArray; // array that is the hash table
    private int arraySize;
    private DataItem nonItem; // for deleted items
    
    public HashTable()
    {
        // Default constructor
    }
    
    public HashTable(int arraySize)
    {
        this.arraySize = arraySize;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1); // deleted key is -1
    }
    
    public int hashFunc(int key)
    {
        return key % arraySize;
    }
    
    public void insert(DataItem item)
    {
        // Assume that the hashTable is not full
        int key = item.getIData(); // retrieving key from object
        int hashVal = hashFunc(key); // calculating hash value
        
        // Check for collisions and end of table
        while(hashArray[hashVal] != null && 
                hashArray[hashVal].getIData() != -1) // Checking for collision or deleted item
        {
            System.out.println("Collision detected!");
            ++hashVal; // Linear probing -> advancing to next index
            hashVal %= arraySize; // Wraparound if necessary
        }
        
        hashArray[hashVal] = item;
    }
    
    public DataItem find(int key)
    {
        int hashVal = hashFunc(key);
        
        while(hashArray[hashVal] != null)
        {
            if(hashArray[hashVal].getIData() == key)
            {
                return hashArray[hashVal]; // Found the key
            }
            
            ++hashVal; // Linear probe to search one index to right
            hashVal %= arraySize; // Wraparound if necessary 
        }
        
        return null; // Did not find the key
    }
    
    public DataItem delete(int key)
    {
        int hashVal = hashFunc(key);
        
        while(hashArray[hashVal] != null)
        {
            if(hashArray[hashVal].getIData() == key)
            {
                DataItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        
        return null; // Could not find item to delete. 
    }
    
    public void displayHashTable()
    {
        System.out.print("Hash table: ");
        for(int i=0; i<arraySize; i++)
        {
            if(hashArray[i] != null)
            {
                System.out.print(hashArray[i].getIData() + " ");
            }
            else
            {
                System.out.print("** ");
            }
            
        }
        System.out.println();
    }
}
