import java.util.List;

public class Persona {
    String numeroTelefono;
    String str;
    int edad;
/*
Para que el código sea más genérico metemos los parámetros: numero Telefono, str y edad en Persona
para que esta clase pueda ser usada por otro tipo de persona.
 */
    public Persona(String numeroTelefono, String str, int edad){
        super();
        this.numeroTelefono = numeroTelefono;
        this.edad = edad;
        this.str =str;
    }

    public String getNumeroTelefono(){
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
/* Añadimos set y get de edad y str */
    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getStr(){
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
public  class Profesor extends Persona {

   /*Eliminamos los parámetros de clase de edad, str y numeroTelefono
    porque ya se han incluido en clase Persona*/
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, String str, int edad){
        super(numeroDeTelefono, str, edad);
    }
    public void printInformacionPersonal(){
        /*Aquí hacemos referencia a str, edad y numeroTelefono de la clase Persona,
        como tiene una relación de herencia con profesor se lee correctamente*/
        System.out.println("Nombre: " + this.str);
        System.out.println("Edad: " + this.edad);
        System.out.println("Teléfono: " + this.numeroTelefono);

    }
    public void printTodaLaInformacion(){
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + this.numeroTelefono);
        for (Prestamo p: prestamos){
            System.out.println(p);
        }

    }
    /*Creamos la clase Prestamo, ya que en la clase Profesor la necesita.*/
    public class Prestamo{
        private int cantidad;
        public Prestamo(int cantidad){
            this.cantidad = cantidad;
        }
        public int getCantidad(){
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }
    }

}

