public class Main
public class Main {
    public static void main (String []args) {
        Auto auto1 = new Auto ();  // creando un objeto
        //auto1.marca = "bmw"; // solamente sirve cuando es publico
        auto1.setMarca("Audi");
        System.out.printIn(auto1.getMarca());
    }
}

