package programacionIII.veterinaria.model;

public class Mascota {

    private String cedulaDueno;
    private String nombre;
    private int edad;
    private char sexo;
    private String tipo;
    private String raza;

    public String getNombre() {
        return nombre;
    }

    public String getCedulaDueno(){
        return cedulaDueno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Mascota(String cedulaDueno, String nombre, int edad, char sexo, String tipo, String raza) {
        this.cedulaDueno = cedulaDueno;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.tipo = tipo;
        this.raza = raza;
    }
}
