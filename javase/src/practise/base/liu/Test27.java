package practise.base.liu;

import java.lang.reflect.Array;
import java.util.Arrays;

//对10个数进行排序
public class Test27 {
    public static void main(String[] args) {
        double [] a ={1,56,54,88,91,44};

        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j <a.length-i-1 ; j++) {
                if (a[j] < a[j+1]) {
                    double b=0;
                    b=a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
