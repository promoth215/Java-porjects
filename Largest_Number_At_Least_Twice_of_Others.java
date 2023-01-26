import java.util.*;

public class Main {
    
    public static int LargestElement(int[] nums, int n) {
        // Write code here
	 
         int m=0;
		for(int i=0;i<n;i++){
			if(nums[m]<nums[i]){
				m=i;
			}
		}
		for(int i=0;i<n;i++){
			if(m!=i&&nums[m]<nums[i]*2){
				return -1;
			}
		}
		return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        n = sc.nextInt();
        
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(LargestElement(nums, n));
    }
}
