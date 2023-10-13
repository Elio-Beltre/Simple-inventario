import java.util.Scanner;

public class SimpleInventario {
    public static void agregarArticulo(String a){

        if (a.length() > 4){
            System.out.println("Articulo agregado exitosamente ");
        }else {
            System.out.println("No se permite este articulo");
        }

    }
    public static void removerArticulo(int id){
        if (id > 0){
            System.out.println("Removido");

        }

    }
    public static String obtenerPrecioArticulo(String articulo,double precio){
        double formula =  (Math.random() * 5000) + 100;
        if (articulo.startsWith("mar")&&precio>=0.00){
            return "Articulo "+articulo + "Tiene un valor de RD$ " + formula;
        } else if (articulo.startsWith("tab")||precio>=12000.00){
            return "Articulo "+ articulo+" tiene un valor que sobrepasa los 12,000.00"+"el monto es de RD$ " + formula;
        }else {
            return "ninguno de los escenarios pudo aplicar";
        }

    }
    public static void imprimirInventario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String usuario = scanner.nextLine();
        System.out.println("Bienvenid@ "+ usuario);
        String articuloExistente = obtenerNombreArticulo();
        System.out.println("Articulo existente: "+articuloExistente);

    }
    public  static String obtenerNombreArticulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo: ");
        String nombre = scanner.nextLine();
        if (nombre.length()> 3){
            return nombre;

        }else{
            return "Error en la operacion ";
        }


    }
    public static void main(String[] args) {
        obtenerNombreArticulo();
    }
}
