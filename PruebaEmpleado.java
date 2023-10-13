package ejercicioempleado;

import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado e1,e2;
        Scanner sc = new Scanner(System.in);
        String nombre, apellido;
        double salario;

        System.out.println("***** Empleado 1 *****");
        System.out.print("Ingrese el nombre: ");
        nombre = sc.next();
        System.out.print("Ingrese el apellido: ");
        apellido = sc.next();
        System.out.print("Ingrese el salario: ");
        salario = sc.nextDouble();
        e1 = new Empleado(nombre, apellido, salario);

        System.out.println("\n***** Empleado 2 *****");
        System.out.print("Ingrese el nombre: ");
        nombre = sc.next();
        System.out.print("Ingrese el apellido: ");
        apellido = sc.next();
        System.out.print("Ingrese el salario: ");
        salario = sc.nextDouble();
        e2 = new Empleado(nombre, apellido, salario);

        System.out.println("El salario anual de "+e1.obtenerNombre()+" "+e1.obtenerApellido()+"es igual a "+e1.obtenerSalario()*12);
        System.out.println("El salario anual de "+e2.obtenerNombre()+" "+e2.obtenerApellido()+"es igual a "+e2.obtenerSalario()*12);
        System.out.println();

        e1.establecerSalario(e1.obtenerSalario()*1.1);
        e2.establecerSalario(e2.obtenerSalario()*1.1);

        System.out.println("El nuevo salario del empleado 1 es: "+e1.obtenerSalario());
        System.out.println("El nuevo salario del empleado 2 es: "+e2.obtenerSalario());

        System.out.println();
        System.out.println("El salario anual de "+e1.obtenerNombre()+" "+e1.obtenerApellido()+"es igual a "+e1.obtenerSalario()*12);
        System.out.println("El salario anual de "+e2.obtenerNombre()+" "+e2.obtenerApellido()+"es igual a "+e2.obtenerSalario()*12);
    }
}
