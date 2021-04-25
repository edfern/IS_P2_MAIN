package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.model.services;

import gt.edu.umg.ingenieria.sistemas.ingenieria.brbble_sort.services.BrbbleSort;
import gt.edu.umg.ingenieria.sistemas.ingenieria.brbble_sort.services.IBrbbleSort;

import java.util.Arrays;

public class BubbleSort implements ISortingAlgorithms {
    @Override
    public void order(String[] args) {
        System.out.println(Arrays.toString(args));
        IBrbbleSort brbbleSort = new BrbbleSort();
        brbbleSort.brbbleSort(args);
        System.out.println(Arrays.toString(args));
    }
}
