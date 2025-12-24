package memoryallocation;
import java.util.*;

public class MemoryAllocation {

    public static void main(String[] args) {
        // Available memory blocks 
        List<Integer> availableBlocks = new ArrayList<>(Arrays.asList(125,350,300,200,750,600));

        // Queue of processes by size
        Queue<Integer> processQueue = new LinkedList<>(Arrays.asList(200, 115, 375, 358, 500));

        while (!processQueue.isEmpty()) {
            int processSize = processQueue.poll();
            boolean allocated = false;

            for (int i = 0; i < availableBlocks.size(); i++) {
                int blockSize = availableBlocks.get(i);
                if (blockSize >= processSize) {
                    System.out.println("Allocating process of size " + processSize + " to block of size " + blockSize);

                    int remaining = blockSize - processSize;

                    // Replace current block with remaining space if any
                    if (remaining > 0) {
                        availableBlocks.set(i, remaining);
                    } else {
                        availableBlocks.remove(i);
                    }

                    allocated = true;
                    break;
                }
            }

            if (!allocated) {
                System.out.println("Process of size " + processSize + " could not be allocated.");
            }

            System.out.println("Available Blocks: " + availableBlocks);
            System.out.println("Remaining Processes: " + processQueue);
            System.out.println("#####------------------------#####");
        }
    }
}
