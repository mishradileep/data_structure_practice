class InsertionSort {
    public int[] InsertionSort_algo(int[] input) {
        int n = input.length;
        for(int i = 1; i < n; i++) {
            int temp = input[i];
            int j = i - 1;
            while(j >= 0 && input[j] > temp) {
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = temp;
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println("Originl array");
        int[] myArrSorted, myArr = {7,8,10,3,12,16,9};
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " | ");
        }
        System.out.println("");
        System.out.println("Sorted array by insertion Sort");
        InsertionSort myInsertionSort = new InsertionSort();
        myArrSorted = myInsertionSort.InsertionSort_algo(myArr);
        for (int i = 0; i < myArrSorted.length; i++) {
            System.out.print(myArrSorted[i] + " | ");
        }
    }
}