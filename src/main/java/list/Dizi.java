package list;

public class Dizi {
    public static void main(String[] args) {
        double[] list;
        list =new double[5];
        list[0]=10;
        list[1]=20;
        list[2]=30;
        list[3]=40;
        list[4]=50;


        int [] numbers={35,65,95};
        System.out.println(numbers.length+","+numbers[1]);

        int cars[], count=3;
        cars = new int[count];
        for(int i=0; i<cars.length; i++)
            cars[i] = (i+1)*2;
        for(int j=0; j<cars.length; j++)
            System.out.print(cars[j] + ",");

    }
}
