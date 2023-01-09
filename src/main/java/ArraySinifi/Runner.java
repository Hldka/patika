package ArraySinifi;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner { public static void main(String[] args) {
int[] list= {1,4,6,7,8};
HelpArray helpArray=new HelpArray();

helpArray.print(list);
Arrays.fill(list,2);
    System.out.println(Arrays.toString(list));
}
}
