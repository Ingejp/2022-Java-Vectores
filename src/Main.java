import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] enteros = new int[] {10,20,30,40, 50};
        int[] enteros2 = new int[10];
        String[] letras = new String[] {"a", "b", "c", "d", null};
        int tamañoVector = enteros.length - 3;
        int resultado = enteros[1]*enteros[4];
        int[][] matriz = new int[2][5];
        Scanner teclado = new Scanner(System.in);
        //System.out.println(tamañoVector);

       /* for(int i=0; i<enteros.length; i++){
            System.out.println("position " + enteros[i] );
        }*/
        //System.out.println(resultado);
        //CICLO FOR
       /* for(int i=0; i<enteros.length; i++){
            System.out.println(" position " + letras[i]);
        }
        //CICLO FOR EACH
        for(int otraCosa : enteros){
            System.out.println(otraCosa);
        }*/
        System.out.println("Ingrese el nuero");
        int valorRecibido = teclado.nextInt();

        EjerciciosConVectores objeto = new EjerciciosConVectores();
        objeto.almacenarNumero(valorRecibido);
        objeto.mostrarNumeros();

    }
}