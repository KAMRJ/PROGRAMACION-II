// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Carro {
    //attributes

    private double velocidad;



    public int potencia;

    public double obtenerVelocidad(){
        return velocidad;
    }

    public void acelerar(){
        velocidad+=potencia;
    }
    public void frenar(){
        velocidad*=0.5;
    }

}