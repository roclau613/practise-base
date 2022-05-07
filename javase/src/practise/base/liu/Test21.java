package practise.base.liu;
//求1+2!+3!+…+20!的和
public class Test21 {
    public static void main(String[] args) {
        int sum =1;
        for (int i = 2; i <=20 ; i++) {
            sum=sum+i*(i-1);

        }
        System.out.println(sum);
    }
}
