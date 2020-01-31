/**
 * Selection sort algo inplementation
 *
 * @author Dileep Mishra mishradileep[at]gmail.com
 */

class SelectionSort {
    public int[] SelectionSort(int[] input) {
        int n = input.length;
        for(int i = 0; i < n; i++) {
            int min_value_index = i;
            for(int j = i + 1; j < n; j++) {
                if(input[j] < input[min_value_index]) {
                    min_value_index = j;
                }
            }
            int temp = input[min_value_index];
            input[min_value_index] = input[i];
            input[i] = temp;
        }
        return input;
    }

    public void printArr(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] myArr = {2,5,1,7,3,9};
        SelectionSort mySS = new SelectionSort();
        mySS.printArr(myArr);
        int[] myArr_sorted = mySS.SelectionSort(myArr);
        mySS.printArr(myArr_sorted);
    }
}