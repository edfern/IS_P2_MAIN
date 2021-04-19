package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_main;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class IsP2MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opc;
        try {
            List<String> list = Arrays.asList(args);
            if(list.isEmpty()){
                System.out.println("el vector esta vacio");
            }else{
                while(true){
                    System.out.println("Seleccionar opcion");
                    System.out.println("Orden de seleccion (1)");
                    System.out.println("Ordenamiento de burbuja (2)");
                    System.out.println("Clasificacion de burbur recusiva (3)");
                    System.out.println("Tipo de insercion (4)");
                    System.out.println("Ordenacion rapida (5)");
                    System.out.println("SALIR (0)");
                    opc = scanner.nextLine();
                    if(opc.equals("0")){
                        break;
                    }
                    switch (opc){
                        case "1":
                            System.out.println("opc 1");
                            break;
                        case "2":
                            System.out.println("opc 2");
                            break;
                        case "3":
                            System.out.println("opc 3");
                            break;
                        case "4":
                            System.out.println("opc 4");
                            break;
                        case "5":
                            System.out.println("opc 5");
                            break;
                        default:
                            System.out.println("opcion no encontrada");
                    }
                }
            }

        }catch (Exception ex){
            System.out.println("No ha ingresado el array");
        }

    }
}
