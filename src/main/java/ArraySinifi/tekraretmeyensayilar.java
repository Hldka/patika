package ArraySinifi;

public class tekraretmeyensayilar {
    static boolean isFind(int[] arr,int value){
        for (int i:arr){if (i==value){return true;}}
    return false;}

    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] newlist = new int[list.length];
        int index0 = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(newlist, list[i])) {
                        newlist[index0++] = list[i];
                        break;
                    }
                }
            }
        }
        for (int w: newlist) {if (w!=0){
            System.out.print(w+" ");
        }

        }
    }
}
