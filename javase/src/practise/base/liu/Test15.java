package practise.base.liu;

import java.lang.reflect.Array;
import java.util.Arrays;

//输入三个整数x,y,z，请把这三个数由小到大输出
public class Test15 {
    public static void main(String[] args) {
        System.out.println(Test15.px(3,2,1));
    }
    public static String px(int a,int b,int c){
        int [] sz={a,b,c};
        for (int i = 0; i <sz.length-1 ; i++) {
            for (int j = 0; j <sz.length-i-1 ; j++) {
                    int d;
                    if (sz[j]>sz[j+1]){
                        d=sz[j];
                        sz[j]=sz[j+1];
                        sz[j+1]=d;
                    }
            }
        }
        return Arrays.toString(sz);
    }
}
