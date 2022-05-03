package practise.base.liu;

import java.util.Arrays;

//Subject1： 编写程序实现对给定的 4 个整数从大到小的顺序排列。
public class Test01 {
    public static void main(String[] args) {
        int[] a={5,3,7,8};
        System.out.println(maxToMin(a));
    }
    public static String maxToMin(int[] arr) {
        int sum = 0;
// 冒泡排序
        for (int i = 0;i < arr.length-1;i++){
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j+1]) {
                    sum = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = sum;
                }
            }
        }
        return Arrays.toString(arr);
    }
}
