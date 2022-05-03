package practise.base.liu;

import java.util.Scanner;

//编写程序，从键盘输入一个 0~99999 之间的任意数，判断输入的数是几位数？
public class Test06 {
    public static void main(String[] args) {
        Test06.jws();
    }
    public static void jws(){
        System.out.println("请输入0-99999之间的任意数，判断输入的是几位数");
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        if(a/10000>1){
            System.out.println("输入的数是5位数");
        }else if(a/1000>1){
            System.out.println("输入的数是4位数");
        }else if(a/100>1){
            System.out.println("输入的数是3位数");
        }else if(a/10>1){
            System.out.println("输入的数是2位数");
        }else if(a/1>1){
            System.out.println("输入的数是1位数");
        }

    }
}
