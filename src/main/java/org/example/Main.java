package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TODO : Profiler 실행해보기
        Profiler profiler = new Profiler();

        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,4,3,2,1));

        profiler.setData(input);
        profiler.setLib(new SelectionSort());
        profiler.runLib();
        profiler.showResult();

        System.out.println("---------------------------");

        profiler.setData(input);
        profiler.setLib(new BubbleSort());
        profiler.runLib();
        profiler.showResult();

    }
}