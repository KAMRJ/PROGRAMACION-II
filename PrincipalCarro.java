public class PrincipalCarro {
    public static void main(String [] args){
        Carro c1;
        c1 = new Carro();
        Carro c2 = new Carro();

        System.out.println("La velocidad del carro c1: " + c1.obtenerVelocidad());
        System.out.println(("La potencia del carro c1 es: " + c1.potencia));

        c1.potencia = 2;
        c1.acelerar();
        c1.acelerar();
        System.out.println("La velocidad del carro c1: " + c1.obtenerVelocidad());
        System.out.println("La potencia del carro c1 es: " + c1.potencia);
        c1.frenar();
        System.out.println("La velocidad del carro c1 es: " +c1.obtenerVelocidad());


    }

}
