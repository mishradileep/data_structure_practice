/**
 * Bubble Sort & Recursive Bubble Sort algo inplementation.
 *
 * @author Dileep Mishra mishradileep[at]gmail.com
 */


class BubbleSort {
    public int[] bubbleSort_algo(int[] input) {
        int n = input.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i -1; j++) {
                if (input[j] > input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        return input;
    }

    public void RecursiveBubbleSort(int[] input, int lenght) {
        if(lenght == 1) {
            return;
        }
        // Pass of bubble sort. Largest element is bubbled at end of the array.
        for(int i =0; i < lenght - 1; i++) {
            if(input[i] > input[i+1]) {
                int temp = input[i];
                input[i] = input[i+1];
                input[i+1] = temp;
            }
            RecursiveBubbleSort(input, lenght-1);
        }
    }

    public void printArr(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int[] myArrSorted, myArr = {7,8,10,3,12,16,9};
        BubbleSort myBubbleSort = new BubbleSort();

        System.out.println("Originl Array");
        myBubbleSort.printArr(myArr);

        System.out.println("Bubble Sort Array");
        myBubbleSort.printArr(myBubbleSort.bubbleSort_algo(myArr));

        System.out.println("Recursive Bubble Sort Array");
        myBubbleSort.RecursiveBubbleSort(myArr, myArr.length);
        myBubbleSort.printArr(myArr);
    }
}