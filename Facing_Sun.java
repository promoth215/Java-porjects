import java.util.*;

public class Main {
    public static int facingSun(int n, int arr[]) {
        //Write your code here
		int c=1;
		int t=arr[0];
		for(int i=1;i<n;i++){
			if(arr[i]>t){
				c++;
				t=arr[i];
			}
		}
		return c;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        System.out.println(facingSun(n,array));
    }
}
