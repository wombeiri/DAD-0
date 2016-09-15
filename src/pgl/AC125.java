// Realiza un programa que cree un directorio y un fichero en el escritorio
// y despues pregunte si deseas borrarlos

package pgl;
import java.io.File;

/**
 *
 * @author 2dama
 */
public class AC125 {
    
    public static void main(String[] args) {
        File f;
        File d;
        Boolean bool;
        Boolean bool2;
        
        try {
            d = new File("C:/Users/2dama/Desktop/prueba");
            bool = d.mkdir();
            System.out.print("¿Directorio creado?: " + bool);
            
            f = new File("C:/Users/2dama/Desktop/prueba.txt");
            bool2 = f.createNewFile();
            System.out.println("¿Archivo creado?: " + bool);

            
            
            // deletes file from the system
            f.delete();
            d.delete();

            // delete() is invoked
            System.out.println("delete() method is invoked");
            
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
