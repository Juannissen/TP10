import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main (String[]args) {
        IniciarJuego();
    }

    public static void IniciarJuego() {
        String JugarDenuevo = "";
        int Respuesta, Adivinanza, NumeroDeIntentos = 0;

        Random generator = new Random();
        Respuesta = generator.nextInt(100)+1;

        System.out.println("Adivina el numero entre 1 y 100 :D");
        System.out.println("Ingresa un numero (o apretá 0 para salir):");

        Adivinanza = scan.nextInt();
        while (Adivinanza != Respuesta && Adivinanza != 0 ) {
            if(Adivinanza==Respuesta)
                System.out.println("CORRECTO!");
            else if (Adivinanza<Respuesta) {
                System.out.println("Tu numero fue muy BAJO.");
                NumeroDeIntentos++;
                Adivinanza = scan.nextInt();
            }
            else {
                System.out.println("Tu numero fue muy ALTO.");
                NumeroDeIntentos++;
                Adivinanza = scan.nextInt();
            }
        }

        System.out.println ("El numero era " + Respuesta);
        System.out.println("La cantidad de intentos fueron: " + NumeroDeIntentos);
        System.out.println("¿Queres jugar denuevo?(si / no)");
        JugarDenuevo = scan.next();
        System.out.println("JugarDenuevo = " + JugarDenuevo);
        if(JugarDenuevo.equals("si")) {
            IniciarJuego();
        } else {
            System.out.println("Adios!");
        }
    }
}