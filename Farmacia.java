import java.util.ArrayList;
class Farmacia {
    static ArrayList<String> listNomb;
    static ArrayList<Farmacia> listFmc;
    String nombre;
    String direccion;
    String telefono;
    ArrayList<Cita> citas;
    
    public static void gestionFarmacias(){
        if (listNomb == null)
            listNomb = new ArrayList<String>();
        String nombreFmc = Lectura.nextString("Nombre De La Farmacia: ");
        // la variable "asignacion" se le otorga todo ese dato 
        String asignacion = nombreFmc.toLowerCase().replaceAll(" ", "");
        if (listNomb.contains(asignacion)) {
            System.out.println("Farmacia ya existe!!");
            crud(nombreFmc);
        }else{
            System.out.println("Farmacia nueva!!");
            listNomb.add(asignacion);
            
        }
        //pedir datos de direccion de la farmacia :D
        System.out.println("Ahora la direccion de la farmacia: ");
        String direccionFmc = Lectura.nextString("Direccion de la farmacia: ");
    }
    
    public static void crud(String drogueria) {
        int sel = Lectura.nextInt("\n1. Consultar 2. Modificar  3. Borrar\n"
                    + " ==> ");
        switch(sel) {
            case 1: break;
            case 2: break;
            case 3: break;
        }
    }
}