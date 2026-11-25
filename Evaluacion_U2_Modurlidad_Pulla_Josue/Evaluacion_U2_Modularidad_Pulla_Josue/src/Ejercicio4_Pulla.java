// Parqueadero (6 pts). Escribe leerMinutos(Scanner sc) (valida 1–1440), horasCobradas(int
// minutos) (la fracción de hora se cobra completa) y tarifa(int horas, char tipo) 
// (auto $1,00 la hora;
// moto $0,50; más de 8 horas: 20 % de descuento). El main lee los datos y muestra horas y total.
// Prueba: 125
// min, auto → 3 h, $3,00; 600 min, moto → 10 h, $4,00.


 import java.util.Locale;
import java.util.Scanner;


public class Ejercicio4_Pulla {
    
    public static int leerMinutos(Scanner sc) {
        int minutos;
        do {
            System.out.print("Ingrese los minutos (1 - 1440): ");
            minutos = sc.nextInt();
            if (minutos < 1 || minutos > 1440) {
                System.out.println("Valor invalido. Debe estar entre 1 y 1440.");
            }
        } while (minutos < 1 || minutos > 1440);
        return minutos;
    }

    public static int horasCobradas(int minutos) {
        return (minutos + 59) / 60;
    }

    public static double tarifa(int horas, char tipo) {
        char t = Character.toLowerCase(tipo);
        double precioHora;

        if (t == 'a') {
            precioHora = 1.00;
        } else if (t == 'm') {
            precioHora = 0.50;
        } else {
            throw new IllegalArgumentException("Tipo de vehiculo invalido: " + tipo);
        }

        double total = horas * precioHora;
        if (horas > 8) {
            total *= 0.80; // 20% de descuento
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int minutos = leerMinutos(sc);

        System.out.print("Ingrese tipo de vehiculo (A = auto, M = moto): ");
        char tipo = sc.next().charAt(0);

        int horas = horasCobradas(minutos);
        double total = tarifa(horas, tipo);

        System.out.printf(Locale.US, "Horas cobradas: %d h%n", horas);
        System.out.printf(Locale.US, "Total a pagar: $%.2f%n", total);

        sc.close();
    }
}

