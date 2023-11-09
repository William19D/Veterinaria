package programacionIII.veterinaria.model;

import java.util.ArrayList;

public class Cliente {

    private String cedula;

    private String direccion;

    private String nombre;

    private String correo;

    private String telefono;

    public Cliente(String cedula, String direccion, String nombre, String correo, String telefono) {
        this.cedula = cedula;
        this.direccion = direccion;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}



