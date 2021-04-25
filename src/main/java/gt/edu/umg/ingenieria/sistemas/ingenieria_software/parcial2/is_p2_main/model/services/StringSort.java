package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.model.services;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.sort_string.services.ISortString;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.sort_string.services.SortString;

import java.util.Arrays;

public class StringSort implements ISortingAlgorithms {
    @Override
    public void order(String[] args) {
        ISortString iSortString = new SortString();
        System.out.println(Arrays.toString(args));
        iSortString.sortString(args);
        System.out.println(Arrays.toString(args));
    }
}
