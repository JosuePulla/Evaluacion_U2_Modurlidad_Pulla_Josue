public class Ejercicio2_Pulla {
    public static void main(String[] args) {
        int base = 3;
        int exponente = 4;
        
        int resultado = pot(base, exponente);
        
        System.out.println("El resultado de " + base + "^" + exponente + " es: " + resultado);
    }

    static int pot(int b, int e) {
        if (e == 0) {
            return 1;
        }
        return b * pot(b, e - 1);
    }
}   

//El resultado final de ejecutar pot(3, 4) es 81.
//Esta función recursiva calcula la potencia multiplicando la base 3
//por sí misma cuatro veces hasta llegar al caso base.
