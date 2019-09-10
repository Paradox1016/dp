package packages;
import java.util.*;
//最长公共子序列\非连续
public class zuichanggonggong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int len1=s1.length();
		int len2=s2.length();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		int[][] lcs=new int[len1][len2];
		
		int flag=0;
		for(int i=0;i<len2;i++) {
			if(c1[0]==c2[i]) {
				flag=1;
			}
			lcs[0][i]=flag;
		}
		flag=0;
		for(int i=0;i<len1;i++) {
			if(c2[0]==c1[i]) {
				flag=1;
			}
			lcs[i][0]=flag;
		}
		for(int i=1;i<len1;i++) {
			for(int j=1;j<len2;j++) {
				if(c1[i]==c2[j]) {
					lcs[i][j]=lcs[i-1][j-1]+1;
				}else {
					lcs[i][j]=Math.max(lcs[i-1][j],  lcs[i][j - 1]);
				}
			}
		}
		System.out.println(lcs[len1-1][len2-1]);
		//打印测试
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len2-1;j++) {
				System.out.printf(lcs[i][j]+" ");
			}
			System.out.println(lcs[i][len2-1]);
				}
	}
	
}
