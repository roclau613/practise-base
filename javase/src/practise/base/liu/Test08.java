package practise.base.liu;

import java.util.Scanner;

// 编写程序，对输入的一个整数，按相反顺序输出该数。例如，输入为 3578，输出为 8753。
public class Test08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        StringBuilder sb  =  new StringBuilder(String.valueOf(a));
        System.out.println(sb.reverse());
    }
}
