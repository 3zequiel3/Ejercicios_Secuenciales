import java.util.Scanner;

public class Ejercicio6_Secuenciales {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un plan de estudio semanal
        distribuyendo esas horas en diferentes materias.*/
        Scanner scanner = new Scanner(System.in);

        // Pedir horas de estudio diarias
        System.out.print("¿Cuántas horas al día puedes dedicar a estudiar? ");
        int horasDiarias = scanner.nextInt();

        // Pedir número de materias
        System.out.print("¿Cuántas materias debes estudiar? ");
        int numMaterias = scanner.nextInt();

        // Pedir nombres de materias
        String materia1 = scanner.next();
        String materia2 = scanner.next();
        String materia3 = scanner.next();

        // Pedir porcentaje de tiempo dedicado a cada materia
        double porcentaje1 = scanner.nextDouble() / 100;
        double porcentaje2 = scanner.nextDouble() / 100;
        double porcentaje3 = scanner.nextDouble() / 100;

        // Calcular total de horas de estudio por semana
        int totalHorasSemana = horasDiarias * 7;

        // Calcular tiempo de estudio por materia
        double tiempoMateria1 = totalHorasSemana * porcentaje1;
        double tiempoMateria2 = totalHorasSemana * porcentaje2;
        double tiempoMateria3 = totalHorasSemana * porcentaje3;


        // Generar plan de estudio semanal
        System.out.println("Plan de estudio semanal:");
        System.out.println("Día 1:");
        System.out.println(materia1 + ": " + tiempoMateria1 / 7 + " horas");
        System.out.println(materia2 + ": " + tiempoMateria2 / 7 + " horas");
        System.out.println(materia3 + ": " + tiempoMateria3 / 7 + " horas");
        System.out.println("Día 2:");
        System.out.println(materia1 + ": " + tiempoMateria1 / 7 + " horas");
        System.out.println(materia2 + ": " + tiempoMateria2 / 7 + " horas");
        System.out.println(materia3 + ": " + tiempoMateria3 / 7 + " horas");
        System.out.println("Día 3:");
        System.out.println(materia1 + ": " + tiempoMateria1 / 7 + " horas");
        System.out.println(materia2 + ": " + tiempoMateria2 / 7 + " horas");
        System.out.println(materia3 + ": " + tiempoMateria3 / 7 + " horas");
        System.out.println("Día 4:");
        System.out.println(materia1 + ": " + tiempoMateria1 / 7 + " horas");
        System.out.println(materia2 + ": " + tiempoMateria2 / 7 + " horas");
        System.out.println(materia3 + ": " + tiempoMateria3 / 7 + " horas");
        System.out.println("Día 5:");
        System.out.println(materia1 + ": " + tiempoMateria1 / 7 + " horas");
        System.out.println(materia2 + ": " + tiempoMateria2 / 7 + " horas");
        System.out.println(materia3 + ": " + tiempoMateria3 / 7 + " horas");
    }
}