/**
 * Merge sort algo inplementation.
 *
 * @author Dileep Mishra mishradileep[at]gmail.com
 */

class MergeSort {

    void merge(int input[], int left, int mid, int right) {
        // Find size of two arrays.
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;

        // Create temp arrays.
        int[] leftArr = new int[sizeLeft];
        int[] rightArr = new int[sizeRight];

        // Dump values into temp arrays.
        for (int i = 0; i < sizeLeft; ++i) {
            leftArr[i] = input[left + i];
        }
        for (int j = 0; j < sizeRight; ++j) {
            rightArr[j] = input[mid + 1 + j];
        }

        // Merge these temp arrays now.
        int i =0, j = 0, k = left;
        while (i < sizeLeft && j < sizeRight) {
            if (leftArr[i] <= rightArr[j]) {
                input[k] = leftArr[i];
                i++;
            } else {
                input[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Dump remain elements also.
        while (i < sizeLeft) {
            input[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < sizeRight) {
            input[k] = rightArr[j];
            j++;
            k++;
        }
    }

    /**
     * Base method to device the array in sub arrays and call recursively until single element arrays remains.
     * @param input Integer Array
     * @param left Integer
     * @param right
     */
    public void sort(int input[], int left, int right) {
        if (left < right) {
            // Find mid.
            int mid = (left + right) / 2;

            // Sort left and right halves.
            sort(input, left, mid);
            sort(input, mid + 1, right);

            // Merge sorted halves.
            merge(input, left, mid, right);
        }
    }

    /**
     * helper method to print arry.
     * @param arr Interger Array
     */
    public void printArr(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] myArr = {2,5,1,7,3,9};
        MergeSort ob = new MergeSort();

        System.out.println("Input Array");
        ob.printArr(myArr);

        ob.sort(myArr, 0, myArr.length - 1);

        System.out.println("Sorted Array");
        ob.printArr(myArr);

    }
}