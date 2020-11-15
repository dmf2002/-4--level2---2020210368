package leval2;

public class Mainrole extends Role implements Runnable{
    int zhandouli = 10;
    void attrack(Xiejiao xiejiao) {
        int m = xiejiao.getLife();
        for (int a = 1; ; a++) {
            if (m!= 0&&m>0) {
                if (a % 2 == 0) {
                    m -= zhandouli;
                    System.out.println("小虾米使用普通攻击对" + xiejiao.getName() + "造成" + zhandouli + "点伤害");
                }
                else {
                    int n=this.getLife();
                    n-= xiejiao.zhandouli;
                    System.out.println(xiejiao.getName()+"使用普通攻击对" + this.getName() + "造成" + xiejiao.zhandouli + "点伤害");
                }
            }
            else{
                System.out.println("战斗结束，小虾米胜利");
                break;
            }
        }
    }
    public void run() {
        System.out.println("小虾米在耕地");
    }
}