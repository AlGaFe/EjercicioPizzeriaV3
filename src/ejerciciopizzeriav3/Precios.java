package ejerciciopizzeriav3;

import java.util.HashMap;
import java.util.Map;

public class Precios {
 private Map<String, Double> ingredientes = new HashMap<>();
 private  Map<String, Double> masas = new HashMap<>();
 private Map<String, Double> tamanos = new HashMap<>();
 private  Map<String, Double> tiposPizza = new HashMap<>();

    public Precios() {
    }

    public void setIngredientes(Map<String, Double> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setMasas(Map<String, Double> masas) {
        this.masas = masas;
    }

    public void setTamanos(Map<String, Double> tamaños) {
        this.tamanos = tamaños;
    }

    public void setTiposPizza(Map<String, Double> tiposPizza) {
        this.tiposPizza = tiposPizza;
    }

    public Map<String, Double> getIngredientes() {
        return ingredientes;
    }

    public Map<String, Double> getMasas() {
        return masas;
    }

    public Map<String, Double> getTamanos() {
        return tamanos;
    }

    public Map<String, Double> getTiposPizza() {
        return tiposPizza;
    }
    public void anadirIngrediente(String ingrediente, Double precio){
        ingredientes.put(ingrediente, precio);
    }
    public void anadirMasas(String masa, Double precio){
        masas.put(masa, precio);
    }
    public void anadirTamano(String tamano,Double multiplicador){
        tamanos.put(tamano, multiplicador);
    }
    public void anadirTipoPizza(String tipo, Double precio){
        tiposPizza.put(tipo, precio);
    }
     public void eliminarIngrediente(String ingrediente){
        ingredientes.remove(ingrediente);
    }
    public void elimiarMasas(String masa){
        masas.remove(masa);
    }
    public void eliminarTamano(String tamano){
        tamanos.remove(tamano);
    }
    public void eliminarTipoPizza(String tipo){
        tiposPizza.remove(tipo);
    }
    public Double precioIngrediente(String ingrediente){
        Double precio;
        precio= ingredientes.get(ingrediente);
       return precio;
    }
    public Double precioMasa(String masa){
        Double precio;
        precio= masas.get(masa);
       return precio;
    }
    public Double precioTamano(String tamano){
        Double precio;
        precio= tamanos.get(tamano);
       return precio;
    }
    public Double precioTipo(String tipo){
        Double precio;
        precio= tiposPizza.get(tipo);
       return precio;
    }
}
