package Models;

public enum Egenero {
    Rock("Rcok"), Trap("Trap"), Jazz("Jazz"),HipHop("Hip Hop"),Metal("Metal"),Clasica("Clasica");

    private String genero;

    Egenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
