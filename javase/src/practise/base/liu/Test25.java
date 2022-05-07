package practise.base.liu;

import java.util.Scanner;

//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同
public class Test25 {
    public static void main(String[] args) {
        System.out.println("请输入一个五位数：");
        Scanner scr=new Scanner(System.in);
        int x =scr.nextInt();
        int a =x/10000;
        int b =x%10000/1000;

        int c =x%100/10;
        int d =x%10;
        if(x<10000||x>99999){
            System.out.println("该数不是五位数");
        }else if(a==d&&b==c){
            System.out.println("该数为回文数");
        }
    }
}
