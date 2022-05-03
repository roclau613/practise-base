package practise.base.liu;
//编写程序，输出 200~500 之间的所有素数。
public class Test10 {
    public static void main(String[] args) {
        for(int i=200;i<=500;i++) {
            boolean sushu=true;
            for(int j=2;j<i;j++) {
                if(i%j==0) {
                    sushu=false;
                    break;
                }
            }
            if(sushu) {
                System.out.println(i+"是素数");
            }
        }

    }
}
