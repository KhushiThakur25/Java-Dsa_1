class Bike{
    void run(){
        System.out.println("Running...");
    }
}
class Splender extends Bike{
    void run(){
        System.out.println("Running safely with 60k..");
    }
}

public class PolyMorphism {
    public static void main(String[] args) {
        Bike b = new Splender();
        b.run();
    }
}
