package practise.base.liu;

import java.util.Scanner;

//编写一个函数，输入n为偶数时，调用函数求1/2+1/4+…+1/n,当输入n为奇数时，调用函数1/1+1/3+…+1/n
public class Test37 {
    private static String str = "";

    private static double sum = 0;

    public static void main(String[] args) {

        System.out.println("请输入一个数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //for循环实现
        // getSum(num);

        // System.out.println(str.substring(0, str.length() - 2) + "  的和为：" + sum);


        //递归实现
        getSum2(num);
        //截取掉多余的空格和加号
        System.out.println(str.substring(0, str.length() - 2) + "  的和为：" + sum);
    }

    /**
     * 输入n为偶数时，调用函数求1/2+1/4+…+1/n,当输入n为奇数时，调用函数1/1+1/3+…+1/n
     */
    private static void getSum2(int num) {
        if (num % 2 == 0) {
            for (double i = 2; i <= num; i += 2) {
                str = str + "1/" + i + " + ";
                sum += 1 / i;
            }
        } else {
            for (double i = 1; i <= num; i += 2) {
                str = str + "1/" + i + " + ";
                sum += 1 / i;
            }
        }
    }

    /**递归实现
     * 输入n为偶数时，调用函数求1/2+1/4+…+1/n,当输入n为奇数时，调用函数1/1+1/3+…+1/n
     *
     * @param num
     */
    private static void getSum(int num) {
        sum = sum + 1.0 / num;
        if (num > 2) {
            getSum(num - 2);
        }
        str = str + "1/" + num + " + ";
    }

}
