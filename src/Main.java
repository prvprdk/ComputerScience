import java.net.Socket;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //factorial factorial recursion
        System.out.println(Recursion.fac(3));
        //factorial factorial not recursion
        System.out.println(Recursion.fac(3));
        //print numbers with recursion
        Recursion.printNumbersUp(5);
        System.out.println();
        Recursion.printNumbersDown(5);
        System.out.println();

        int[] arrayMergeSort = new int[100000];
        for (int i = 0; i<arrayMergeSort.length; i++){
            arrayMergeSort[i] = (int) (Math.random()*10000);
        }
        long startMerge = System.currentTimeMillis();
        MergeSort.mergeSort(arrayMergeSort);
        long finishedMerge = System.currentTimeMillis() - startMerge;
        System.out.println("Сортировка слиянием " + finishedMerge);

        int[] arraySelect = new int[100000];
        for (int i = 0; i<arraySelect.length; i++){
            arraySelect[i] = (int) (Math.random()*1000000);
        }
        long start = System.currentTimeMillis();
        SelectSort.selectSort(arraySelect);
        long finished = System.currentTimeMillis() - start;
        System.out.println("Сортировка выбором " + finished);



        int[] arrayInsert = new int[100000];
        for (int i = 0; i<arrayInsert.length; i++){
            arrayInsert[i] = (int) (Math.random()*10000);
        }
        long startInsert = System.currentTimeMillis();
        InsertionSort.insertSort(arrayInsert);
        long finishedInsert = System.currentTimeMillis() - startInsert;
        System.out.println("Сортировка вставками " + finishedInsert);







    }



}