package leval2;

public class Woman extends Role implements Runnable{
    void kiss() {
        System.out.println("相公么么哒  ........好不快活");
    }
    public void run() {
        System.out.println("郭襄在带孩子");
    }
}
