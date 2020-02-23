import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0){
	     int n =sc.nextInt();
	     int arr[] = new int[n];
	     Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	     for(int i=0; i<n ; i++){
	         int k =sc.nextInt();
	         arr[i]= k;
	         if(map.get(k)==null)
	         map.put(k, 1);
	         else
	         map.put(k, map.get(k)+1);
	     }
	     Set<Integer> set = map.keySet();
	     int flag=0;
	     for(Integer key :set){
	         Integer value = map.get(key);
	         if(value>n/2){
	             System.out.println(key);
	             flag=1;
	             break;
	         }
	         
	     }
	     if(flag==0){
	         System.out.println(-1);
	     }
	     
	     
       }
	 }
}