package practise.base.liu;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
public class Test34 {
    public static void main(String[] args) {

        List<String> list=new LinkedList<String>();
        Scanner input=new Scanner(System.in);

        System.out.println("请输入一串数字：");
        String str=input.nextLine();
        System.out.println("请输入后移位置的m个数：");
        int m=input.nextInt();

        //从尾部开始遍历
        for (int i = str.length()-1; i >=0; i--) {
            //只要大于等于m,就依次把当前值加到集合的头部
            if(i>=m) {
                ((LinkedList<String>) list).addFirst(str.substring(i, i+1));
                //否则，就加到length-m的位置，因为遍历是逆序的
            }else {
                ((LinkedList<String>) list).add(str.length()-m,str.substring(i, i+1));
            }
        }
        //遍历输出结果
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

    }

}
