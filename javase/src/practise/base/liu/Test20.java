package practise.base.liu;

import sun.print.SunMinMaxPage;

//有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13…求出这个数列的前20项之和。
public class Test20 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 20; i++) {

            int b = 1;
            sum = sum + ((b + i) / i);
            b = b + i;
        }
        System.out.println(sum);
    }
}
