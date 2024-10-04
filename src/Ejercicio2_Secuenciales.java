import java.util.Scanner;
public class Ejercicio2_Secuenciales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Pregunta por su peso
        System.out.println("Dime cuanto pesas en kg: ");
        double peso = entrada.nextDouble();
        //Pregunta por el ejercicio
        System.out.println("Dime que tipo de ejercicio realizas?: ");
        System.out.println("""
                Menu:
                1.Nadar
                2.Correr
                3.Andar en bicicleta""");
        int ejercicio = entrada.nextInt(); /* Menu: 1.Nadar 2.Correr 3.Andar en bicicleta*/
        //Pregunta por la duración
        System.out.println("Por cuanto tiempo? [minutos]:");
        int duracion_min = entrada.nextInt();
        int duracion = (duracion_min/60);
        System.out.println("Indica el rango de intensidad: [2-16]");
        System.out.println("""
                Baja intensidad = [2-6]
                Mediana intensidad = [7-10]
                Alta intensidad = [11-16]""");
        int met = entrada.nextInt(); /*Menu: Rango del 2 al 16 de intensidad para saber el MET*/
        double calorias = met * peso * duracion;

        System.out.printf("Genial gracias a ese tipo de ejercicio llevas perdidas %.2f calorias", calorias);


        entrada.close();

    }
}
