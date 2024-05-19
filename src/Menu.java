import java.util.Scanner;

public class Menu {

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("===== MENÚ =====");
            System.out.println("1. Saludar");
            System.out.println("2. Sumar dos números");
            System.out.println("3. Restar dos números");
            System.out.println("4. Multiplicar dos números");
            System.out.println("5. Dividir dos números");
            System.out.println("6. Salir");
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
                    int resultadoSuma = calculadora.sumar(a, b);
                    System.out.println("El resultado de la suma es: " + resultadoSuma);
                    break;
                case 3:
                    calculadora = new Calculadora();
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    int resultadoResta = calculadora.restar(a, b);
                    System.out.println("El resultado de la resta es: " + resultadoResta);
                    break;
                case 4:
                    calculadora = new Calculadora();
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    int resultadoMultiplicacion = calculadora.multiplicar(a, b);
                    System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
                    break;
                case 5:
                    calculadora = new Calculadora();
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    try {
                        double resultadoDivision = calculadora.dividir(a, b);
                        System.out.println("El resultado de la división es: " + resultadoDivision);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            
        } while(opcion != 6);
        
        scanner.close();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}
