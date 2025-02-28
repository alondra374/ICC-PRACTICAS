import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    int opcion = 0;
    Scanner calcula = new Scanner(System.in);

    while (opcion != 5){ 

        System.out.println("");
        System.out.println("|========================|");
        System.out.println("|                        |");
        System.out.println("| C A L C U L A D O R A  |");
        System.out.println("|                        |");
        System.out.println("| Q U E   C A L C U L A  |");
        System.out.println("|                        |");
        System.out.println("|========================|");
        System.out.println("|                        |");
        System.out.println("|¿ Que deseas realizar ? |");
        System.out.println("                        ");

        System.out.println("1.- Quiero SUMAR");
        System.out.println("2.- Quiero MULTIPLICAR");
        System.out.println("3.- Quiero DIVIDIR");
        System.out.println("4.- Adivinare tú número");
        System.out.println("5.- Quiero SALIR");

        opcion = calcula.nextInt();

        /*
         * aqui van las lineas de scanner
         * 
         */

        if (opcion < 1 || opcion > 5 ){
            System.out.print("opcion no valida");
        }
        else{

            if (opcion == 1){

                System.out.println("Ingresa el número.");
                double a = calcula.nextDouble();
            
                System.out.println("Ingresa el otro número.");
                double b = calcula.nextDouble();
            
                double suma = a + b;
        
                System.out.println("El resultado de la operacion es  : " + (a + b));    
                

            }

            if (opcion == 2){

                System.out.println("Ingresa el número.");
                double c = calcula.nextDouble();
        
                System.out.println("Ingresa el otro número.");
                double d = calcula.nextDouble();
        
                double multiplicacion = c * d;
            
                System.out.println("El resultado de la operacion es  : " + (c * d));
                    
            }

            if (opcion == 3){

                System.out.println("Ingresa el número.");
                double e = calcula.nextDouble();
            
                System.out.println("Ingresa el otro número.");
                double f = calcula.nextDouble();
            
                double divicion = e * f;
                
                System.out.println("El resultado de la operacion es  : " + (e * f));
                
            }
            if (opcion == 4){

                System.out.println("Ingresa el número.");
                double g = calcula.nextDouble();
                
                System.out.println("Tu número es  : " + (g)) ;
                
            }



        }
    }
    }
}