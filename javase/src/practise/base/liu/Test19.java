package practise.base.liu;
//打印出如下图案（菱形）
public class Test19 {
    public static void main(String[] args) {
        //上半部
        for (int i = 1; i <=6; i++){
            for (int j = 0; j <= 6 - i;j++){
                System.out.print(" ");
            }
            for (int xing = 1; xing <= i ;xing++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        //下半部
        for (int i = 1; i <=5 ; i++) {
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int xing = 5; xing >= i ;xing--){
                System.out.print(" *");
            }
            System.out.print("\n");
        }



    }
}
