package packages;
import java.util.*;
public class packfull {
	 /**
     * 预处理方法，去除肯定不可能被添加进背包的物品
     * @param c[] 每件物品的容量
     * @param w[] 每件物品的价值
     * @param v 背包容量
     * @return 被选中的物品的c-w对
     */
    public HashMap<Integer,Integer> PreProcess(int[] c,int[] w,int v){
        if(c.length != w.length){return null;}
        else{
            //tong[0]弃用，其余位置存放容量为1到v的v个桶
            int[] tong = new int[v+1];
            //第一个循环，完成桶的填充，在同一个桶中有多个元素时，选取较大的w[i]。
            for(int i=0;i<c.length;i++){
                tong[c[i]] = tong[c[i]]>w[i]?tong[c[i]]:w[i];
            }
            //第二个循环，按照桶的容量大小遍历，如果有下面的桶w小于上面的桶的，直接删去（置零）。
            int temp = 0;
            HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
            for(int j=1;j<tong.length;j++){
                if(tong[j]==0)continue;
                else if(tong[j]>temp){
                    temp = tong[j];
                    hm.put(j, tong[j]);
                }
                else tong[j] = 0;
            }
            //输出key-value对
            Set<Integer> set = hm.keySet();
            for(Integer g:set){
                System.out.println(g+","+hm.get(g));
            }
            return hm;
        }
    }

}
