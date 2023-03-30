public class Hora {
    private int hora;
    private  int minuto;
    private int segundo;


    ///Constructor

    public Hora() {
        this.hora = 0;
        this.minuto=0;
        this.segundo=0;
    }


    ///Getters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }


    ///Setters
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    ///Metodos


}
