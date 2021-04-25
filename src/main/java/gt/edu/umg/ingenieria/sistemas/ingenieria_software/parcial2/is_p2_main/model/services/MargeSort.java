package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.model.services;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.sort_marge.services.ISortMarge;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.sort_marge.services.SortMarge;

import java.util.Arrays;

public class MargeSort implements ISortingAlgorithms{
    @Override
    public void order(String[] args) {
        ISortMarge marge = new SortMarge();

        System.out.println(Arrays.toString(args));
        int[] argsOut = new int[ args.length ];
        for(int i=0; i<args.length;i++){
            argsOut[i] = Integer.parseInt(args[i]);
        }
        marge.margeSort(argsOut,argsOut.length);
        System.out.println(Arrays.toString(argsOut));
    }
}
