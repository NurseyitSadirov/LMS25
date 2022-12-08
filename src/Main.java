import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<Car , MERS > name = new HashMap<>();
        name.put(new Car(2222,2021),new MERS(2021,"AMG",450000,"Black"));
        name.put(new Car(3333,2020),new MERS(2021,"S-class",550000,"Write"));
         System.out.println(name.entrySet());


    }
}