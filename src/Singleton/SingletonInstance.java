package Singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SingletonInstance {
    public int index;
    public static SingletonInstance singletonInstance;

    public SingletonInstance(int i) {
        this.index = i;
    }

    synchronized public static SingletonInstance getInstance() {
        if (singletonInstance == null) {
            synchronized (SingletonInstance.class) {
                if (singletonInstance == null) {
                    Random random = new Random();
                    singletonInstance = new SingletonInstance(random.nextInt(3));
                }
            }
        }
        return singletonInstance;
    }
    public void sayHello() {
        System.out.println("Hello " + this.index);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,1,6,7,9,4,6,1};
        int b = 1;
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            Integer integer = integerIntegerMap.get(a[i]);
            if (null == integer) {
                integerIntegerMap.put(a[i], b);
            } else {
                integer = integer + 1;
                integerIntegerMap.put(a[i], integer);
            }
        }
        System.out.println(integerIntegerMap);



    }
}

