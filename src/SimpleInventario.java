import java.util.Scanner;

public class SimpleInventario {
    static String[] articulos = new String[5];
    public static void agregarArticulo(){
        for (int indice = 0; indice < articulos.length; indice++){
            articulos[indice] = obtenerNombreArticulo();
        }


    }
    public static void removerArticulo(int id){
        if (id > 0){
            System.out.println("Removido");

        }

    }
    public static double obtenerPrecioArticulo(){
        double precio =  (Math.random() * 5000) + 100;
        if (precio>0){
            return precio;
        }else{
            return  -1;
        }

        //return precio > 0 ? precio : -1;
    }
    public static void imprimirInventario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String usuario = scanner.nextLine();
        System.out.println("Bienvenid@ "+ usuario);
        String articuloExistente = obtenerNombreArticulo();
        System.out.println("Articulo registrados");
        for (String articulo : articulos){
            System.out.println(articulo);
        }

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
    public static void modificarArticulo(){
        String nombre = obtenerNombreArticulo();
        double precio = obtenerPrecioArticulo();
        if (nombre.startsWith("A")||nombre.startsWith("D")){
            obtenerPrecioArticulo();
            if (precio>150 && precio<=250){
                precio += (precio * 0.02); //precio = precio + (precio *0.02)
                System.out.println(nombre +" "+ precio);
            } else if (precio>250 && precio<=500){
                precio += (precio *0.08); // precio = precio +(precio *0.08)
                System.out.println(nombre + " " + precio);
            }else {
            precio += (precio*0.12); //precio = precio - (precio *0.12)
                System.out.println(nombre + " " + precio);
            }
        } else if (nombre.startsWith("C")||nombre.startsWith("M")){
            precio -= (precio*0.20); //precio = precio -(precio *0.20)
            System.out.println(nombre+ " " + precio);

        }

    }

    public static void main(String[] args) {
        agregarArticulo();
        imprimirInventario();
    }
}
