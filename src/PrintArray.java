import java.sql.Array;

// Ex4
public class PrintArray {
    public static void main(String[] args) {
        int[] dupeArray = {12,1,1,1,1,2,3,3,3,3,3,3,4,4,5,5,5,5,6,4,5,5,6,67,77,7,7,7,7,7};
        int[] withoutDupe =  PrintingWithoutDuplicates(dupeArray);
        for (int i = 0; i<withoutDupe.length; i++){
            System.out.print( PrintingWithoutDuplicates(withoutDupe)[i] + ",");
        }
    }
    public static int[] PrintingWithoutDuplicates (int[] dupeArray){

        int end = dupeArray.length;
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (dupeArray[i] == dupeArray[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        dupeArray[shiftLeft] = dupeArray[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        for(int i = 0; i < end; i++){
            whitelist[i] = dupeArray[i];
        }
        return whitelist;
    }

}
