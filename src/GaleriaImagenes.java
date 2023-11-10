import java.util.ArrayList;

// Clase para gestionar una galería de imágenes
class GaleriaImagenes {
    private ArrayList<String> listaImagenes = new ArrayList<>();
    private int imagenActual = -1;

    // Autor: ArauzJuan
    // Método para agregar una nueva imagen a la galería
    public void cargarImagen(String rutaImagen) {
        listaImagenes.add(rutaImagen);
        if (imagenActual == -1) {
            imagenActual = 0;
        }
        System.out.println("Imagen cargada con éxito.");
    }

    // Método para eliminar la primera imagen de la galería
    public void removerPrimera() {
        if (!listaImagenes.isEmpty()) {
            listaImagenes.remove(0);
            actualizarIndiceDespuesDeRemover();
            System.out.println("Primera imagen removida.");
        } else {
            System.out.println("La galería está vacía.");
        }
    }

    // Método para eliminar la última imagen de la galería
    public void removerUltima() {
        if (!listaImagenes.isEmpty()) {
            listaImagenes.remove(listaImagenes.size() - 1);
            actualizarIndiceDespuesDeRemover();
            System.out.println("Última imagen removida.");
        } else {
            System.out.println("La galería está vacía.");
        }
    }

    // Método auxiliar para actualizar el índice actual después de remover una imagen
    private void actualizarIndiceDespuesDeRemover() {
        if (listaImagenes.isEmpty()) {
            imagenActual = -1;
        } else if (imagenActual >= listaImagenes.size()) {
            imagenActual = 0;
        }
    }

    // Método para mostrar la imagen actual
    public void visualizarImagenActual() {
        if (!listaImagenes.isEmpty() && imagenActual >= 0 && imagenActual < listaImagenes.size()) {
            System.out.println("Imagen actual: " + listaImagenes.get(imagenActual));
        } else {
            System.out.println("No hay imágenes para visualizar.");
        }
    }

    // Método para mostrar la siguiente imagen
    public void imagenSiguiente() {
        if (!listaImagenes.isEmpty()) {
            imagenActual = (imagenActual + 1) % listaImagenes.size();
            visualizarImagenActual();
        } else {
            System.out.println("No hay imágenes para visualizar.");
        }
    }

    // Método para mostrar la imagen anterior
    public void imagenAnterior() {
        if (!listaImagenes.isEmpty()) {
            imagenActual = (imagenActual - 1 + listaImagenes.size()) % listaImagenes.size();
            visualizarImagenActual();
        } else {
            System.out.println("No hay imágenes para visualizar.");
        }
    }
}
