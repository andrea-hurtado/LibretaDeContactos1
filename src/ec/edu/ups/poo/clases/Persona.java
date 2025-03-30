package ec.edu.ups.poo.clases;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;

    public void setCedula(String cedula) {
        this.cedula =  cedula; //This hace referencia al atributo que es la misma cedula (asignar un valor)
    }

    public String getCedula() { //get se usa para recuperar un valor
        return cedula;
    }
}
