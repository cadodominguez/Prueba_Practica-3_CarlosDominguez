
package prueba_practica2_carlosd;

public class Libro {
    
    String nombre;
    String autor;
    int ID;
    String estado;
    String dueno;

    public Libro(String nombre, String autor, int ID, String estado, String dueno) {
        this.nombre = nombre;
        this.autor = autor;
        this.ID = ID;
        this.estado = estado;
        this.dueno = dueno;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
    
    public void prestar (Libro temp [], int pos, String soli){
       if(temp[pos].getEstado().equals("Disponible")){
           System.out.println("El libro esta disponible si se puede aceptar su solicitud");
           this.estado = "Prestado";
           this.dueno = soli;
       }else{
           System.out.println("El libro no existe o a sido prestado, no se puede aceptar su solicitud");
       }
    }
    
    public void regresar(Libro temp [], int pos){
        if(temp[pos].getEstado().equals("Prestado")){
           System.out.println("El libro si a sido prestado ya se devuelto");
           this.estado = "Disponible";
           this.dueno = "Sin dueño";
       }else{
           System.out.println("El libro no existe o a ya a sido devuelto, no se puede aceptar su solicitud");
       }
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", ID=" + ID + ", estado=" + estado + ", dueno=" + dueno + '}';
    }
    
    
}
