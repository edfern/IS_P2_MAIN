package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.model.services;

public class FactorAlgorithms {
    public ISortingAlgorithms getAlgorithms(String whatAlgorithms){
        switch (whatAlgorithms){
            case "1":
                return new SelectionSort();
            case "2":
                return new BubbleSort();
            case "3":
                return new StringSort();
            case "4":
                return new InsertionSort();
            case "5":
                return new MargeSort();
            default:
                return new NullAlgorithms();
        }
    }
}
