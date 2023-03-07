public class coche {
    protected int numPuertas;
    
    public coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public coche(){}
    
    public void anadirpuerta(){
        int num=numPuertas;
         numPuertas= num+1;
}

    

    @Override
    public String toString() {
        return "coche{" + "numPuertas=" + numPuertas + '}';
    }
    
    
}
