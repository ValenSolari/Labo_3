package Models;

public enum Egeneros {
    Accion("Accion"),Aventura("Aventura"),Comedia("Comedia"),Drama("Drama"),Horror("Horror"),Documental("Documental");



    private String generos;
    private Egeneros (String x) {
        this.generos = x;
    }

    public String getGeneros() {
        return generos;
    }
}
