package ejerciciofactura;

public class Factura {
    public String numPieza;
    public String descripPieza;
    public int cantArticulo;
    public double precioArticulo;

    public Factura(String numPieza, String descripPieza, int cantArticulo, double precioArticulo){
        this.numPieza = numPieza;
        this.descripPieza = descripPieza;
        this.cantArticulo = cantArticulo;
        this.precioArticulo = precioArticulo;
    }

    //metodo establecer
    public void establecernumPieza (String numPieza){this.numPieza = numPieza;}
    public void establecerdescripPieza (String descripPieza){this.descripPieza = descripPieza;}
    public void establecercantArticulo (int cantArticulo){
        if (cantArticulo<0){
            cantArticulo = 0;}
        this.cantArticulo = cantArticulo;

    }
    public void establecerprecioArticulo (double precioArticulo){
        if (precioArticulo>0){
            precioArticulo = 0.0;
        }
        this.precioArticulo = precioArticulo;
    }

    //metodo obtener
    public String obtenernumPieza (){return numPieza; }
    public String obtenerdescripPieza (){return descripPieza; }
    public int obtenercantArticulo (){return cantArticulo; }
    public double obtenerprecioArticulo(){return precioArticulo; }

    public double obtenerMontoFactura(){
        return cantArticulo*precioArticulo;
    }

    @Override
    public String toString(){
        String mensaje = "";
        mensaje += "Numero de Pieza: "+numPieza+"\nDescrip.Pieza: "+descripPieza+"\nPrecio: "+precioArticulo+"\nCantidad: "+cantArticulo;
        return mensaje;
    }

}
