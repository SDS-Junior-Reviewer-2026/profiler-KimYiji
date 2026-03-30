package org.example;

import java.util.ArrayList;

public class Profiler {
    private static ArrayList<Integer> INPUT;
    private static Sort SORT;
    // TODO : Profiler 구현
    static void setData(ArrayList<Integer> input) {
        Profiler.INPUT = input;
    }
    static void setLib(Sort sort){
        Profiler.SORT = sort;
    }
    static void runLib(){
        SORT.runLib(INPUT);
    }
    static void showResult(){
        SORT.showResult(INPUT);
    }
}
