package practise.base.liu;
//编写程序，给定一个学生成绩，给出相应等级： 90~100 优秀 80~89 良好 70~79 中等 60~69 及格 0~59 不及格
public class Test07 {
    public static void main(String[] args) {
            Test07.cj(88);
    }
    public  static  void cj(double a){
        int b = (int) (a/10);
        switch (b){
            case 10:
                System.out.println("优秀");break;
            case 9:
                System.out.println("优秀");break;
            case 8:
                System.out.println("良好");break;
            case 7:
                System.out.println("中等");break;
            case 6:
                System.out.println("及格");break;
            case 5:
                System.out.println("不及格");break;
            case 4:
                System.out.println("不及格");break;
            case 3:
                System.out.println("不及格");break;
            case 2:
                System.out.println("不及格");break;
            case 1:
                System.out.println("不及格");break;
            case 0:
                System.out.println("不及格");break;


        }
    }
}
