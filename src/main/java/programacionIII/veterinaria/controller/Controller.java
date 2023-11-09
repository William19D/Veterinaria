package programacionIII.veterinaria.controller;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import programacionIII.veterinaria.model.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;


public class Controller {

    @FXML
    private AnchorPane ventanaFactura;

    @FXML
    private Button botonHistoriaClinica;

    @FXML
    private AnchorPane ventanaNotas;

    @FXML
    private DatePicker fechaNotas;

    @FXML
    private TableView<Cita> tablaNotas;

    @FXML
    private Button volverNotasMenu;

    @FXML
    private Button volverFacturasMenu;

    @FXML
    private AnchorPane ventanaFacturas;
    @FXML
    private TableView<Cita> tablaFacturas;

    @FXML
    private Button BotonImprimirFactura;

    @FXML
    private TableColumn<Cita, String> columnCedulaFacturas;

    @FXML
    private TableColumn<Cita, Double> columnCostoFacturas;

    @FXML
    private DatePicker fechaFacturas;

    @FXML
    private TextField edadMascota;

    @FXML
    private TextField RazaMascota;

    @FXML
    private Button botonVolverRegistrarMascota;

    @FXML
    private Button botonRegistrarMascota;

    @FXML
    private TextField cedulaClienteMascota;

    @FXML
    private TextField nombreMascota;

    @FXML
    private AnchorPane registrarMascotaVentana;

    @FXML
    private TextField sexoMascota;

    @FXML
    private TextField tipoMascota;

    @FXML
    private DatePicker fechaFinal;

    @FXML
    private DatePicker fechaInicial;

    @FXML
    private Button historicoBoton;

    @FXML
    private AnchorPane historicoVentana;

    @FXML
    private Label cedulaFac;
    @FXML
    private Label costoFac;
    @FXML
    private Label observacionesFac;

    @FXML
    private Label citasAtendidas;

    @FXML
    private Label citasSolicitadas;

    private Cita citaSeleccionada;


    @FXML
    private AnchorPane atenderVentana;

    @FXML
    private TableColumn<Mascota, String> columnCedula;

    @FXML
    private TableColumn<Cita, String> columnFecha;

    @FXML
    private TableColumn<Cita, String> columnMascota;

    @FXML
    private Button imprimirFactura;
    @FXML
    private Button volverMenuFacturas;
    @FXML
    private Button elegirCitaBoton;

    @FXML
    private AnchorPane citasVentana;

    @FXML
    private AnchorPane registrarClienteVentana;

    @FXML
    private Button agendarCitaBoton;

    @FXML
    private DatePicker fecha;

    @FXML
    private Button boton;

    @FXML
    private PasswordField contrasenia;

    @FXML
    private AnchorPane login;

    @FXML
    private AnchorPane menu;

    @FXML
    private Label txTest;

    @FXML
    private TextField usuario;

    @FXML
    private Button desconectar;

    @FXML
    private TextField costosAdicionales;

    @FXML
    private TextArea notasCita;

    @FXML
    private TableView<Mascota> tablaMascotas;

    @FXML
    private TableColumn<Mascota, String> columnNombre;

    @FXML
    private TableColumn<Mascota, Integer> columnEdad;

    @FXML
    private TableColumn<Mascota, Character> columnSexo;

    @FXML
    private TableColumn<Mascota, String> columnTipo;

    @FXML
    private TableColumn<Cita, String> columnVeterinario;

    @FXML
    private TableView<Cita> tablaCitas;

    @FXML
    private TableColumn<Mascota, String> columnRaza;

    @FXML
    private Button volverAgendar;

    @FXML
    private Button botonVolverRegistrarCliente;

    @FXML
    private Button volverCitas;

    @FXML
    private TextField cedula;

    @FXML
    private TextField correo;

    @FXML
    private TextField direccion;

    @FXML
    private TextField nombre;

    @FXML
    private Button registrarCliente;

    @FXML
    private TextField telefono;

    @FXML
    private Button registrarClienteMenu;

    @FXML
    private MenuButton menuVeterinario;

