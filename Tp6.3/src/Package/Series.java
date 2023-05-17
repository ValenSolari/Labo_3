package Package;

public class Series implements IAcciones {
    private String titulo;
    private int temporadas;
    private boolean entregado;
    private String genero;
    private String Creador;


    ///region Constructor

    public Series() {
        this.titulo = "Por defecto";
        this.temporadas = 3;
        this.entregado = false;
        this.genero = "Por defecto";
        this.Creador= "Por defecto";
    }

    public Series( String Titulo,String creador) {
        this.Creador = creador;
        this.titulo = Titulo;
        this.temporadas = 3;
        this.entregado = false;
        this.genero = "Por defecto";
    }

    public Series(String titulo, int temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.entregado = false;
        this.genero = genero;
        Creador = creador;
    }

    ///endregion

    ///region Get and Set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return Creador;
    }

    public void setCreador(String creador) {
        Creador = creador;
    }

    ///endregion

    ///region Metodos
    @Override
    public String toString() {
        return "Series{" +
                "titulo='" + titulo + '\'' +
                ", temporadas=" + temporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", Creador='" + Creador + '\'' +
                '}';
    }

    @Override
    public void Entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean isEtregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object c) {
        int i;
        Series a = (Series) c;
        if (this.temporadas < a.getTemporadas() || a == null){
            i=1;
        }else if (this.temporadas == a.getTemporadas()){
            i=0;
        }else {
            i=-1;
        }
        return i;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return  true;
        if (!(obj instanceof Series)) return false;
        Series tp = (Series) obj;
        return tp.titulo==this.titulo;
    }

    ///endregion
}
