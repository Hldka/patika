package ArraySinifi;

public class DiziElemnOrtBulp {
    public static void main(String[] args) {

        int[] list={1,2,3,4,5};
        double avrg=0;
        int sum=0;
        for (int w:list) {
       sum=w+sum;

        }avrg=sum/ list.length;
        System.out.println("Ortalama"+avrg);
        System.out.println("***********************");
      for (int i=0;i< list.length;i++){
          sum=sum+(1/list[i]);
      }
        avrg= list.length/sum;
        System.out.println("Harmonik Ortalama"+avrg);

    }
    }


