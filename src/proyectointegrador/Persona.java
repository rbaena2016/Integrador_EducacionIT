/*
 Armar la clase Persona con los siguientes atributos:
     nombre, de tipo String
       apellido, de tipo String
       numeroDocumento, de tipo String
Construir los setters y los getters de forma automática
Armar un constructor que espere como parámetros los valores
correspondientes a nombre, apellido y numeroDocumento
 */
package proyectointegrador;

/**
 *
 * @author educacionit
 */
public class Persona {
    String nombre;
    String apellido;
    String numeroDocumento;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Persona(String nombre, String apellido, String numeroDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
    }

    String getDocumento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

