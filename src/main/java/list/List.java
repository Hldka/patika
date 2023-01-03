package list;

public class List {

    static void printarray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
    static void printarray(double[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }static int[] reverse(int[] list){
        int []reverse =new  int[list.length];
        for (int i=0,j= list.length-1;i< list.length;i++,j--){reverse[i]=list[j];}
    return  reverse;}
static void printArray(int[] list){for (int i=0;i< list.length;i++){
    System.out.print(list[i]);
}}
    public static void main(String[] args) {

        int[] list ={10,20,30,40,50,60,70,80,90,100};
         double[] listi={22.3,56.6,67.6,98.9};
         int[] newListe=reverse(list);
        printarray(list);
        System.out.println("*********************");
        printarray(newListe);
        System.out.println("*********************");
        printarray(listi);
    }
}
