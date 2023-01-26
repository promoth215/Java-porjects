import java.io.*;
import java.util.*;

public class Main {
    public static void printFindParticipants(int[] arr, int n, int k) {
        //Write code here and print output
		int c=0;
		for(int i=0;i<n;i++){
				if(arr[i]>=arr[k - 1] && arr[i] > 0){
					c++;
				}
		}
		System.out.println(c);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
      	int k=sc.nextInt();
      	int[] arr= new int[n];

      	for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        printFindParticipants(arr,n,k);
        sc.close();
        
    }
}
