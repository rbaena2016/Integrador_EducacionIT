/*
Especificación

Armar la clase Vehículo con los siguientes atributos:
      alto, de tipo int
        ancho, de tipo int
        largo, de tipo int
Construir los setters y los getters de forma automática
Armar un constructor que reciba como parámetros los valores correspondientes a alto, ancho y largo
Armar la clase Persona con los siguientes atributos:
     nombre, de tipo String
       apellido, de tipo String
       numeroDocumento, de tipo String
Construir los setters y los getters de forma automática
Armar un constructor que espere como parámetros los valores correspondientes a nombre, apellido y numeroDocumento
Construir la clase Programa y dentro del método main realizar lo siguiente:
        instanciar un vehiculo utilizando el constructor de tres parámetros
          informar los valores de los atributos del vehiculo instanciado
          instanciar una persona utilizando el constructor de tres parámetros
          informar los valores de los atributos de la persona instanciada
 */
package proyectointegrador;

/**
 *
 * @author educacionit
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vehiculo v1 = new Vehiculo(50,50,100);
        System.out.println (v1.getAlto()+" "+ v1.getAncho()+" "+ v1.largo);
        
        Persona p1 = new Persona ("Pepe","Argento","30699939");
        System.out.println (p1.getNombre()+" "+ p1.getApellido()+" "+ p1.getNumeroDocumento());
        
     }
        
    
   

}
