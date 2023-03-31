package models;

public class circulo {

    ///region atributos
    private Double radio;
    private String color;
    ///endregion

    ///region constructores
    public circulo() {
        this.radio = 1.0;
        this.color = "Rojo";
    }

    public circulo(Double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    ///endregion

    ///region getters and setters

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

    public String toString() {
        return "circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }


    //endregion


    public double area (){
        return (Math.PI*(Math.pow(getRadio(),2)));
    }







}
