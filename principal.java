public class principal {
    public static void main(String[] args) {
        coche miCoche = new coche(5);
        System.out.println("Las puertas actuales son: "+miCoche.toString());
        miCoche.anadirpuerta();
        System.out.println("Las puertas despues de suma una puerta son: "+miCoche.toString());
    }
}
