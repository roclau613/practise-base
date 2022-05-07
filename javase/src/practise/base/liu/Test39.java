package practise.base.liu;
/*海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，
问海滩上原来最少有多少个桃子？*/
public class Test39 {
    public static void main(String[] args) {
        for (int i = 1;; i++) {
            int sum = i;
            for (int j = 0; j < 5; j++) {
                if( sum % 5 != 1){
                    break;
                }
                sum = (sum-1) / 5 * 4;
                if( j == 4){
                    System.out.println(i);
                    return ;
                }
            }
        }

    }
}
