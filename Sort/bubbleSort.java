package Sort;

class bubbleSort {
    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] testCase1 = {5, 1, 4, 2, 8};
        int[] sorted1 = sort(testCase1);
        System.out.print("Test Case 1: ");
        printArray(sorted1);

        int[] testCase2 = {3, 0, -2, 1, 5, -1, 2, 4};
        int[] sorted2 = sort(testCase2);
        System.out.print("Test Case 2: ");
        printArray(sorted2);

        int[] testCase3 = {1, 2, 3, 4, 5};
        int[] sorted3 = sort(testCase3);
        System.out.print("Test Case 3: ");
        printArray(sorted3);

        int[] testCase4 = {5, 4, 3, 2, 1};
        int[] sorted4 = sort(testCase4);
        System.out.print("Test Case 4: ");
        printArray(sorted4);

        int[] testCase5 = {1};
        int[] sorted5 = sort(testCase5);
        System.out.print("Test Case 5: ");
        printArray(sorted5);

        int[] testCase6 = {};
        int[] sorted6 = sort(testCase6);
        System.out.print("Test Case 6: ");
        printArray(sorted6);

        int[] testCase7 = {7, 3, 5, 3, 7, 2, 1, 9, 0};
        int[] sorted7 = sort(testCase7);
        System.out.print("Test Case 7: ");
        printArray(sorted7);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
