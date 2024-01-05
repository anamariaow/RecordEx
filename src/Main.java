public class Main {
    public static void main(String[] args) {
        //Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y
        Record punto = new Record(1,2);

        System.out.println("Coordinate punto: " + punto);
        System.out.println("Coordinata x del punto: " + punto.x());
        System.out.println("Coordinata y del punto: " + punto.y());
    }
}