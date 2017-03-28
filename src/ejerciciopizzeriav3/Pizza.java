
package ejerciciopizzeriav3;


import java.util.ArrayList;


public class Pizza {
  private String masa;
  private String tipo;
  private String tamano;
  private ArrayList <String> listaIngredientes = new ArrayList<>();
  private Precios precios = new Precios();

    public Pizza() {

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
         if(precioMasa==null){
         precioMasa=0.0;
    }
       Double multiplicadorTamano = precios.precioTamano(tamano);
       if (multiplicadorTamano==null) {
            multiplicadorTamano=1.15;
        }
       Double precioTipo = precios.precioTipo(tipo);
       if(precioTipo==null){
       precioTipo=0.0;
    }
        for(int i = 0; i < this.listaIngredientes.size(); i++) {
            String ingrediente=listaIngredientes.get(i);
            Double precioIngrediente= precios.precioIngrediente(ingrediente);
            if(precioIngrediente==null){
                precioIngrediente=0.0;
            }
            precioIngredientes +=precioIngrediente;
            
        }
    
   
       precioTotal=multiplicadorTamano*(precioIngredientes+precioMasa+precioTipo);
       return precioTotal;
    }
    
  
}
