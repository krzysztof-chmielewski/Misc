package pecs;

import java.util.ArrayList;
import java.util.List;

public class Pecs {
    public static void main(String[] args) {



    }

    private void lists() {
        List<Berry> berries = new ArrayList<>();
        List<? super Berry> fruits = berries;
        fruits.add(new Berry());
        fruits.add(new Strawberry());
//        fruits.add(new Fruit());
    }


    private void arrays() {
        Apple[] apples = new Apple[3];
        apples[0] = new Apple();
        Fruit[] fruits = apples;
        fruits[1] = new Strawberry();
    }
}
