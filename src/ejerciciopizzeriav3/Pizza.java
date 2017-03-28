
package ejerciciopizzeriav3;


import java.util.ArrayList;


public class Pizza {
  private String masa;
  private String tipo;
  private String tamano;
  private ArrayList <String> listaIngredientes = new ArrayList<>();
  private Precios precios = new Precios();

    public Pizza(String masa, String tipo, String tamano) {
        this.masa = masa;
        this.tipo = tipo;
        this.tamano = tamano;
    }
    public void AñadirIngrediente (String ingrediente){
        listaIngredientes.add(ingrediente);
    }
    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void setListaIngredientes(ArrayList<String> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public ArrayList<String> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setPrecios(Precios precios) {
        this.precios = precios;
    }

    public String getMasa() {
        return masa;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamano() {
        return tamano;
    }


    public Precios getPrecios() {
        return precios;
    }
    public Double calcularPrecio(){
       Double precioTotal;
       Double precioIngredientes=0.0;
       Double precioMasa= precios.precioMasa(masa);
       Double multiplicadorTamano = precios.precioTamano(tamano);
       Double precioTipo = precios.precioTipo(tipo);
        for(int i = 0; i < this.listaIngredientes.size(); i++) {
            String ingrediente=
            Double precioIngrediente= precios.precioIngrediente(i);
        }
       
            Double precioIngrediente= precios.precioIngrediente(i);
            precioIngredientes=precioIngredientes + precioIngrediente;
        
       precioTotal=multiplicadorTamano*(precioIngredientes+precioMasa+precioTipo);
       return precioTotal;
    }
    
  
}
