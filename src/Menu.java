import java.util.Scanner;

public class Menu {

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("===== MENÚ =====");
            System.out.println("1. Saludar");
            System.out.println("2. Sumar dos números");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    Saludo saludo = new Saludo();
                    saludo.mostrarSaludo();
                    break;
                case 2:
                    Calculadora calculadora = new Calculadora();
                    System.out.print("Ingrese el primer número: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int b = scanner.nextInt();
                    int resultado = calculadora.sumar(a, b);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            
        } while(opcion != 3);
        
        scanner.close();
    }
}
