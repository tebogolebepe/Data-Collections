import java.util.HashMap;

public  class Collections{

public static int maxUniqueNum(int numbers[],
        int numCounted, int arraySize)
        {
        int max = 0;

        // Generate all subarrays of size M 
        for (int i = 0; i < numCounted - arraySize; i++) {
        int currentUnique = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int k = i; k < i + arraySize; k++) {

        // if the key is new to the map,
        // push the key in map and increment
        // count for unique number
        if (!map.containsKey(numbers[k])) {
        map.put(numbers[i], 1);
        currentUnique++;
        continue;
        }
        }

        if (currentUnique > max)
        max = currentUnique;
        }

        return max;
        }

// Driver Code
public static void main(String[] args)
        {
        int[] numbers = { 6 ,2 ,6 ,8 ,3 ,7 ,1 ,4 ,4 };
        int numCounted = 9;

        int arraySize = 3;

        System.out.println(maxUniqueNum(numbers, numCounted, arraySize));
        }
        }