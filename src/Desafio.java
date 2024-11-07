import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nombreUsuario = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        int saldoUsuario = 1500;
        int opcion = 0;

        System.out.println("*********************");
        System.out.println("\nNombre del cliente: " + nombreUsuario);
        System.out.println("El tipo de cuenta es :" + tipoDeCuenta);
        System.out.println("Su saldo actual es :" + saldoUsuario + " Pesos");
        System.out.println("\n*********************");

        String menu = """
                *** Escriba el número de la opción deseada ***
                
                1- Consultar Saldo
                2- Retirar
                3- Depositar
                9- Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actual es " + "$" + saldoUsuario + " pesos");
                    break;

                case 2:
                    System.out.println("Escriba la cantidad de dinero que desea retirar");
                    int valorRetiro = teclado.nextInt();
                    if (saldoUsuario < valorRetiro) {
                        System.out.println("Su saldo es insuficiente");
                    }else{
                        saldoUsuario = saldoUsuario - valorRetiro;
                        System.out.println("Su nuevo saldo es: " + saldoUsuario + " pesos");
                    }
                    break;

                case 3:
                    System.out.println("Digite el valor a depositar");
                    int saldoDeposito = teclado.nextInt();
                    saldoUsuario = saldoDeposito + saldoUsuario;
                    System.out.println("Su nuevo saldo es: " + saldoUsuario + " pesos");
                    break;

                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;

                default:
                    System.out.println("Opción NO válida");
            }
        }
    }
}