import java.util.ArrayList;
import java.util.Scanner;

public class arrayListOfArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);

        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
