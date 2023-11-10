import java.util.Scanner;
// Clase principal para ejecutar la aplicación de galería de imágenes
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        GaleriaImagenes galeria = new GaleriaImagenes();

        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Cargar una imagen");
            System.out.println("2. Remover primera imagen");
            System.out.println("3. Remover última imagen");
            System.out.println("4. Mostrar imagen actual");
            System.out.println("5. Mostrar siguiente imagen");
            System.out.println("6. Mostrar imagen anterior");
            System.out.println("7. Salir");

            int seleccion = obtenerEntero("Seleccione una opción: ", entrada);
            switch (seleccion) {
                case 1:
                    entrada.nextLine(); // Limpia el buffer del scanner
                    String ruta = obtenerTexto("Ingrese el path de la imagen: ", entrada);
                    galeria.cargarImagen(ruta);
                    break;
                case 2:
                    galeria.removerPrimera();
                    break;
                case 3:
                    galeria.removerUltima();
                    break;
                case 4:
                    galeria.visualizarImagenActual();
                    break;
                case 5:
                    galeria.imagenSiguiente();
                    break;
                case 6:
                    galeria.imagenAnterior();
                    break;
                case 7:
                    System.out.println("Cerrando la aplicación.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }

    // Método para capturar un entero desde la entrada
    public static int obtenerEntero(String mensaje, Scanner entrada) {
        System.out.print(mensaje);
        while (!entrada.hasNextInt()) {
            System.out.println("Entrada no válida. Intente de nuevo.");
            entrada.next(); // Limpia el buffer del scanner
        }
        return entrada.nextInt();
    }

    // Método para capturar texto desde la entrada
    public static String obtenerTexto(String mensaje, Scanner entrada) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }
}