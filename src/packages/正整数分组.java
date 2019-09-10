package packages;
import java.util.*;
//差最小
public class 正整数分组 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] num=new int[n];long sum=0,max=0;
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
			sum+=num[i];
		}
		int[] dp=new int[(int)(sum/2+1)];
		for(int i=0;i<n;i++) {
			for(int j=(int)(sum/2);j>0;j--) {
				if(j>=num[i]) {
					dp[j]=Math.max(dp[j],dp[j-num[i]]+num[i]);
				}
			}
		}
		for(int i=1;i<sum/2+1;i++){
			max = max >dp[i]?max:dp[i];
		}
		/*for(int i=0;i<dp.length;i++) {
			System.out.print(dp[i]+" ");
		}*/
		System.out.println(Math.abs((sum-max)-max));
	}
}
