import java.util.Scanner;

public class Ejercicio5_Secuenciales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje.*/
        System.out.println("Dime la distancia del viaje: [km]");
        double distancia = entrada.nextDouble();
        System.out.println("""
                Dime cuanto combustible por km gasta el vehiculo: [l]
                Vehiculo chico: 10-12 litros
                Vehiculo grande: 12-15 litros
                Camioneta: 15-18 litros""");
        int consumo_kilometro = entrada.nextInt();
        System.out.println("""
                Dime de cuanto es el precio del combustible: [$]
                1.Super[1048]
                2.Premium[1296]""");
        double precio_conbustible = entrada.nextInt();
        double costo_total = distancia * consumo_kilometro * precio_conbustible;
        System.out.printf("El costo total del viaje es de %.2f",costo_total);
        entrada.close();

    }
}
