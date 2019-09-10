package packages;
//最长连续公共子序列
import java.util.*;
public class 最长连续公共 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int len1=s1.length();
		int len2=s2.length();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		int[][] dp=new int[len1+1][len2+1];
		for (int i = 0; i < dp.length; i++) {

			dp[i][0] = 0;

		}

		for (int i = 0; i < dp[0].length; i++) {

			dp[0][i] = 0;

		}
		int max=0;
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(c1[i-1]==c2[j-1]) {
					if(i==0||j==0) {
					dp[i][j]=1;
				}else {
					dp[i][j]=dp[i-1][j-1]+1;
				}
			}else {
				dp[i][j]=0;
			}
				max=Math.max(max, dp[i][j]);
			}
			
		}
		System.out.println(max);
		//打印测试
				for(int i=0;i<dp.length;i++) {
					for(int j=0;j<dp[0].length-1;j++) {
						System.out.printf(dp[i][j]+" ");
					}
					System.out.println(dp[i][dp[0].length-1]);
						}
	}
}
