
package ejerciciopizzeriav3;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/* @author Álvaro García Fernández */
public class FXMLDocumentController implements Initializable {
       ObservableList<String> tiposTamano = FXCollections.observableArrayList("Pequeña", "Mediana", "Familiar");
    ToggleGroup masa = new ToggleGroup();
    Double precioTotalDouble = 0.0;
    Double multiplicadorTamaño = 1.15;
    Double doublemasa = 0.0;
    Double doublePizza = 0.0;
    String tamaño = "Mediana";
    Double doubleIngrediente = 0.0;
    String stringIngrediente = "";
    String StipoPizza ="";
    String sMasa = "";
    Map<String, Double> ingredientes = new HashMap<>();
    Map<String, Double> masas = new HashMap<>();
    Map<String, Double> tamaños = new HashMap<>();
    Map<String, Double> tiposPizza = new HashMap<>();
    @FXML
    private Label label;
    @FXML
    private RadioButton original;
    @FXML
    private RadioButton pan;
    @FXML
    private RadioButton finizzima;
    @FXML
    private RadioButton dominosroll;
    @FXML
    private RadioButton cabraroll;
    @FXML
    private TextArea DescripcionMasa1;
    @FXML
    private Label labelPizza;
    @FXML
    private ImageView DominosPizza;
    @FXML
    private Label labelPersonas;
    @FXML
    private Label label1;
    @FXML
    private ComboBox<String> desplegableTamaño;
    @FXML
    private Label precioTotal;
    @FXML
    private Label precioTamaño;
    @FXML
    private Label precioIngredientes;
    @FXML
    private Label precioPizza;
    @FXML
    private Label precioMasa;
    @FXML
    private Label tipoMasa111;
    @FXML
    private Label tipoMasa11;
    @FXML
    private Label labelMasa;
    @FXML
    private Label MasaElegida;
    @FXML
    private Label tipoPizza;
    @FXML
    private Label labelIngredientes;
    @FXML
    private Label labelTamaño;
    @FXML
    private Label pizzaElegida;
    @FXML
    private TextArea seleccionIngredientes;
    @FXML
    private Label tamañoElegido;
    @FXML
    private Label labelTotal;
    @FXML
    private Button cancelarPedido;
    @FXML
    private Label label2;
    @FXML
    private CheckBox ingredienteAceitunas;
    @FXML
    private CheckBox ingredienteAnchoas;
    @FXML
    private CheckBox ingredienteAtun;
    @FXML
    private CheckBox ingredientebacon;
    @FXML
    private CheckBox ingredienteCeballo;
    @FXML
    private CheckBox ingredienteMaiz;
    @FXML
    private CheckBox ingredientePepperoni;
    @FXML
    private CheckBox ingredientePimientoV;
    @FXML
    private CheckBox ingredienteTofu;
    @FXML
    private CheckBox ingredientePollo;
    @FXML
    private CheckBox ingredienteChampinon;
    @FXML
    private CheckBox ingredienteTernera;
    @FXML
    private CheckBox ingredienteJamonY;
    @FXML
    private CheckBox ingredienteTomate;
    @FXML
    private CheckBox ingredienteJamonS;
    @FXML
    private CheckBox ingredienteCebolla;
    
