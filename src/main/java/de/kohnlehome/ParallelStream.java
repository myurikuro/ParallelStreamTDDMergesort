package de.kohnlehome;

import java.util.Arrays;

public class ParallelStream implements ISortAlgorithm {
    private IMerger merger;

    public ParallelStream(IMerger merger) {
        this.merger = merger;
    }

    @Override
    public int[] sort(int[] unsortedArray) {
        int[] sortedArray = Arrays.stream(unsortedArray).parallel().sorted().toArray();
        return sortedArray;
    }
}
