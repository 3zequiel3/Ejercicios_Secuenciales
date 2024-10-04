import java.util.Scanner;

public class Ejercicio7_Secuenciales {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
índice de felicidad basado en esos factores.*/
        Scanner entrada = new Scanner(System.in);
        //satisfaccion de vida, nivel de estres, nivel de salud
        int satisfaccion;
        do {
            System.out.println("Dime del 1 al 10 que tan feliz con la vida estas: ");
            satisfaccion = entrada.nextInt();
        } while (satisfaccion < 1 || satisfaccion > 11);
        int nivel_stress;
        do {
            System.out.println("Dime del 1 al 10 el grado de estres que creas que estas manejando por dia:  ");
            nivel_stress = entrada.nextInt();
        } while (nivel_stress < 1 || nivel_stress > 11);
        int nivel_salud;
        do {
            System.out.println("Dime del 1 al 10 que tan bien de salud estas: ");
            nivel_salud = entrada.nextInt();
        } while (nivel_salud < 1 || nivel_salud > 11);

        double indice_felicidad = (double) (satisfaccion + nivel_salud + nivel_stress) / 3 ;

        System.out.printf("De acuerdo con las estadisticas tu indice de felicidad esta en un %.2f porciento",indice_felicidad);



    }
}
