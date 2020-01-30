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
    public static void main(String[] args) {
        System.out.println("Originl array");
        int[] myArrSorted, myArr = {7,8,10,3,12,16,9};
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " | ");
        }
        System.out.println("");
        System.out.println("Sorted array");
        BubbleSort myBubbleSort = new BubbleSort();
        myArrSorted = myBubbleSort.bubbleSort_algo(myArr);
        for (int i = 0; i < myArrSorted.length; i++) {
            System.out.print(myArrSorted[i] + " | ");
        }
    }
}