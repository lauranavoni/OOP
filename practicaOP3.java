public class Padre {

    public String nombre;
    public int edad;

    public void mostrar() {
        System.out.println("Hola " + nombre);
    }
}

////
public class Hijo extends Padre{
    public String deporte;
    public void informarDeporte(){
        System.out.println("Al hijo le encanta jugar" + deporte);
    }
    public void saludar(){
        System.out.println("Holaaaaaaaa");
    }
    public void saludar(String apodo){
        System.out.println("Holaaaaa " + apodo);
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Chaoooo");
    }
}

/////
public class Nieto extends Hijo{
    public String videojuego;
    public void jugar(){
        System.out.println("Nieto juega el juego online " + videojuego);
    }
}

/////
 public static void main(String[] args) {
        //System.out.println("Hola");
        Hijo objH = new Hijo();
        objH.nombre = "Agustin";
        objH.edad = 10;
        objH.deporte = "Fútbol";
        objH.mostrar();
        objH.informarDeporte();
        objH.saludar();
        objH.saludar("blumblum");
        Padre objP = new Padre();
        objP.nombre = "Sergio";
        objP.edad = 50;
        objP.mostrar();
        Nieto objN = new Nieto();
        objN.nombre = "Sofia";
        objN.edad = 2;
        objN.mostrar();
        objN.videojuego = "Minecraft";
        objN.jugar();
    }
    