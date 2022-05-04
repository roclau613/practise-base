package practise.base.liu;
/*企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
 高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，
 可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？*/
public class Test12 {
    public static void main(String[] args) {

            Test12.jj(800000);
    }
    public static void jj(double lr){
        double a=100000;
        double b =200000;
        double c =400000;
        double d =600000;
        double e =1000000;
        double jj =0;
        if (lr<=a){
                jj=lr*0.1;
            System.out.println("奖金为："+jj);
        }else if ((lr>a&lr<=b)){
            jj=10000+(lr-a)*0.75;
            System.out.println("奖金为："+jj);
        }else if ((lr>b&lr<=c)){
            jj=10000+7500+(lr-b)*0.05;
            System.out.println("奖金为："+jj);
        }else if ((lr>c&lr<=d)){
            jj=10000+7500+10000+(lr-c)*0.03;
            System.out.println("奖金为："+jj);
        }else if ((lr>d&lr<=e)){
            jj=10000+7500+10000+6000+(lr-d)*0.15;
            System.out.println("奖金为："+jj);
        }else if ((lr>e)){
            jj=10000+7500+10000+6000+6000+(lr-e)*0.01;
            System.out.println("奖金为："+jj);
        }

    }
}
