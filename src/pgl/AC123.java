//Realiza un programa al que se le pase un determinado
//fichero y nos muestre la siguiente informacion:
//Nombre del fichero, ruta relativa, ruta absoluta, 
//si se puede escribir, leer, su tamaño, si es un directorio o si es un fichero

package pgl;
import java.io.File;

/**
 *
 * @author 2dama
 */
public class AC123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("prueba.txt");
        String nombre;
        String relativa;
        String absoluta;
        Boolean lectura;
        Boolean escritura;
        long tamano;
        Boolean esfichero;
        
        try {
            if (f.exists()) {
                nombre = f.getName();
                relativa = f.getPath();
                absoluta = f.getAbsolutePath();
                lectura = f.canRead();
                escritura = f.canWrite();
                tamano = f.length();
                if (f.isFile()) {
                    esfichero = true;
                } else {
                    esfichero = false;
                }
                
                System.out.print("Nombre: " + nombre);
                System.out.println();
                System.out.print("Ruta relativa: " + relativa);
                System.out.println();
                System.out.print("Ruta absoluta: " + absoluta);
                System.out.println();
                System.out.print("Lectura: " + lectura);
                System.out.println();
                System.out.print("Escritura: " + escritura);
                System.out.println();
                System.out.print("Tamaño: " + tamano);
                System.out.println();
                System.out.print("Es fichero: " + esfichero);
                System.out.println();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
