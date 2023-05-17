package Package;

public class Videojuego implements IAcciones {
    ///Sus atributos son titulo, horas estimadas, entregado, genero y compañia
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    ///region Constructor

    public Videojuego() {
        this.compañia="Por defecto";
        this.entregado=false;
        this.titulo="Por defecto";
        this.horasEstimadas=10;
        this.genero = "Por defecto";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compañia = compañia;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = "Por defecto";
        this.compañia="Por defecto";
        this.entregado=false;
    }

    ///endregion

    ///region Get and Set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    ///endregion

    ///region Metodos
    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
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
        Videojuego a = (Videojuego) c;
        if (this.horasEstimadas<a.getHorasEstimadas()|| a == null){
            i=1;
        }
        else if (this.horasEstimadas == a.getHorasEstimadas()){
            i=0;
        }
        else {
            i=-1;
        }
        return i;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Videojuego)) return false;
        Videojuego tp = (Videojuego) obj;
        return tp.getTitulo() == this.titulo;
    }

    ///
}
