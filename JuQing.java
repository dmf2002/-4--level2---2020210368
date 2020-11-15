package leval2;

import java.util.Scanner;

public class JuQing {
    public static void main(String[] args) {
        System.out.println("正邪两派在紫荆城决一死战，尸横遍野");
        Mainrole jianghuxiaoxiam = new Mainrole();
        jianghuxiaoxiam.setLife(50);
        jianghuxiaoxiam.setName("江湖小虾米");
        Xiejiao xiejiao = new Xiejiao();
        xiejiao.setLife(40);
        xiejiao.setName("欧阳锋");
        Xiejiao xiejiao1=new Xiejiao();
        xiejiao1.setLife(100);
        xiejiao1.setName("鬼一刀");
        Woman woman = new Woman();
        woman.setLife(30);
        JiNegn jineng = new JiNegn();
        woman.setName("郭襄");
        Timeyanchi timeyanchi = new Timeyanchi();
        timeyanchi.timeyanchi();
        System.out.println("少侠请帮帮我们");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1:偷偷逃跑" + "2:仗义出手" + "请选择");
        Scanner b = new Scanner(System.in);
        int result = b.nextInt();
        switch (result) {
            case 1:
                System.out.println("游戏结束，你真是个胆小鬼");
                break;
            case 2:
                System.out.println("少侠太感谢你了");
                System.out.println("邪教老二说道：不自量力");
                timeyanchi.timeyanchi();
                System.out.println("战斗开始");
                timeyanchi.timeyanchi();
                jianghuxiaoxiam.attrack(xiejiao);
                timeyanchi.timeyanchi();
                System.out.println("”小伙子谢谢你呀，要不是我被屑小下毒，岂容这等小辈欺凌“，一位老者说道。接着又说道“看你骨骼惊奇，要不拜我我为师”，“你想到好啊，拜我为师他不香”另一个老者说道 ");
                timeyanchi.timeyanchi();
                System.out.println("恭喜触发奇遇");
                Scanner j = new Scanner(System.in);
                timeyanchi.timeyanchi();
                System.out.println("1：选择白眉道人" + "2:选择黄眉道人");
                int j1 = b.nextInt();
                if (j1 == 1) {
                    System.out.println("恭喜你获得" + jineng.name2);
                    timeyanchi.timeyanchi();
                    System.out.println("”笑死老头子了，白眉，白眉呀，你收徒弟居然留一手“，黄眉大笑道，接着说道“没眼光的兔崽子后悔了吧");
                    timeyanchi.timeyanchi();
                    System.out.println("小虾米尴尬的不知如何是好，接着便被白眉带回自己的洞府");
                    timeyanchi.timeyanchi();
                    System.out.println("知道为师为啥子不传给你独孤九剑第二招，那是为师不想让你深陷江湖的打打杀杀，并且我想把我的女儿的嫁给你，凭借你的实力，你们找个人烟稀少的地方，这辈子安安稳稳过下去是没有问题的");
                    timeyanchi.timeyanchi();
                    System.out.println("1：选择与美人隐退江湖" + "2: 委婉的拒绝师父，并表达自己的抱负");
                    Scanner C2 = new Scanner(System.in);
                    int c2 = C2.nextInt();
                    if (c2 == 1) {
                        System.out.println(woman.getName() + "登场");
                        System.out.println("不久小虾米和郭襄退隐江湖");
                        new Thread(woman).start();
                        new Thread(jianghuxiaoxiam).start();
                        timeyanchi.timeyanchi();
                        System.out.println("每到晚上");
                        timeyanchi.timeyanchi();
                        woman.kiss();
                    }
                    else {
                        System.out.println("既然如此为师也就不勉强你,去闯荡江湖吧");
                        timeyanchi.timeyanchi();
                        System.out.println("触发奇遇，获得"+jineng.name3);
                        System.out.println("从此小虾米凭借自己的努力完成了自己的抱负，在江湖留下赫赫威名");
                    }
                }
                        else{
                        System.out.println("恭喜你获得" + jineng.name4);
                        System.out.println("随我去杀尽天下邪教吧");
                        timeyanchi.timeyanchi();
                        System.out.println("紫荆终战");
                        timeyanchi.timeyanchi();
                        jianghuxiaoxiam.attrack1(jineng,xiejiao1,jianghuxiaoxiam);
                    }
                }
        }
    }


