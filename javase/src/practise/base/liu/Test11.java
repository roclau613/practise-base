package practise.base.liu;
//有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
public class Test11 {
    public static void main(String[] args) {
        Test11.zc();
    }

    public static void zc(){
        int count =0;
        for (int a = 1; a <5; a++) {
            for (int b = 1; b <5 ; b++) {
                for (int c = 1; c <5 ; c++) {
                    System.out.print(a);
                    System.out.print(b);
                    System.out.println(c);
                    count++;
                }
            }
        }
        System.out.println("总共："+count);
    }
}
