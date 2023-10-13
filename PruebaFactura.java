package ejerciciofactura;

import ejercicioempleado.Empleado;

import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura f1;
        Scanner sc = new Scanner(System.in);
        String numPieza, descripPieza;
        int cantArticulo;
        double precioArticulo;

        System.out.println("*********Factura*********");
        System.out.print("Ingrese el numero de pieza: ");
        numPieza = sc.next();
        System.out.print("Ingrese la descripcion: ");
        descripPieza = sc.next();
        System.out.print("Ingrese la cantidad de pieza: ");
        cantArticulo = sc.nextInt();
        System.out.print("Ingrese el precio de pieza: ");
        precioArticulo = sc.nextDouble();
        f1 = new Factura(numPieza, descripPieza, cantArticulo, precioArticulo);

        System.out.println("Factura\n"+f1);
        System.out.println ("Total: "+f1.obtenerMontoFactura());

    }
}
