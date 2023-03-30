package modulos;

public class cilindro extends circulo {
    private Double altura;


    public cilindro() {
       this.altura=1.0;
    }

    public cilindro(Double altura) {
        this.altura=altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
