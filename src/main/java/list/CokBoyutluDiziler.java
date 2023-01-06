package list;

public class CokBoyutluDiziler {
    public static void main(String[] args) {

        int[] list=new int[5];

int[][]matris=new int[6][6];
matris[0][0]=0;
matris[2][3]=789;
matris[2][4]=839;
        int[][] uzaklik ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };


        System.out.println(uzaklik[1][3]);
        System.out.println(uzaklik.length);
        System.out.println(uzaklik[0].length);

    }
}
