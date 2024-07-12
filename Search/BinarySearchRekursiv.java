public class BinarySearchRekursiv {
    
    public static int binarySearch(int lo, int hi, int[] haystack, int needle)
    {
        if (lo >= hi)
        {
            return -1;
        }
        int mid = lo + (hi-lo)/2;
        if(haystack[mid] == needle)
        {
            return mid;
        }
        else if (haystack[mid]<needle)
        {
            return binarySearch(mid+1, hi, haystack, needle);
        }
        else
        {
            return binarySearch(lo, mid, haystack, needle);
        }
    }

    public static void main(String[] args) {
        int[] haystack1 = {2, 3, 4, 10, 40};
        int needle1 = 10;
        int result1 = binarySearch(0, haystack1.length, haystack1, needle1);
        System.out.println("Test Case 1: Element found at index " + result1);

        int[] haystack2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int needle2 = 5;
        int result2 = binarySearch(0, haystack2.length, haystack2, needle2);
        System.out.println("Test Case 2: Element found at index " + result2);

        int[] haystack3 = {10, 20, 30, 40, 50};
        int needle3 = 60;
        int result3 = binarySearch(0, haystack3.length, haystack3, needle3);
        System.out.println("Test Case 3: Element not present, result " + result3);

        int[] haystack4 = {};
        int needle4 = 1;
        int result4 = binarySearch(0, haystack4.length, haystack4, needle4);
        System.out.println("Test Case 4: Empty array, result " + result4);

        int[] haystack5 = {1, 1, 1, 1, 1};
        int needle5 = 1;
        int result5 = binarySearch(0, haystack5.length, haystack5, needle5);
        System.out.println("Test Case 5: All elements same, result " + result5);

        int[] haystack6 = {1, 3, 5, 7, 9, 11, 13};
        int needle6 = 7;
        int result6 = binarySearch(0, haystack6.length, haystack6, needle6);
        System.out.println("Test Case 6: Element found at index " + result6);

        int[] haystack7 = {1, 3, 5, 7, 9, 11, 13};
        int needle7 = 2;
        int result7 = binarySearch(0, haystack7.length, haystack7, needle7);
        System.out.println("Test Case 7: Element not present, result " + result7);
    }
}
