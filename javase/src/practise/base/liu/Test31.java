package practise.base.liu;

import java.util.Scanner;

//取一个整数a从右端开始的4～7位
public class Test31 {
    public static void main(String[] args) {
        System.out.println("请输入一个8位数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        char[] chars = String.valueOf(number).toCharArray();

        int j = 0;
        for (int i = chars.length - 1; i > 0; i--) {
            j++;
            if (j >= 4 && j <= 7) {
                System.out.print(chars[i]+"  ");
            }
        }
    }

}
