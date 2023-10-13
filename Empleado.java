package ejercicioempleado;

public class Empleado {

    //atributos de instancia
    private String nombre;
    private String apellido;
    private double salario;

    //constructor por parametros
    public Empleado(String nombre, String apellido, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario =  salario;
    }

    //metodos set/establecer
    public void establecerNombre(String nombre){
        this.nombre  = nombre;
    }
    public void establecerApellido(String apellido){
        this.apellido  = apellido;
    }
    public void establecerSalario(double salario){
        if(salario > 0)
            this.salario  = salario;
    }

    //metodos get/obetener/dar
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public double obtenerSalario(){
        return salario;
    }
}