    private void handleButtonAction(ActionEvent event) {
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           Image image = new Image("file:2020a7aab3832ed9bcd056792c39dbdf_domino-dominos-pizza-clipart_210-210.png");
        this.DominosPizza.setImage(image);
        desplegableTamaño.setItems(tiposTamano);
        desplegableTamaño.setValue("Mediana");
        listarprecios();
    }    
 private void listarprecios() {

        ingredientes.put("Aceitunas Negras", 1.85);
        ingredientes.put("Anchoas", 1.85);
        ingredientes.put("Atún", 1.85);
        ingredientes.put("Cebolla", 1.85);
        ingredientes.put("Cebolla Caramelizada", 1.85);
        ingredientes.put("Champiñón", 1.85);
        ingredientes.put("Jamón Serrano", 1.85);
        ingredientes.put("Jamón de York", 1.85);
        ingredientes.put("Maiz", 1.85);
        ingredientes.put("Pepperoni", 1.85);
        ingredientes.put("Pimiento Verde", 1.85);
        ingredientes.put("Tofu", 1.85);
        ingredientes.put("Tomate Natural", 1.85);
        ingredientes.put("Bacon", 1.85);
        ingredientes.put("Pollo a la Parrilla", 1.85);
        ingredientes.put("Aceitunas Negras", 1.85);

        tiposPizza.put("Margarita", 6.0);
        tiposPizza.put("Cheesix", 8.0);
        tiposPizza.put("Pulled Beef", 8.0);
        tiposPizza.put("Pulled Pork", 8.0);
        tiposPizza.put("Barbacoa", 7.0);
        tiposPizza.put("Pecado Carnal", 7.0);
        tiposPizza.put("Cremozza BBQ", 7.0);
        tiposPizza.put("Cremozza Estilo Bourbon", 7.0);
        tiposPizza.put("Carbonara", 7.0);
        tiposPizza.put("Cabramelizada", 7.0);
        tiposPizza.put("Pollo a la Parrilla", 7.0);
        tiposPizza.put("Cuatro Quesos", 7.0);
        tiposPizza.put("Hawaiana Plus", 7.0);
        tiposPizza.put("Extravaganzza", 7.0);
        tiposPizza.put("Pata Negra", 7.0);
        tiposPizza.put("Campiña", 7.0);
        tiposPizza.put("Tony Pepperoni", 7.0);

        masas.put("Original", 1.0);
        masas.put("Pan", 1.0);
        masas.put("Finízzima", 1.0);
        masas.put("Domino's Roll", 2.0);
        masas.put("Cabra & Roll", 2.0);

        tamaños.put("Pequeña", 1.0);
        tamaños.put("Mediana", 1.15);
        tamaños.put("Familiar", 1.30);

    }
    @FXML
    private void TipoDeMasa(ActionEvent event) {
          this.original.setToggleGroup(masa);
        this.original.setUserData("Original");
        this.pan.setToggleGroup(masa);
        this.pan.setUserData("Pan");
        this.finizzima.setToggleGroup(masa);
        this.finizzima.setUserData("Finízzima");
        this.dominosroll.setToggleGroup(masa);
        this.dominosroll.setUserData("Domino's Roll");
        this.cabraroll.setToggleGroup(masa);
        this.cabraroll.setUserData("Cabra & Roll");

        doublemasa = this.masas.get(this.masa.getSelectedToggle().getUserData());
        if (this.masa.getSelectedToggle().getUserData().equals("Original")) {
            this.DescripcionMasa1.setText("Para aquellos amantes \n del auténtico sabor \n de la pizza Domino's");
            sMasa = "Original";
        }
        if (this.masa.getSelectedToggle().getUserData().equals("Pan")) {
            sMasa = "Pan";
            this.DescripcionMasa1.setText("Al más puro \n estilo Chicago");
        }
        if (this.masa.getSelectedToggle().getUserData().equals("Finízzima")) {
            sMasa = "Finízzima";
            this.DescripcionMasa1.setText("La masa más \n fina y crujiente \n de Domino's");
        }
        if (this.masa.getSelectedToggle().getUserData().equals("Domino's Roll")) {
            sMasa = "Domino's Roll";
            this.DescripcionMasa1.setText("Con delicioso borde \n relleno de queso");
        }
        if (this.masa.getSelectedToggle().getUserData().equals("Cabra & Roll")) {
            sMasa = "Cabra & Roll";
            this.DescripcionMasa1.setText("Borde relleno de \n queso de cabra fundido");
        }

        DecimalFormat formato = new DecimalFormat("0.00");
        this.MasaElegida.setText(this.sMasa);
        this.precioMasa.setText(formato.format(this.doublemasa) + "€");
        precioTotalDouble =(doublemasa + doublePizza + doubleIngrediente) * multiplicadorTamaño;
        this.precioTotal.setText(formato.format(this.precioTotalDouble) + "€");

    }

