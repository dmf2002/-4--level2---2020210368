package leval2;

import java.util.Random;

public class Role {
    private String name;
    public String sex;
    public String jineng;
     private int life;
    private int attrack=5;
    public void setLife(int life) {
        this.life=life;
    }
    public void setName(String name) {
        this.name=name;
    }

    public int getLife() {
        return life;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    void attrack1(JiNegn jiNegn ,Xiejiao xiejiao ,Mainrole mainrole) {
        Random c = new Random();
        int c2 = xiejiao.getLife();
        int c3 = mainrole.getLife();
        for (int a = 1; ; a++) {
            if (c2 != 0 && c2 > 0) {
                int b = c.nextInt(4);
                if (a % 2 == 0) {
                    if (b <=2) {
                        c2 -= mainrole.zhandouli;
                        System.out.println(mainrole.getName()+"使用普通攻击对" + xiejiao.getName() + "造成" + mainrole.zhandouli + "点伤害");
                    } else {
                        c2 -= jiNegn.name4attrack;
                        System.out.println(mainrole.getName()+"使用技能" + jiNegn.name4 + "对" + xiejiao.getName() + "造成" + jiNegn.name4attrack + "点伤害");
                    }
                }
                else {
                    c3-=xiejiao.zhandouli;
                    System.out.println(xiejiao.getName()+"对"+mainrole.getName()+"造成"+xiejiao.zhandouli+"点伤害");
                }
            }else {
                    System.out.println("小虾米胜利，不久小虾米成为天下共主");
                    break;
                }
            }
        }
    }
