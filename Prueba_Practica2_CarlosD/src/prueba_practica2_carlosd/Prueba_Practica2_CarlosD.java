
package prueba_practica2_carlosd;
import java.util.Scanner;
import java.util.Random;
public class Prueba_Practica2_CarlosD {
    
    static Scanner brazil = new Scanner (System.in);
    static Random rd = new Random ();
    static Libro todos [] = new Libro [10];
    
    public static void main(String[] args) {
        boolean out = true;
        
        do {
            System.out.println("***********MENU*********");
            System.out.println("1. Agregar nuevo libro a la bliblioteca");
            System.out.println("2. Solicitar libro ");
            System.out.println("3. Regresar libro ");
            System.out.println("4. Buscar libro por nombre");
            System.out.println("5. Listar libros disponibles");
            System.out.println("6. Listar libros prestados");
            System.out.println("7. Salir");
            int opcion = brazil.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese en que posicion desea crear el nuevo libro");
                    int creado = brazil.nextInt();
                    brazil.nextLine();
                    System.out.println("Ingrese el nombre del libro ");
                    String nom = brazil.nextLine();
                    crearlibro(creado,nom);
                }
                case 2 -> {
                    brazil.nextLine();
                    System.out.println("Esta solicitando un libro porfavor de su nombre :");
                    String solicitante = brazil.nextLine();
                    System.out.println("De la posicion del libro que esta pidiendo :");
                    int pos = brazil.nextInt();
                    todos[pos].prestar(todos,pos,solicitante);
                }
                case 3 -> {
                    System.out.println("Ingrese la posicion del libro que desea regresar :");
                    int pos = brazil.nextInt();
                    todos[pos].regresar(todos, pos);
                }
                case 4 -> {
                    brazil.nextLine();
                    System.out.println("Ingrese el nombre del libro que busca :");
                    String buscado = brazil.nextLine();
                    buscarN(todos,buscado);
                }
                case 5 -> {
                    
                }
                case 6 -> {
                    
                }
                case 7 -> {
                    System.out.println("Saliendo...");
                    out = false;
                }
                default -> System.out.println("Opcion no valida");
            }
        } while (out);
    }
    public static void crearlibro (int pos, String nom){
        int idc = id();
        todos[pos] = new Libro (nom,"Usuario",idc,"Disponible","Sin dueño");
        System.out.println("Se a creado correctamente el nuevo libro");
    }
    public static int id (){
        int temp = rd.nextInt(1000);
        return temp;
    }
    
    public static void buscarN (Libro temp[], String busc){
        boolean verf = false;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i].getNombre().contains(busc)){
                System.out.println("Se encontre el nombre del libro en la posicion : " + i);
                break;
            }else{     
                verf = true;
            }
        }
        if(verf = true){
            System.out.println("no se encontro un libro con ese nombre");
        }
    }
    
    public static void listardisponibles (Libro temp []){
        
    }
    
    public static void listarprestados (Libro temp []){
        
    }
}
