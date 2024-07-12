class BinarySearchIterativ{
    public static int binarySearch(int[] haystack, int needle) {
        int lo = 0;
        int hi = haystack.length-1;

        while (hi > lo) {
            int mid =  lo + (hi-lo)/2;
            if (haystack[mid] == needle) {
                return mid;
            } else if (haystack[mid] < needle) {
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] haystack1 = { 2, 3, 4, 10, 40 };
        int needle1 = 10;
        int result1 = binarySearch(haystack1, needle1);
        System.out.println("Test Case 1: Element found at index " + result1);

        int[] haystack2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int needle2 = 5;
        int result2 = binarySearch(haystack2, needle2);
        System.out.println("Test Case 2: Element found at index " + result2);

        int[] haystack3 = { 10, 20, 30, 40, 50 };
        int needle3 = 60;
        int result3 = binarySearch(haystack3, needle3);
        System.out.println("Test Case 3: Element not present, result " + result3);

        int[] haystack4 = {};
        int needle4 = 1;
        int result4 = binarySearch(haystack4, needle4);
        System.out.println("Test Case 4: Empty array, result " + result4);

        int[] haystack5 = { 1, 1, 1, 1, 1 };
        int needle5 = 1;
        int result5 = binarySearch(haystack5, needle5);
        System.out.println("Test Case 5: All elements same, result " + result5);
    }
}
