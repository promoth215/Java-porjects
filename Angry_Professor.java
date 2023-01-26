import java.util.*;

public class Main {
    public static void AngryProfessor(int []arr, int n,int k) 
    {
         // your code here
		int c=0;
		for(int i=0;i<n;i++){
			if(arr[i]<=0){
				c++;
			}
		}
		if(c>=k){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
    }
    
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);

            int n, k;

            n = sc.nextInt();
            k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
               }
        AngryProfessor(arr, n,k);
    }
}
