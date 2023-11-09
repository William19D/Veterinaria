package programacionIII.veterinaria.model;

import java.time.LocalDate;

public class Cita {

    private Mascota mascota;
    private LocalDate fecha;
    private Veterinario veterinario;
    private String nota;
    private double costo;
    private boolean estado;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Cita(Mascota mascota, LocalDate fecha, Veterinario veterinario, boolean estado) {
        this.mascota = mascota;
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.estado = estado;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public static void agregarCita(LocalDate fecha, Mascota mascota, Veterinario veterinario, boolean estado){
        PatitasPeludas.getCitas().add(new Cita(mascota, fecha, veterinario,estado));
        PatitasPeludas.imprimirCitas();
    }

    public void imprimirDetalles() {
        System.out.println("Detalles de la cita:");
        System.out.println("Fecha: " + fecha);
        System.out.println("Mascota: " + mascota.getNombre());
        System.out.println("Veterinario: " + veterinario.getNombre());
        System.out.println("Nota: " + nota);
        System.out.println("Costo: " + costo);
    }

}