    @FXML
    private void seleccionPizza(ActionEvent event) {
        List<String> choices = new ArrayList<>();

        choices.add("Margarita");
        choices.add("Cheesix");
        choices.add("Pulled Beef");
        choices.add("Pulled Pork");
        choices.add("Barbacoa");
        choices.add("Pecado Carnal");
        choices.add("Cremozza BBQ");
        choices.add("Cremozza Estilo Bourbon");
        choices.add("Carbonara");
        choices.add("Cabramelizada");
        choices.add("Pollo a la Parrilla");
        choices.add("Cuatro Quesos");
        choices.add("Hawaiana Plus");
        choices.add("Extravaganzza");
        choices.add("Pata Negra");
        choices.add("Campiña");
        choices.add("Tony Pepperoni");

        ChoiceDialog<String> dialog = new ChoiceDialog<>("Margarita", choices);
        dialog.setTitle("Domino's Pizza");
        dialog.setHeaderText("Selección de Pizza");
        dialog.setContentText("Elije tu pizza:");

        Optional<String> result = dialog.showAndWait();
        if (result.get().equals("Margarita")) {
            StipoPizza = "Margarita";
            doublePizza = this.tiposPizza.get("Margarita");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Cheesix")) {
            StipoPizza = "Cheesix";
            doublePizza = this.tiposPizza.get("Cheesix");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Pulled Beef")) {
            StipoPizza = "Pulled Beef";
            doublePizza = this.tiposPizza.get("Pulled Beef");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Pulled Pork")) {
            StipoPizza = "Pulled Pork";
            doublePizza = this.tiposPizza.get("Pulled Pork");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Barbacoa")) {
            StipoPizza = "Barbacoa";
            doublePizza = this.tiposPizza.get("Barbacoa");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Pecado Carnal")) {
            StipoPizza = "Pecado Carnal";
            doublePizza = this.tiposPizza.get("Pecado Carnal");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Cremozza BBQ")) {
            StipoPizza = "Cremozza BBQ";
            doublePizza = this.tiposPizza.get("Cremozza BBQ");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Cremozza Estilo Bourbon")) {
            StipoPizza = "Cremozza Estilo Bourbon";
            doublePizza = this.tiposPizza.get("Cremozza Estilo Bourbon");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Carbonara")) {
            StipoPizza = "Carbonara";
            doublePizza = this.tiposPizza.get("Carbonara");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Cabramelizada")) {
            StipoPizza = "Cabramelizada";
            doublePizza = this.tiposPizza.get("Cabramelizada");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Pollo a la Parrilla")) {
            StipoPizza = "Pollo a la Parrilla";
            doublePizza = this.tiposPizza.get("Pollo a la Parrilla");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Cuatro Quesos")) {
            StipoPizza = "Cuatro Quesos";
            doublePizza = this.tiposPizza.get("Cuatro Quesos");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Hawaiana Plus")) {
            StipoPizza = "Hawaiana Plus";
            doublePizza = this.tiposPizza.get("Hawaiana Plus");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Extravaganzza")) {
            StipoPizza = "Extravaganzza";
            doublePizza = this.tiposPizza.get("Extravaganzza");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Pata Negra")) {
            StipoPizza = "Pata Negra";
            doublePizza = this.tiposPizza.get("Pata Negra");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Campiña")) {
            StipoPizza = "Campiña";
            doublePizza = this.tiposPizza.get("Campiña");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Tony Pepperoni")) {
            StipoPizza = "Tony Pepperoni";
            doublePizza = this.tiposPizza.get("Tony Pepperoni");
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        DecimalFormat formato = new DecimalFormat("0.00");

        this.pizzaElegida.setText(this.StipoPizza);
        this.precioPizza.setText(formato.format(this.doublePizza) + "€");
        precioTotalDouble = (doublemasa + doublePizza + doubleIngrediente) * multiplicadorTamaño;
        this.precioTotal.setText(formato.format(this.precioTotalDouble) + "€");
    }

    @FXML
    private void seleccionTamaño(ActionEvent event) {
        String seleccion = desplegableTamaño.getValue();
        if (seleccion.equals("Pequeña")) {
            tamaño = "Pequeña";
            labelPersonas.setText("1");
            doublePizza = this.tamaños.get("Pequeña");
        }
        if (seleccion.equals("Mediana")) {
            tamaño = "Mediana";
            labelPersonas.setText("2");
            doublePizza = this.tamaños.get("Mediana");
        }
        if (seleccion.equals("Familiar")) {
            tamaño = "Familiar";
            labelPersonas.setText("4");
            doublePizza = this.tamaños.get("Familiar");
        }
        DecimalFormat formato = new DecimalFormat("0.00");
        this.tamañoElegido.setText(this.tamaño);
        this.precioTamaño.setText("" + this.multiplicadorTamaño);
        precioTotalDouble = (doublemasa + doublePizza + doubleIngrediente) * multiplicadorTamaño;
        this.precioTotal.setText(formato.format(this.precioTotalDouble) + "€");
    }

    @FXML
    private void ResetPedido(ActionEvent event) {
        precioTotalDouble = 0.0;
        multiplicadorTamaño = 1.15;
        doublemasa = 0.0;
        doublePizza = 0.0;
        tamaño = "";
        doubleIngrediente = 0.0;
        StipoPizza = "";
        sMasa = "";

        this.labelPizza.setText("Selecciona tu pizza deseada");

        this.dominosroll.setCache(false);
        this.cabraroll.setCache(false);
        this.finizzima.setCache(false);
        this.original.setCache(false);
        this.pan.setCache(false);

        this.ingredienteAceitunas.setSelected(false);
        this.ingredienteAnchoas.setSelected(false);
        this.ingredienteAtun.setSelected(false);
        this.ingredienteCeballo.setSelected(false);
        this.ingredienteCebolla.setSelected(false);
        this.ingredienteChampinon.setSelected(false);
        this.ingredienteJamonS.setSelected(false);
        this.ingredienteJamonY.setSelected(false);
        this.ingredienteMaiz.setSelected(false);
        this.ingredientePepperoni.setSelected(false);
        this.ingredientePimientoV.setSelected(false);
        this.ingredientePollo.setSelected(false);
        this.ingredienteTernera.setSelected(false);
        this.ingredienteTofu.setSelected(false);
        this.ingredienteTomate.setSelected(false);
        this.ingredientebacon.setSelected(false);

        this.MasaElegida.setText("Tu masa");
        this.pizzaElegida.setText("Tu pizza");
        this.tamañoElegido.setText("Tu tamaño");
        this.seleccionIngredientes.setText("");
        this.precioMasa.setText("");
        this.precioPizza.setText("");
        this.precioIngredientes.setText("");
        this.precioTamaño.setText("");
        this.precioTotal.setText("");

        desplegableTamaño.setValue("Mediana");
        this.labelPersonas.setText("");
    }

    @FXML
    private void ingredientesExtra(ActionEvent event) {
         doubleIngrediente =0.0;
        if (this.ingredienteAceitunas.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Aceitunas Negras");
            this.seleccionIngredientes.appendText("Aceitunas Negras" + "\n");
        }
        if (this.ingredienteAnchoas.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Anchoas");
            this.seleccionIngredientes.appendText("Anchoas" + "\n");

        }
        if (this.ingredienteAtun.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Atún");
            this.seleccionIngredientes.appendText("Atún" + "\n");

        }
        if (this.ingredienteCeballo.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Cebolla");
            this.seleccionIngredientes.appendText("Cebolla" + "\n");

        }
        if (this.ingredienteCebolla.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Cebolla Caramelizada");
            this.seleccionIngredientes.appendText("Cebolla Caramelizada" + "\n");

        }
        if (this.ingredienteChampinon.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Champiñón");
            this.seleccionIngredientes.appendText("Champiñón" + "\n");

        }
        if (this.ingredienteJamonS.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Jamón Serrano");
            this.seleccionIngredientes.appendText("Jamón Serrano" + "\n");

        }
        if (this.ingredienteJamonY.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Jamón de York");
            this.seleccionIngredientes.appendText("Jamón de York" + "\n");

        }
        if (this.ingredienteMaiz.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Maiz");
            this.seleccionIngredientes.appendText("Maiz" + "\n");

        }
        if (this.ingredientePepperoni.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Pepperoni");
            this.seleccionIngredientes.appendText("Pepperoni" + "\n");

        }
        if (this.ingredientePimientoV.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Pimiento Verde");
            this.seleccionIngredientes.appendText("Pimiento Verde" + "\n");

        }
        if (this.ingredienteTofu.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Tofu");
            this.seleccionIngredientes.appendText("Tofu" + "\n");

        }
        if (this.ingredienteTomate.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Tomate Natural");
            this.seleccionIngredientes.appendText("Tomate Natural" + "\n");

        }
        if (this.ingredientebacon.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Bacon");
            this.seleccionIngredientes.appendText("Bacon" + "\n");

        }
        if (this.ingredientePollo.isSelected()) {
            doubleIngrediente = doubleIngrediente + this.ingredientes.get("Pollo a la Parrilla");
            this.seleccionIngredientes.appendText("Pollo a la Parrilla" + "\n");

        }
        DecimalFormat formato = new DecimalFormat("0.00");
        
        this.precioIngredientes.setText(doubleIngrediente + "€");
        this.seleccionIngredientes.appendText("\n");
        this.seleccionIngredientes.appendText("\n");
        precioTotalDouble = (doublemasa + doublePizza + doubleIngrediente) * multiplicadorTamaño;
        this.precioTotal.setText(formato.format(this.precioTotalDouble) + "€");
    }
    
}
