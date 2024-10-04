import java.util.Scanner;
import java.util.Random;
public class Ejercicio3_Secuenciales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        System.out.println("""
                Elije el nivel en el que esta tu condicion fisica:
                1.Principiante: [10-15 Rep.]
                2.Intermedio: [15-24 Rep.]
                3.Avanzado: [30-45 Rep.]""");
        int condicion_fisica = entrada.nextInt(); // 1.Principiante,2.Intermedio,3.Avanzado;
        switch (condicion_fisica){
            case 1:
                System.out.println("Has elegido Principiante");
                System.out.printf("""
                        Ejercicio 1: %d Rep.
                        Ejercicio 2: %d Rep.
                        Ejercicio 3: %d Rep.""",random.nextInt(10,15),random.nextInt(10,15),random.nextInt(10,15));
                break;
            case 2:
                System.out.println("Has elegido Intermedio: ");
                System.out.printf("""
                        Ejercicio 1: %d Rep.
                        Ejercicio 2: %d Rep.
                        Ejercicio 3: %d Rep.
                        Ejercicio 4: %d Rep.
                        Ejercicio 5: %d Rep.
                        Ejercicio 6: %d Rep.""",random.nextInt(15,24),random.nextInt(15,24),random.nextInt(15,24),random.nextInt(15,24),random.nextInt(15,24),random.nextInt(15,24));
                break;
            case 3:
                System.out.println("Has elegido Avanzado: ");
                System.out.printf("""
                        Ejercicio 1: %d Rep.
                        Ejercicio 2: %d Rep.
                        Ejercicio 3: %d Rep.
                        Ejercicio 4: %d Rep.
                        Ejercicio 5: %d Rep.
                        Ejercicio 6: %d Rep.
                        Ejercicio 7: %d Rep.
                        Ejercicio 8: %d Rep.
                        Ejercicio 9: %d Rep.
                        Ejercicio 10: %d Rep.""",random.nextInt(30,45),random.nextInt(30,45),random.nextInt(30,45),random.nextInt(30,45),random.nextInt(30,45),random.nextInt(30,45),random.nextInt(30,45),random.nextInt(30,45),random.nextInt(30,45),random.nextInt(30,45));
                break;
            default:
                System.out.println("Elige una opcion dentro del menu");
        }
        entrada.close();
    }

}
