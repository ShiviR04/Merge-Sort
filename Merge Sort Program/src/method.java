import java.util.Arrays;

public class method {
    static int [] printArray;
    public static void mergeSort(int array[], int left, int right) {
        if (array.length == 1){
            printArray = array;
            return;
        }
        if (left >= right) return;
        int middle = (left + right) / 2;
        mergeSort(array, left, middle);
        mergeSort(array, middle + 1, right);
        mergeRecursion(array, left, middle, right);
        printArray = array;
    }

    private static void mergeRecursion(int array[], int left, int middle, int right) {
        int startEnd = middle;
        int endStart = middle + 1;
        int l = left;
        while ((l <= startEnd) && (endStart <= right)) {
            if (array[left] < array[endStart])  left++;
            else {
                int temp = array[endStart];
                for (int j = endStart - 1; j >= left; j--) array[j + 1] = array[j];
                array[left] = temp;
                left++;
                startEnd++;
                endStart++;
            }
        }
    }

    public static void print() {
        if (printArray.length == 1) {
            System.out.println(" ");
            System.out.print(printArray[0]);
        } else {
            System.out.println(" ");
            for (int i = 0; i < printArray.length; i++) System.out.print(printArray[i] + ", ");
        }
    }
    public static void binarySearch(int[] array, int arrayLength, int search) {
        int half = Arrays.binarySearch(array, search);
        if (half >= 0) System.out.println("\n" + search + " is in the array");
        else System.out.println("\n" + search + " is not in the array");
    }
}
