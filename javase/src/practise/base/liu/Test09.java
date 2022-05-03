package practise.base.liu;
//用 while 循环，计算 1~200 之间所有 3 的倍数之和。
public class Test09 {
    public static void main(String[] args) {
        double sum=0;
        double a=1;
        while(a<=200){
            if(a%3==0){
                sum+=a;
                a++;
            }else{
                a++;
            }
        }
        System.out.println(sum);
    }
}
