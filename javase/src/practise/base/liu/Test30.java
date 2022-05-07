package practise.base.liu;
//将一个数组逆序输出
public class Test30 {
    public static void main(String[] args) {


        int[] a = {1,2,3,4,5,6,7};

        for (int i=0;i<a.length ;i++ ) {
            System.out.print(a[i]);
        }
        System.out.println();
        for (int j = a.length-1;j>=0;j-- )
        {
            System.out.print(a[j]);
        }
    }

}
