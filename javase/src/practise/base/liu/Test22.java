package practise.base.liu;
//利用递归方法求5!
public class Test22 {
    public static void main(String[] args) {
        int sum=1;
        for (int i = 2; i <=5 ; i++) {
            sum=sum+i*(i-1);
        }
        System.out.println(sum);
    }
}
