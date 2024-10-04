import java.util.Scanner;
public class Ejercicio1_Secuenciales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento en formato DD/MM/AAAA");
        System.out.println("Dia: ");
        int day = entrada.nextInt();
        System.out.println("Mes: ");
        int month;
        do {
            System.out.println("Por favor, ingrese un número de mes (1-12): ");
            month = entrada.nextInt();
        } while (month < 1 || month > 12);

        String monthName = "";
        switch (month) {
            case 1:
                monthName = "Enero";
                break;
            case 2:
                monthName = "Febrero";
                break;
            case 3:
                monthName = "Marzo";
                break;
            case 4:
                monthName = "Abril";
                break;
            case 5:
                monthName = "Mayo";
                break;
            case 6:
                monthName = "Junio";
                break;
            case 7:
                monthName = "Julio";
                break;
            case 8:
                monthName = "Agosto";
                break;
            case 9:
                monthName = "Septiembre";
                break;
            case 10:
                monthName = "Octubre";
                break;
            case 11:
                monthName = "Noviembre";
                break;
            case 12:
                monthName = "Diciembre";
                break;
            default:
                monthName = "Mes inválido";
                break;
        }
        System.out.println("Año: ");
        int year;
        do {
            System.out.println("Por favor, ingrese un número de año (AAAA): ");
            year = entrada.nextInt();
        } while (year < 1960 || year > 2024);

        String sign = "";

        System.out.printf("Genial, entonces tu fecha de nacimiento es %d de %s del %d",day,monthName,year);
        System.out.println("\nEntonces tu signo sodiacal es: ");

        if ((month == 3 && (day >=21 && day<=31)) || (month == 4 && (day<= 19 && day >= 1))){
            sign = "Aries";
            System.out.printf("Felicidades tu signo es %s\n",sign);
        } else if ((month == 4 && (day >=20 && day<=30)) || (month == 5 && (day<= 20 && day >= 1))) {
            sign = "Tauro";
            System.out.printf("Felicidades tu signo es %s\n",sign);
        } else if ((month == 5 && (day >=21 && day<=31)) || (month == 6 && (day<= 20 && day >= 1))) {
            sign = "Geminis";
            System.out.printf("Felicidades tu signo es %s\n",sign);
        } else if ((month == 6 && (day >=21 && day<=30)) || (month == 7 && (day<= 22 && day >= 1))) {
            sign = "Cancer";
            System.out.printf("Felicidades tu signo es %s\n",sign);
        } else if ((month == 7 && (day >=23 && day<=31)) || (month == 8 && (day<= 22 && day >= 1))) {
            sign = "Leo";
            System.out.printf("Felicidades tu signo es %s\n",sign);
        } else if ((month == 8 && (day >=23 && day<=31)) || (month == 9 && (day<= 22 && day >= 1))) {
            sign ="Virgo";
            System.out.printf("Felicidades tu signo es %s\n",sign);
        } else if ((month == 9 && (day >=23 && day<=31)) || (month == 10 && (day<= 22 && day >= 1))) {
            sign = "Libra";
            System.out.printf("Felicidades tu signo es %s\n",sign);
        } else if ((month == 10 && (day >=23 && day<=31)) || (month == 11 && (day<= 21 && day >= 1))){
            sign = "Escorpio";
            System.out.printf("Felicidades tu signo es %s\n",sign);
        } else if ((month == 11 && (day >=22 && day<=30)) || (month == 12 && (day<= 21 && day >= 1))) {
            sign = "Sagitario";
            System.out.printf("Felicidades tu signo es %s\n",sign);
        } else if ((month == 12 && (day >=22 && day<=31)) || (month == 1 && (day<= 19 && day >= 1))) {
            sign = "Capricornio";
            System.out.printf("Felicidades tu signo es %s\n",sign);
        } else if ((month == 1 && (day >=20 && day<=31)) || (month == 2 && (day<= 18 && day >= 1))) {
            sign = "Acuario";
            System.out.printf("Felicidades tu signo es %s\n",sign);
        } else if ((month == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? (day >= 19 && day <= 29) : (day >= 19 && day <= 28)))|| (month == 3 && (day <= 20 && day >= 1))) {
            sign = "Piscis";
            System.out.printf("Felicidades tu signo es %s\n",sign);
        } else {
            System.out.println("Lo siento has ingresado una fecha incorrecta o inexistente");
        }
        entrada.close();
    }
}
