package singleton;

/**
 * Created by lenovo on 2017/4/15.
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    public static Singleton getSingletion(){
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    /**
     * 线程安全
     */
//    public static synchronized Singleton getSingletion(){
//        return singleton;
//    }
    public void print(){
        System.out.println("Hello World! Singleton");
    }

    private Singleton(){}

    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingletion();
        s1.print();
    }
}
