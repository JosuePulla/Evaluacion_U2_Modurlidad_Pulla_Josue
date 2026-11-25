public class Ejercicio3_Pulla {

    static void m(int a, int[] v) { 
        
        a++; v[1] += a; }

    public static void main(String[] args){

        int a = 5;
        int[] v = {1, 2, 3};
        m(a, v);
        System.out.println(a + " " + v[1]);
    }
}

//¿Que imprime?
// El a no va a cambiar por que por que es variable y se va a mantener asi
//el 8 v[1] si va a cambiar por que le esta sumando 