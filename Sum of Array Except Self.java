import java.util.*;
public class Main{

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b[]=new int[a];
     for(int i=0;i<a;i++) {
    	 b[i]=sc.nextInt();
     }
     int x=0;
     int m=0;
     for(int i=0;i<a;i++) {
    	 x+=b[i];
     }
     for(int i=0;i<a;i++) {
    	
    	 System.out.print(x-b[m]+" ");
    	 m++;
     }
	}

}
