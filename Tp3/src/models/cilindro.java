package models;

public class cilindro extends circulo {

    private Double altura;

    ///region constructores
    public cilindro() {
        this.altura = 1.0;
    }

    public cilindro(Double altura) {
        this.altura=altura;
    }
    ///endregion

    ///region get and set
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "cilindro{" +
                "altura=" + altura +
                "} " + super.toString();
    }


    ///endregion


    public double volumen (){
        return super.area()*getAltura();
    }
    @Override
    public double area(){
        return  2*Math.PI*getRadio()*getAltura()+2*Math.PI*Math.pow(2,getRadio());

    }



}
