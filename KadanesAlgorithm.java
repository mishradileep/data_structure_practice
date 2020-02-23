/**
 * kadane's Algo sort algo inplementation.
 *
 * @author Dileep Mishra mishradileep[at]gmail.com
 */

import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.IOException; 


class KadanesAlgorithm {
    public int KadanesSum(int[] input) {
        int localSum = input[0];
        int gloablSum = input[0];
        for(int i = 1; i < input.length; i++) {
            localSum = Math.max(input[i], localSum + input[i]);
            gloablSum = Math.max(localSum, gloablSum);
        }

        return gloablSum;
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

    public static void main(String[] args) throws IOException {
        //Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String name = reader.readLine(); 
  
        // Printing the read line 
        System.out.println(name);  

        int[] myArry = {1,2,3};
        KadanesAlgorithm ob = new KadanesAlgorithm();
        System.out.print("Input Array = ");
        ob.printArr(myArry);
        System.out.println("Max sum = " + ob.KadanesSum(myArry));
    }
}