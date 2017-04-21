package factoryPattern.fruit;

/**
 * Created by lenovo on 2017/4/15.
 */
public class Factory {

    public static Fruit getInstance(String className){
        Fruit f = null;
        if("apple".equals(className)){
            f = new Apple();
        }
        if("orange".equals(className)){
            f = new Orange();
        }
        return f;
    }

    public static void main(String [] args){
        Fruit f = Factory.getInstance("apple");
        if(f != null){
            f.eat();
        }
    }
}
