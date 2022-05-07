package practise.base.liu;
//输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组
public class Test33 {
    public static void main(String[] args) {
        int[] arr = new int[]{44, 56, 89, 32, 11, 78, 55, 82, 02, 68, 44, 27};

        prinArr(arr);

        changeArr(arr);
    }

    private static void changeArr(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;

        //便利数组 交换最值
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("大  " + max + "   " + "小  " + min);
        //得到最值后交换
        int tem = 0;
        tem = arr[0];
        arr[0] = arr[maxIndex];
        arr[maxIndex] = tem;

        tem = arr[arr.length - 1];
        arr[arr.length - 1] = arr[minIndex];
        arr[minIndex] = tem;

        prinArr(arr);
    }

    private static void prinArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
