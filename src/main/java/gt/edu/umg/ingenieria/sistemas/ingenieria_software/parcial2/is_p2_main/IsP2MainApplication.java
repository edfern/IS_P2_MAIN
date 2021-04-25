package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.model.services.FactorAlgorithms;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main.model.services.ISortingAlgorithms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Scanner;


@SpringBootApplication
public class IsP2MainApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IsP2MainApplication.class, args);
    }

    @Override
    public void run(String... args)  {
        Scanner scanner = new Scanner(System.in);
        String opc;
        try {
            System.out.println("\n");
            System.out.println("\tSeleccionar opcion");
            System.out.println("\tSELECTION SORT\t (1)");
            System.out.println("\tBUBBLE SORT\t (2)");
            System.out.println("\tSTRING SORT\t (3)");
            System.out.println("\tINSERTION SORT\t (4)");
            System.out.println("\tMARGE SORT (Array numbers)\t (5)");
            System.out.println("-------------------------------------");
            opc = scanner.nextLine();

            FactorAlgorithms factorAlgorithms = new FactorAlgorithms();
            ISortingAlgorithms algorithms = factorAlgorithms.getAlgorithms(opc);
            algorithms.order(args);

        }catch (Exception ex){
            System.out.println("No ha ingresado el array correspondiente");
        }
    }
}
