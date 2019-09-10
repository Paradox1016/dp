package packages;
//最长递增子序列
import java.util.*;
public class zixulie {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		double d[]=new double[n+1];
		d[0]=Integer.MIN_VALUE;
		d[1]=num[0];
		int Len=1;
		int p,r,m;
		//二分法找
		for(int i=1;i<n;i++) {
			p=0;r=Len;
			while(p<=r) {
				m =(p+r)/2;
				if(d[m]<num[i]) {
					p=m+1;
				}else {
					r=m-1;
				}
			}
			d[p]=num[i];
			if(p>Len) {
				Len++;
			}
		}
		System.out.println(Len);
	}

}
