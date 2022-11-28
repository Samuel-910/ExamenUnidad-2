
package pe.edu.upeu.examenunidad_02.util;

import java.net.URL;

public class UtilsX {

    public URL getFile(String ruta) {
        return this.getClass().getResource("/" + ruta);
    }
    
    
    
}
