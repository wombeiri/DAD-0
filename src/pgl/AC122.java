/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgl;
import java.io.File;

/**
 *
 * @author 2dama
 */
public class AC122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = null;
        String path = "";
        
        try {
            f = new File("prueba.txt");
            
            if (f.exists()) {
                path = f.getAbsolutePath();
                
                System.out.print("Ruta absoluta " + path);
                System.out.println();
                System.out.print(f);
                System.out.println();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
