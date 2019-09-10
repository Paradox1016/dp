package packages;
import java.util.*;
//二分的方法找到，不递增时候可以替换的数的位置。
public class zizengzixulie2 {
	public static void main(String[] args) {
		int[] array= {2,1,5,3,6,4,8,9,7};
		System.out.println(getLength(array));
	}
	private static int getLength(int[] array) {
	    int[] assistArray = new int[array.length];
	    assistArray[0] = array[0];
	    int length = 0;
	    for (int number : array) {
	        if (assistArray[length] < number) {
	            assistArray[++length] = number;
	        } else {
	            int low = 0;
	            int high = length;
	            while (low < high) {
	                int middle = (low + high) >> 1;
	                if (assistArray[middle] < number) {
	                    low = middle + 1;
	                } else {
	                    high = middle - 1;
	                }
	            }
	            if (assistArray[low] < number && (low + 1) < assistArray.length) {
	                assistArray[low + 1] = number;
	            } else {
	                assistArray[low] = number;
	            }
	        }
	        for (int tmp : assistArray) {
		        System.out.print(tmp+" ");
		    }
	        System.out.println("---------");
	    }
	   
	    return length + 1;
	}
}
