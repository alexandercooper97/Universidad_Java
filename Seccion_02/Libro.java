import java.util.Scanner;

public class Libro {
    public static void main(String args[]){
        System.out.println("\n\t\t Ingresando datos del Libro\n");

        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el Titulo : ");
        String titulo = consola.nextLine();
*-
        System.out.println("\nProporciona el autor : ");
        String autor = consola.nextLine();

        System.out.println("\n");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
        System.out.println(titulo + " fue escrito por " + autor);
        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

    }
}

/*  
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
 * 
 * 
 * 
 */