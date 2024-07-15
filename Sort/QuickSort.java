package Sort;

public class QuickSort{
    
    // Die Hauptmethode, die den QuickSort-Algorithmus aufruft
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partitioniere das Array und erhalte den Pivot-Index
            int pi = partition(arr, low, high);
            
            // Rekursiv sortiere die Elemente vor und nach der Partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    // Die Methode, die das Array partitioniert und den Pivot-Index zurückgibt
    private static int partition(int[] arr, int low, int high) {
        // Wähle das letzte Element als Pivot
        int pivot = arr[high];
        int i = (low - 1); // Index des kleineren Elements
        
        for (int j = low; j < high; j++) {
            // Wenn das aktuelle Element kleiner oder gleich dem Pivot ist
            if (arr[j] <= pivot) {
                i++;
                // Tausche arr[i] und arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Tausche arr[i + 1] und arr[high] (oder den Pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
}
