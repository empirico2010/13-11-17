
package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "personaBean")
@RequestScoped
public class personaBean {

    
    private String nombre;
    private String mensaje;
     
    public personaBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
}
