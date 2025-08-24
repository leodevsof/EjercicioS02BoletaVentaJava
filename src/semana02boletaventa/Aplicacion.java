package semana02boletaventa;

import java.util.Date;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        //DECLARACION DE VARIABLES
        String nomcli, nompro1, nompro2;
        double precio1, precio2, dscto1, dscto2, precio, subtot1, subtot2, preciofinal;
        int cant1, cant2;
        final String CADENA_MICHI = "###########################";
        final String ID = "0000252145";
        Date dt = new Date();
        
        Scanner scanner = new Scanner(System.in);
        System.err.print("Ingrese el nombre del cliente: ");
        nomcli = scanner.nextLine();
        scanner.nextLine();
        
        System.err.println("Ingrese el nombre del producto 1: ");
        nompro1 = scanner.nextLine();
        scanner.nextLine();
        
        System.err.println("Ingrese el precio del producto 1: ");
        precio1 = scanner.nextDouble();
        scanner.nextLine();
        
        System.err.println("Ingrese la cantidad del producto 1: ");
        cant1 = scanner.nextInt();
        scanner.nextLine();
        
        System.err.println("Ingrese el nombre del producto 2: ");
        nompro2 = scanner.nextLine();
        scanner.nextLine();
        
        System.err.println("Ingrese el precio del producto 2: ");
        precio2 = scanner.nextDouble();
        scanner.nextLine();
        
        System.err.println("Ingrese la cantidad del producto 2: ");
        cant2 = scanner.nextInt();
        scanner.nextLine();
        
        subtot1 = (precio1 * cant1);
        subtot2 = (precio2 * cant2);
        
        precio = ((precio1 * cant1) + (precio2 * cant2));
        
        dscto1 = nomcli.toUpperCase().equals("ANA") || nomcli.toUpperCase().equals("JUAN")
                ? (precio * 0.05) : 0;
        
        dscto2 = nompro1.toUpperCase().contains("GAMER") || nompro2.toUpperCase().contains("GAMER")
                ? (precio * 0.02) : 0;
        
        preciofinal = (precio - dscto1 - dscto2);

        System.err.println(CADENA_MICHI);
        System.err.println("\t TIENDA ABS");
        System.err.println(CADENA_MICHI);
        System.err.println("ID:" + ID + "\n");
        System.err.printf("\t COMPRAS\n");
        System.out.printf("%22s%n","AV. SAENZ PEÑA 376");
        System.err.printf("\t CHICHAYO\n");
        System.out.printf("%11s %10s%n", "LOTE: B", "TERM:5268");
        System.err.println(CADENA_MICHI);
        System.out.printf("FECHA: %tD %4s %tH:%tM\n", dt, "HORA:", dt, dt);
        System.err.printf("VEND: JUAN %16s\n", "CLI: ANA");
        System.err.println(CADENA_MICHI);   
        System.out.printf("%d %s (%.2f)\n", cant1, nompro1, subtot1);
        System.out.printf("%d %s (%.2f)\n\n", cant2, nompro2, subtot2);
        System.err.printf("PAGO TOTAL: S/. %.2f\n", preciofinal);
        System.err.println(CADENA_MICHI);
        System.err.println("VUELVA PRONTO!");
        System.err.println(CADENA_MICHI);
    }
    
}