    @FXML
    private MenuButton menuVetHistorico;

    @FXML
    private Button volverBotonAtencion;



    @FXML
    public void loginButton() {
        String user = usuario.getText(); // Asegúrate de obtener el usuario del campo de texto correcto
        String pass = contrasenia.getText(); // Asegúrate de obtener la contraseña del campo de contraseña correcto
        PatitasPeludas patitasPeludas = new PatitasPeludas();
        if (PatitasPeludas.verificarVeterinario(user, pass)) {
            login.setVisible(false);
            menu.setVisible(true);
        } else {
            txTest.setVisible(true);
        }
    }

    @FXML
    private AnchorPane agendarCita;

    @FXML
    public void desconectarVeterinario() {
        menu.setVisible(false);
        login.setVisible(true);
    }
    @FXML
    void registrarMascota(ActionEvent event) {
        volverMenu();
        anadirMascota();

    }
    public void mostrarRegistrarMascota () {
        menu.setVisible(false);
        registrarMascotaVentana.setVisible(true);

    }

    public void mostrarFacturas () {
        menu.setVisible(false);
        ventanaFacturas.setVisible(true);

    }

    public void mostrarAtencion () {
        ventanaNotas.setVisible(false);
        atenderVentana.setVisible(true);
    }

    public void mostrarVentanaNotas () {
        menu.setVisible(false);
        ventanaNotas.setVisible(true);
    }




    public void volverMenu(){
        agendarCita.setVisible(false);
        registrarClienteVentana.setVisible(false);
        citasVentana.setVisible(false);
        menu.setVisible(true);
        registrarMascotaVentana.setVisible(false);
        ventanaFacturas.setVisible(false);
        ventanaNotas.setVisible(false);
        ventanaFactura.setVisible(false);

    }

    public void volverMenuCitas(){
        citasVentana.setVisible(true);
        atenderVentana.setVisible(false);

    }
      public void anadirCliente () {
         Cliente nuevoCliente = new Cliente(cedula.getText(), direccion.getText(), nombre.getText(), correo.getText(), telefono.getText());
          PatitasPeludas.getClientes().add(nuevoCliente);

    }

    public void anadirMascota () {
        Mascota nuevaMascota = new Mascota (cedulaClienteMascota.getText(),nombreMascota.getText(),
                Integer.parseInt (edadMascota.getText()), sexoMascota.getText().charAt(0) , tipoMascota.getText(), RazaMascota.getText());
                PatitasPeludas.getMascotas().add(nuevaMascota);

    }

    @FXML
    public void registrarClienteFun () {
    anadirCliente();
    volverMenu();
    }



    public void mostrarAgendar(){
        menu.setVisible(false);
        agendarCita.setVisible(true);
        initialize();
        initializeTableAgenda();

    }

    public void mostrarCitas(){
        menu.setVisible(false);
        citasVentana.setVisible(true);
        initializeTableCitas();
    }

    public void mostrarRegistrarCliente(){
        menu.setVisible(false);
        registrarClienteVentana.setVisible(true);
    }

    public void initialize() {
        // Configurar el DatePicker para permitir solo fechas futuras
        fecha.setDayCellFactory(picker -> new DateCell() {
            @Override
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                setDisable(empty || date.isBefore(LocalDate.now()));
            }
        });
    }

    public void agendarCita(){
        LocalDate fechaCita = fecha.getValue();

        if (fechaCita != null) {
            System.out.println("Fecha seleccionada: " + fechaCita);
            Mascota mascota = seleccionarMascota();
            Veterinario veterinario = PatitasPeludas.getVETERINARIOS().get(PatitasPeludas.buscarIndiceVeterinario(menuVeterinario.getText()));
            Cita.agregarCita(fechaCita, mascota,  veterinario,false);
            volverMenu();

        } else {
            System.out.println("Ninguna fecha seleccionada");
        }

    }
