package practise.base.liu;

import java.util.Arrays;
import java.util.Scanner;

//有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中
public class Test29 {
    public static void main(String[] args) {
        int[] a = new int[]{1,3,5,6,9};
        int[] b = new int[a.length+1];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = 0;
        //遍历原数组，判断输入的值，小于就直接赋值给新数组，有一次循环赋值两次
        for (int i = 0; i <a.length ; i++) {
            if(a[i]<num){
                b[i]=a[i];
            }else {
                //只添加一次
                if(index==0){
                    b[i]=num;
                    index++;
                }
                b[i+1]=a[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }

}
