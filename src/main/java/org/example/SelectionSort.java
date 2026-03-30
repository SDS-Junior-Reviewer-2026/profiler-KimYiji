package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort implements Sort {
    private int changeCnt = 0;

    // selection sort 오름차순 예시코드
    public void selectionSort(ArrayList<Integer> arr) {
        changeCnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    changeCnt++;
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }

    public int getChangeCnt() {
        return changeCnt;
    }

    public void runLib(ArrayList<Integer> arr){
        selectionSort(arr);
    }
    public void showResult(ArrayList<Integer> arr){
        System.out.println("selectionSort 테스트");
        System.out.print("정렬결과: [" + arr.get(0));
        for (int i = 0; i < arr.size() - 1; i++) {
            System.out.print(", " + arr.get(i + 1));
        }
        System.out.println("]");
        System.out.println("swap 횟수: " + changeCnt);
    }

//    public static void main(String[] args) {
//        SelectionSort sort = new SelectionSort();
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,2,1,3,1,2,6,9));
//        sort.selectionSort(arr);
//        System.out.println(arr);
//    }
}