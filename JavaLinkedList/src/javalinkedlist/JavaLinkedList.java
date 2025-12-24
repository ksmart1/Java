package javalinkedlist;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class JavaLinkedList {

    public static void main(String[] args) {
        // Lab 5 - Java LinkedList
        
        boolean sentinel = true;
        final int QUIT = 999;
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<>();
        
        while(sentinel)
        {
            System.out.print("Enter a non-negative number or 999 to QUIT: ");
            int userNum = sc.nextInt();
            if(userNum < 0)
            {
                System.out.println("Invalid entry! Please enter a positive number!");
            }
            else if (userNum == QUIT)
            {
                sentinel = false;
            }
            else
            {
                nums.add(userNum);
            }
        }
        
        getMaxNum(nums);
        getMinNum(nums);
        
        LinkedList<Integer> sortedNums = sortLinkedList(nums);
        
        System.out.println("Sorted list: ");
        for (int i : sortedNums)
        {
            System.out.print(i + " ");
        }
        
        System.out.print("\nEnter a number to insert into the sorted list: ");
        int insertNum = sc.nextInt();
        insertIntoSortedLinkedList(sortedNums, insertNum);
        
        System.out.println("Updated sorted list after insertion:");
        for (int i : sortedNums)
        {
            System.out.print(i + " ");
        }
        
        LinkedList<Integer> mixedNums = new LinkedList<>();
        sentinel = true;
        while(sentinel)
        {
            System.out.print("\nEnter a number or 999 to QUIT: ");
            int userNum = sc.nextInt();
            if(userNum == QUIT)
            {
                sentinel = false;
            }
            else
            {
                mixedNums.add(userNum);
            }
        }
        
        removeNegativeNumbers(mixedNums);
        
        System.out.println("List with negative numbers removed:");
        for (int i : mixedNums)
        {
            System.out.print(i + " ");
        }
    }
    
    public static void getMaxNum(LinkedList<Integer> nums)
    {
        Collections.sort(nums);
        
        System.out.println("Maximum number in list: " + nums.getLast());
    }
    
    public static void getMinNum(LinkedList<Integer> nums)
    {
        Collections.sort(nums);
        
        System.out.println("Minimum number in list: " + nums.getFirst());
    }
    
    public static LinkedList<Integer> sortLinkedList(LinkedList<Integer> nums)
    {
        LinkedList<Integer> sortedList = new LinkedList<>(nums);
        Collections.sort(sortedList);
        
        return sortedList;
    }
    
    public static void insertIntoSortedLinkedList(LinkedList<Integer> sortedList, int num)
    {
        Iterator<Integer> iterator = sortedList.iterator();
        int index = 0;
        while(iterator.hasNext())
        {
            if(iterator.next() > num)
            {
                sortedList.add(index, num);
                return;
            }
            index++;
        }
        sortedList.add(num);
    }
    
    public static void removeNegativeNumbers(LinkedList<Integer> nums)
    {
        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext())
        {
            if(iterator.next() < 0)
            {
                iterator.remove();
            }
        }
    }
}
