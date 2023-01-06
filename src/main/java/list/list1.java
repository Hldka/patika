package list;

public class list1 {
    public static void main(String[] args) {
        int[] list={1,2,3,4,5};
        int sum=0;

        for (int w:list
             ) {sum=sum+w;
            System.out.println(sum);
        }
        System.out.println(sum);
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

     //   for (int[] u : matris) {
       //     for (int elem : u) {
         //       System.out.println(elem);
           // }

            System.out.println("**********************");

            int[] scores = new int[10];
            scores = new int[3];
            scores = new int[]{215, 234, 218, 189, 221, 290};

            for (int score : scores) {
                System.out.print(score + "  ");
            }
        }
    }

