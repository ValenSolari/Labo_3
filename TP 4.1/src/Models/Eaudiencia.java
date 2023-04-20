package Models;

public enum Eaudiencia {
    G("G"),PG("PG"),Pg13("PG-13"),R("R"),NC17("NC-17"),UNRATED("UNRATED");

    private String audiencia;

    private Eaudiencia (String x){this.audiencia=x;}

    public String getAudiencia() {
        return audiencia;
    }
}
