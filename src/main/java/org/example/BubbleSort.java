package org.example;

import java.util.ArrayList;

public class BubbleSort implements Sort{
    private int changeCnt = 0;

    // bubble sort 예시코드
    public void bubbleSort(ArrayList<Integer> arr) {
        changeCnt = 0;

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    changeCnt++;

                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    public int getChangeCnt() {
        return changeCnt;
    }

    public void runLib(ArrayList<Integer> arr){
        bubbleSort(arr);
    }
    public void showResult(ArrayList<Integer> arr){
        System.out.println("bubbleSort 테스트");
        System.out.print("정렬결과: [" + arr.get(0));
        for (int i = 0; i < arr.size() - 1; i++) {
            System.out.print(", " + arr.get(i + 1));
        }
        System.out.println("]");
        System.out.println("swap 횟수: " + getChangeCnt());
    }
}
