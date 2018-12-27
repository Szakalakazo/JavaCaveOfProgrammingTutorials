package begginers_book.arraylists.other_tutorials;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArayList {
    public static void main(String[] args) {
        /* Array Declaration and initialization*/
        String cityNames[]={"New York", "Warsaw", "Boston", "Minsk"};

        /*Array to ArrayList conversion*/
        ArrayList<String> cityList = new ArrayList<>(Arrays.asList(cityNames));
        System.out.println(cityList);
    }
}
