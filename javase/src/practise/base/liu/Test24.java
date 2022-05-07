package practise.base.liu;

import java.util.Scanner;

//给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字
public class Test24 {
    public static void main(String[] args) {
        System.out.println("请输入一个不多于5位的正正数:");
        Scanner scr =new Scanner(System.in);
        int a =scr.nextInt();
        if(a<=0||a>99999){
            System.out.println("输入错误");
        }else if(a>0&a<10){
            System.out.println("此数为1位数");
            System.out.println("该数逆序为："+a);
        }
        else if(a>=10&a<100){
            System.out.println("此数为2位数");
            System.out.println("该数逆序为："+a);
        }
        else if(a>0&a<10){
            System.out.println("此数为1位数");
            System.out.println("该数逆序为："+a);
        }
        else if(a>0&a<10){
            System.out.println("此数为1位数");
            System.out.println("该数逆序为："+a);
        }
        else if(a>0&a<10){
            System.out.println("此数为1位数");
            System.out.println("该数逆序为："+a);
        }
    }
}
