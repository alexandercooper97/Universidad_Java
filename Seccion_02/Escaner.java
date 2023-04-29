import java.util.Scanner;

public class Escaner {
    public static void main(String args[]){
        System.out.println("Escribe tu nombre : ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine(); // Lee una linea de la consola
        System.out.println("usuario = " + usuario);

        System.out.println("Escribe tu profesion : ");
        var titulo = consola.nextLine();
        System.out.println("Resultado : " + titulo + " " + usuario);
    }
}
