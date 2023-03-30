package modulos;

public class circulo {
    private Double radio;
    private String color;

    public circulo() {
        this.radio=1.0;
    }

    public circulo(Double x) {
        this.radio=x;
    }

    public Double getRadio() {
        return radio;
    }
    public void setRadio(Double radio) {
        this.radio = radio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


}
