package practise.base.liu;

import java.util.Scanner;

//输入 3 个正数，判断能否构成一个三角形
public class Test04 {
    public static void main(String[] args) {
        Test04.sjx();
    }
    public static void sjx(){
        double a;
        double b;
        double c;
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入三角形第一条边长：");
        a=scanner.nextDouble();
        if (a<=0){
            System.out.println("输入不规范：请输入正确数值");
        }else{

            System.out.println("请输入三角形第二条边长：");
            b=scanner.nextDouble();
            if(b<=0){
                System.out.println("输入不规范：请输入正确数值");
            }else{
                System.out.println("请输入三角形第三条边长：");
                c=scanner.nextDouble();
                if(c<=0){
                    System.out.println("输入不规范：请输入正确数值");
                }else{
                    if(a+b>c&a+c>b&b+c>a){
                        System.out.println("这三个正数可以构成三角形");
                    }else{
                        System.out.println("这三个正数无法构成三角形");
                    }
                }
            }
        }


    }
}
