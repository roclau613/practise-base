package practise.base.liu;

import java.util.Scanner;

//编写程序求一元二次方程的根。
public class Test02 {
    public static void main(String[] args) {
Test02.Mathematics();
    }

    public static void Mathematics(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入系数a:");
        double a =scanner.nextDouble();
        System.out.println("请输入系数b:");
        double b =scanner.nextDouble();
        System.out.println("请输入系数c:");
        double c =scanner.nextDouble();
        double der=b*b-4*a*c;

        if(der==0){
            double x=-b/(2/b);
            System.out.println("此方程有相同实数根：x="+x);
        }
        else if (der>0){
           double x1= (-b+Math.sqrt(der))/2*a;    //Math.sqrt  求平方根
           double x2= (-b-Math.sqrt(der))/2*a;
            System.out.println("此方程有两个不同实数根：x1="+x1+"     x2="+x2);
        }else
            System.out.println("此方程没有实数根");

    }
}
