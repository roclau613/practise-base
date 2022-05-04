package practise.base.liu;

import java.util.Date;
import java.util.Scanner;

//编写程序，对输入的年、月、日，给出该天是该年的第多少天？
public class Test14 {
    public static void main(String[] args) {
        while (true){
            System.out.println("请输入，月，日. 格式如下：2000-01-01");
            Scanner scanner=new Scanner(System.in);
            String str =scanner.nextLine();
            if(str.equals("exit")){
                System.out.println("系统退出");
                break;
            }
            Test05.day(str);
        }
    }
    public static void day(String date){
        int sum =0;
        int year= Integer.parseInt(date.substring(0,4));
        int moth= Integer.parseInt(date.substring(5,7));
        int day= Integer.parseInt(date.substring(8,10));
        for (int i = 1; i <moth ; i++) {
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 12:
                    sum+=31;
                    break;
                case  4:
                case  6:
                case  8:
                case  10:
                    sum+=30;
                    break;
                case 2:
                    if(year%4==0&& year%100!=0||year%400==0){
                        sum+=29;

                    }else{
                        sum+=30;
                    }
            }
        }
        System.out.println("您输入的日期是该年的第："+(sum+day)+"天");
        System.out.println("输入exit 退出系统");

    }
}
