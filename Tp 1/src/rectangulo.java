public class rectangulo {

    private int ancho;
    private int alto;

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public float area (int ancho ,int  alto ){
        return alto*ancho;
    }

    public float perimetro (int  ancho, int alto){
        return alto*2+ancho*2;
    }
}
