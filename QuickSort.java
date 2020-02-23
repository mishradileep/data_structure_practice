/**
 * Quick sort algo inplementation.
 *
 * @author Dileep Mishra mishradileep[at]gmail.com
 */
class QuickSort {
    public int partition(int[] input, int low, int high) {
        int pivot = input[high];
        int i = low -1;
        for(int j = low; j < high; j++) {
            if(input[j] < pivot) {
                i++;

                // Swap input[i] with input[j].
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        // Swap input[i+1] with input[high].
        int temp = input[i+1];
        input[i+1] = input[high];
        input[high] = temp;

        return i + 1;
    }
    public void sort(int[] input, int low, int high) {
        if (low < high) {
            int pivot;
            pivot = partition(input, low, high);

            sort(input, low, pivot - 1);
            sort(input, pivot + 1, high);
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
        QuickSort ob = new QuickSort();

        System.out.println("Input Array");
        ob.printArr(myArr);

        ob.sort(myArr, 0, myArr.length - 1);

        System.out.println("Sorted Array");
        ob.printArr(myArr);
    }
}