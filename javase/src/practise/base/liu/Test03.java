package practise.base.liu;

import java.util.Locale;

//编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换。
public class Test03 {
    public static void main(String[] args) {

        Test03.maxToMin("k");


    }
   public static String maxToMin(String a){
        if(97<=a.hashCode()&a.hashCode()<=122){
            System.out.println(a.toUpperCase(Locale.ROOT));
        }else{
            System.out.println("该字符不是小写字母");
        }
       return null;
   }


}
