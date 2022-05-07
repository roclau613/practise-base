package practise.base.liu;

import java.util.Scanner;

// 写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度
public class Test36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String a = input.nextLine();
        System.out.println(getlength(a));
    }

    public static int getlength(String a) {
        int t = a.length();
        return t;

    }
}
