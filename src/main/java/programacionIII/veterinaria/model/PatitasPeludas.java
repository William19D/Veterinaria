package programacionIII.veterinaria.model;

import javafx.event.ActionEvent;
import javafx.scene.control.MenuItem;

import java.util.ArrayList;


public class PatitasPeludas {
    public static final double PRECIOCITA = 70000; // Por ejemplo
    private static ArrayList<Veterinario> VETERINARIOS = new ArrayList<>();
    private static ArrayList<Cita> citas = new ArrayList<>();
    private static ArrayList<Cliente> clientes  = new ArrayList<>();
    private static ArrayList<Mascota> mascotas  = new ArrayList<>();

    static {
        //DATOS QUEMADOS PARA PROBAR EL CODIGO
        Mascota terry = new Mascota("79846523","Terry",4,'M',"Perro","Criollo");
        Mascota mascota1 = new Mascota("123456789", "Max", 3, 'M', "Perro", "Labrador");
        Mascota mascota2 = new Mascota("987654321", "Luna", 2, 'H', "Gato", "Siames");
        Mascota mascota3 = new Mascota("456789123", "Rocky", 5, 'M', "Perro", "Bulldog");
        Mascota mascota4 = new Mascota("789123456", "Bella", 1, 'H', "Perro", "Poodle");
        Mascota mascota5 = new Mascota("654321987", "Simba", 4, 'M', "Gato", "Persa");
        Mascota mascotaDuplicado = mascota1;
        mascotas.add(terry);
        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(mascota3);
        mascotas.add(mascota4);
        mascotas.add(mascota5);
        mascotas.add(mascotaDuplicado);
        Cliente clienteDefault = new Cliente("1004918011", "Sena","Daniel","daniel@uq.com", "numero#");
        clientes.add(clienteDefault);

        // Agregar veterinarios
        VETERINARIOS.add(new Veterinario("79846523", "David Pareja", "1234567890", "david@patitaspeludas.com", "123"));
        VETERINARIOS.add(new Veterinario("15679461", "María Rodríguez", "9876543210", "maria@patitaspeludas.com", "123"));
        VETERINARIOS.add(new Veterinario("98456120", "Carlos López", "5678901234", "carlos@patitaspeludas.com", "123"));
        VETERINARIOS.add(new Veterinario("16819812", "Ana Gómez", "4567890123", "ana@patitaspeludas.com", "123"));
        VETERINARIOS.add (new Veterinario("1092851101", "Doc JuanPa", "123", "jp@patitaspeludas.com", "inminentepodcast"));
    }

    public static ArrayList<Veterinario> getVETERINARIOS() {
        return VETERINARIOS;
    }

    public static void setVETERINARIOS(ArrayList<Veterinario> VETERINARIOS) {
        PatitasPeludas.VETERINARIOS = VETERINARIOS;
    }

    public static ArrayList<Cita> getCitas() {
        return citas;
    }

    public static void setCitas(ArrayList<Cita> citas) {
        PatitasPeludas.citas = citas;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        PatitasPeludas.clientes = clientes;
    }

    public static ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public static void setMascotas(ArrayList<Mascota> mascotas) {
        PatitasPeludas.mascotas = mascotas;
    }

    public static boolean verificarVeterinario(String usuario, String contrasenia) {
        boolean existe = false;
        for (Veterinario veterinario : VETERINARIOS) {
            if (veterinario.getCorreo().equals(usuario) && veterinario.getContrasenia().equals(contrasenia)) {
                existe = true; // Veterinario encontrado
                break; // Puedes salir del ciclo una vez que encuentras al veterinario
            }
        }
        return existe;
    }

    public static int buscarIndiceVeterinario(String nombreVeterinario) {
        for (int i = 0; i < VETERINARIOS.size(); i++) {
            Veterinario veterinario = VETERINARIOS.get(i);
            if (veterinario.getNombre().equals(nombreVeterinario)) {
                return i; // Índice del veterinario encontrado
            }
        }
        return -1; // Retorna -1 si el veterinario no se encuentra en la lista
    }

    public static void imprimirCitas() {
        System.out.println("Lista de Citas:");
        for (Cita cita : citas) {
            System.out.println("Fecha: " + cita.getFecha() +
                    ", Mascota: " + cita.getMascota().getNombre() +
                    ", Veterinario: " + cita.getVeterinario().getNombre());
        }
    }

}
