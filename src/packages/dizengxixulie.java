package packages;
//最长递增子序列
import java.util.*;
public class dizengxixulie {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int[] dp=new int[n];
		int maxCount=0;
		for(int i=0;i<n;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(a[j]<a[i]) {
					dp[i]=dp[i]>dp[j]+1?dp[i]:dp[j]+1;
				}
				if(dp[i]>maxCount) {
					maxCount=dp[i];
				}
				
			}
			for(int k=0;k<n;k++) {System.out.print(dp[i]+" ");}
		}
		
	}
}
