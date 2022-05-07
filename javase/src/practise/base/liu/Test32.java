package practise.base.liu;

import java.util.Scanner;

// 打印出杨辉三角形（要求打印出10行如下图） ,完美杨辉三角
public class Test32 {

        /**
         * 定义一个递归方法，获得在一个位置上的数字
         * @param x
         * @param y
         * @return
         */
        public static int number(int x,int y){
            if(y==1 || x==y){
                return 1;
            }else{
                return number(x-1,y-1)+number(x-1,y);
            }
        }
        public static void prints(int row){
            for (int i = 0; i <= row; i++) {
                //打印空格
                for (int j = 1; j <= row-i ; j++) {
                    System.out.print(" ");
                }
                //打印数字
                for (int k = 1; k <= i; k++) {
                    System.out.print(number(i,k)+" ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入要打印几行啊？");
            int row = sc.nextInt();
            prints(row);

        }


}
