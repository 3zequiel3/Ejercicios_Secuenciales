import java.util.Scanner;
public class Ejercicio4_Secuenciales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.*/
        int op_estado_animo;
        System.out.println("""
                Cual es tu estado de animo?: 
                1.Feliz
                2.Triste
                3.Energico
                4.Relajado""");
        op_estado_animo = entrada.nextInt();
        switch (op_estado_animo){
            case 1:
                System.out.println("Lista de canciones Felices: []");
                break;
            case 2:
                System.out.println("Lista de canciones Tristes: []");
                break;
            case 3:
                System.out.println("Lista de canciones Energicas: []");
                break;
            case 4:
                System.out.println("Lista de canciones Relajadas: []");
                break;
            default:
                System.out.println("Elije una opcion correcta.");
                break;
        }
        entrada.close();
    }
}