//Inicializar
    public void initializeTableAgenda() {
        // Configura las columnas para que muestren los datos de las mascotas
        ObservableList<Mascota> mascotasList = FXCollections.observableArrayList(PatitasPeludas.getMascotas());

        // Enlaza el ObservableList con la tabla y sus columnas
        tablaMascotas.setItems(mascotasList);

        columnCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedulaDueno()));
        columnNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        columnEdad.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getEdad()).asObject());
        columnSexo.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getSexo()));
        columnTipo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTipo()));
        columnRaza.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRaza()));

    }

    public void initializeTableCitas() {
        // Configura las columnas para que muestren los datos de las citas
        List<Cita> citasFiltradas = PatitasPeludas.getCitas()
                .stream()
                .filter(cita -> !cita.isEstado())
                .collect(Collectors.toList());

        ObservableList<Cita> citasList = FXCollections.observableArrayList(citasFiltradas);

        // Enlaza el ObservableList con la tabla y sus columnas
        tablaCitas.setItems(citasList);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");

        columnFecha.setCellValueFactory(cellData -> {
            LocalDate fechaCita = cellData.getValue().getFecha();
            String fechaFormatted = fechaCita.format(dateFormatter);
            return new SimpleStringProperty(fechaFormatted);
        });

        columnMascota.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMascota().getNombre()));
        columnVeterinario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVeterinario().getNombre()));

    }

    @FXML
    private void mostrarDetallesCita() {
        // Oculta la ventana de facturas y muestra la ventana de factura
        ventanaFacturas.setVisible(false);
        ventanaFactura.setVisible(true);

        if (citaSeleccionada != null) {
            // Establece los valores en tus campos de texto o donde desees mostrar la información
            cedulaFac.setText(citaSeleccionada.getMascota().getCedulaDueno());
            costoFac.setText(String.valueOf(citaSeleccionada.getCosto()));
            observacionesFac.setText(citaSeleccionada.getNota());


        }
    }

    @FXML
    private Mascota seleccionarMascota() {
        return tablaMascotas.getSelectionModel().getSelectedItem();
    }

    @FXML
    private void volverHistoricoCitas(){
        historicoVentana.setVisible(false);
        citasVentana.setVisible(true);
    }


    @FXML
    private void seleccionarVeterinario(ActionEvent event) {
        actualizarMenuVeterinario(menuVeterinario, event);
    }

    @FXML
    private void seleccionarVeterinarioHis(ActionEvent event) {
        actualizarMenuVeterinario(menuVetHistorico, event);
        contarCitasVeterinario();
    }

    private void actualizarMenuVeterinario(MenuButton menu, ActionEvent event) {
        MenuItem selectedItem = (MenuItem) event.getSource();
        String veterinarioSeleccionado = selectedItem.getText();
        System.out.println("Veterinario seleccionado: " + veterinarioSeleccionado);
        menu.setText(veterinarioSeleccionado);
    }

    @FXML
    public void atenderCita(ActionEvent event) {
        citaSeleccionada = tablaCitas.getSelectionModel().getSelectedItem();

        if (citaSeleccionada != null) {
            citasVentana.setVisible(false);
            atenderVentana.setVisible(true);
            System.out.println("Se seleecionó la cita de: " + citaSeleccionada.getMascota().getNombre());

        } else {
            System.out.println("No hay cita seleccionada. ");
        }

    }

    @FXML
    private void finalizarCita() {
        if (citaSeleccionada != null) {
            citaSeleccionada.setNota(notasCita.getText());
            double costosAdicionalesValue = costosAdicionales.getText().isEmpty() ? 0.0 : Double.parseDouble(costosAdicionales.getText());
            citaSeleccionada.setCosto(Double.parseDouble(String.valueOf(costosAdicionalesValue + PatitasPeludas.PRECIOCITA)));
            citaSeleccionada.imprimirDetalles();
            citaSeleccionada.setEstado(true);
            atenderVentana.setVisible(false);
            menu.setVisible(true);
        } else {
            // Muestra un mensaje de error o realiza alguna otra acción apropiada
            System.out.println("No hay cita seleccionada para finalizar.");
        }
    }

    @FXML
    private void mostrarHistorico(){
        citasVentana.setVisible(false);
        historicoVentana.setVisible(true);
        initializeFechaFinal();
        contarCitasVeterinario();

    }

    @FXML
    public void initializeFechaFinal() {
        fechaFinal.setDayCellFactory(picker -> new DateCell() {
            @Override
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                LocalDate fechaSeleccionada = fechaInicial.getValue();
                setDisable(empty || fechaSeleccionada == null || date.isBefore(fechaSeleccionada));
            }
        });
        contarCitasVeterinario();
    }

    @FXML
    private void contarCitasVeterinario() {
        String nombreVeterinario = menuVetHistorico.getText();
        LocalDate fechaInicio = fechaInicial.getValue();
        LocalDate fechaFin = fechaFinal.getValue();

        if (fechaInicio != null && fechaFin != null) {
            List<Cita> citasVeterinario = PatitasPeludas.getCitas().stream()
                    .filter(cita -> cita.getVeterinario().getNombre().equals(nombreVeterinario))
                    .collect(Collectors.toList());

            long totalCitas = citasVeterinario.stream()
                    .filter(cita -> cita.getFecha().isAfter(fechaInicio.minusDays(1)) && cita.getFecha().isBefore(fechaFin.plusDays(1)))
                    .count();

            long citasAtendidasContador = citasVeterinario.stream()
                    .filter(cita -> cita.isEstado()
                            && cita.getFecha().isAfter(fechaInicio.minusDays(1)) && cita.getFecha().isBefore(fechaFin.plusDays(1)))
                    .count();

            citasSolicitadas.setText("" + totalCitas);
            citasAtendidas.setText("" + citasAtendidasContador);
        } else {
            System.out.println("No se ha seleccionado Fecha");
        }
    }


    public void filtrarFacturas() {
        LocalDate selectedDate = fechaFacturas.getValue(); // Obtiene la fecha seleccionada en el DatePicker

        if (selectedDate != null) {
            // Filtra las facturas según la fecha seleccionada
            List<Cita> facturasFiltradas = PatitasPeludas.getCitas()
                    .stream()
                    .filter(cita -> cita.getFecha().isEqual(selectedDate))
                    .collect(Collectors.toList());

            // Crea un ObservableList a partir de las facturas filtradas
            ObservableList<Cita> facturasList = FXCollections.observableArrayList(facturasFiltradas);

            // Configura las columnas para mostrar la cédula y el costo
            TableColumn<Cita, String> columnCedulaFacturas = new TableColumn<>("Cédula");
            columnCedulaFacturas.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMascota().getCedulaDueno())); // Ajusta esto según tu modelo de datos

            TableColumn<Cita, Double> columnCostoFacturas = new TableColumn<>("Costo");
            columnCostoFacturas.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getCosto()).asObject()); // Ajusta esto según tu modelo de datos

            // Agrega las columnas a la tabla si aún no están presentes
            if (!tablaFacturas.getColumns().contains(columnCedulaFacturas)) {
                tablaFacturas.getColumns().addAll(columnCedulaFacturas, columnCostoFacturas);
            }

            // Enlaza el ObservableList con el TableView
            tablaFacturas.setItems(facturasList);
        } else {
            // Si no se selecciona una fecha, muestra todas las facturas
            ObservableList<Cita> facturasList = FXCollections.observableArrayList(PatitasPeludas.getCitas());

            // Configura las columnas para mostrar la cédula y el costo
            TableColumn<Cita, String> columnCedulaFacturas = new TableColumn<>("Cédula");
            columnCedulaFacturas.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMascota().getCedulaDueno())); // Ajusta esto según tu modelo de datos

            TableColumn<Cita, Double> columnCostoFacturas = new TableColumn<>("Costo");
            columnCostoFacturas.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getCosto()).asObject()); // Ajusta esto según tu modelo de datos

            // Agrega las columnas a la tabla si aún no están presentes
            if (!tablaFacturas.getColumns().contains(columnCedulaFacturas)) {
                tablaFacturas.getColumns().addAll(columnCedulaFacturas, columnCostoFacturas);
            }

            // Enlaza el ObservableList con el TableView
            tablaFacturas.setItems(facturasList);
        }
    }

    public void mostrarNotasVeterinarios() {
        // Obtén la fecha seleccionada en el DatePicker
        LocalDate selectedDate = fechaNotas.getValue();

        if (selectedDate != null) {
            // Filtra las notas de veterinarios según la fecha seleccionada y que tengan notas no nulas
            List<Cita> citasConNotas = PatitasPeludas.getCitas()
                    .stream()
                    .filter(cita -> cita.getFecha().isEqual(selectedDate) && cita.getNota() != null)
                    .collect(Collectors.toList());

            // Crea un ObservableList a partir de las citas filtradas
            ObservableList<Cita> notasVeterinariosList = FXCollections.observableArrayList(citasConNotas);

            // Configura las columnas para mostrar el nombre de la mascota, el nombre del veterinario y las notas del veterinario
            TableColumn<Cita, String> columnNombreMascota = new TableColumn<>("Nombre de la Mascota");
            columnNombreMascota.setCellValueFactory(cellData -> {
                String nombreMascota = cellData.getValue().getMascota().getNombre();
                return new SimpleStringProperty(nombreMascota);
            });

            TableColumn<Cita, String> columnNombreVeterinario = new TableColumn<>("Nombre del Veterinario");
            columnNombreVeterinario.setCellValueFactory(cellData -> {
                String nombreVeterinario = cellData.getValue().getVeterinario().getNombre();
                return new SimpleStringProperty(nombreVeterinario);
            });

            TableColumn<Cita, String> columnNotasVeterinario = new TableColumn<>("Notas del Veterinario");
            columnNotasVeterinario.setCellValueFactory(cellData -> {
                String notasVeterinario = cellData.getValue().getNota();
                return new SimpleStringProperty(notasVeterinario);
            });

            // Agrega las columnas a la tabla si aún no están presentes
            if (!tablaNotas.getColumns().contains(columnNombreMascota)) {
                tablaNotas.getColumns().addAll(columnNombreMascota, columnNombreVeterinario, columnNotasVeterinario);
            }

            // Enlaza el ObservableList con el TableView
            tablaNotas.setItems(notasVeterinariosList);
        } else {
            // Si no se selecciona una fecha, muestra todas las notas de veterinarios con notas no nulas
            List<Cita> citasConNotas = PatitasPeludas.getCitas()
                    .stream()
                    .filter(cita -> cita.getNota() != null)
                    .collect(Collectors.toList());

            ObservableList<Cita> notasVeterinariosList = FXCollections.observableArrayList(citasConNotas);

            // Configura las columnas para mostrar el nombre de la mascota, el nombre del veterinario y las notas del veterinario
            TableColumn<Cita, String> columnNombreMascota = new TableColumn<>("Nombre de la Mascota");
            columnNombreMascota.setCellValueFactory(cellData -> {
                String nombreMascota = cellData.getValue().getMascota().getNombre();
                return new SimpleStringProperty(nombreMascota);
            });

            TableColumn<Cita, String> columnNombreVeterinario = new TableColumn<>("Nombre del Veterinario");
            columnNombreVeterinario.setCellValueFactory(cellData -> {
                String nombreVeterinario = cellData.getValue().getVeterinario().getNombre();
                return new SimpleStringProperty(nombreVeterinario);
            });

            TableColumn<Cita, String> columnNotasVeterinario = new TableColumn<>("Notas del Veterinario");
            columnNotasVeterinario.setCellValueFactory(cellData -> {
                String notasVeterinario = cellData.getValue().getNota();
                return new SimpleStringProperty(notasVeterinario);
            });

            // Agrega las columnas a la tabla si aún no están presentes
            if (!tablaNotas.getColumns().contains(columnNombreMascota)) {
                tablaNotas.getColumns().addAll(columnNombreMascota, columnNombreVeterinario, columnNotasVeterinario);
            }

            // Enlaza el ObservableList con el TableView
            tablaNotas.setItems(notasVeterinariosList);
        }
    }



}
