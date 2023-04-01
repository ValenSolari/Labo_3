package models;

public class Estudiante extends Persona {
    private Persona x;
    private Integer cuota;
    private Integer anoDeIngreso;
    private String carrera;

    ///region constructor
    public Estudiante(String dni, String nombre, String apellido,
                      String email, String dirreccion, Persona x, Integer cuota
                        , Integer anoDeIngreso, String carrera) {
        super(dni, nombre, apellido, email, dirreccion);
        this.x = x;
        this.cuota = cuota;
        this.anoDeIngreso = anoDeIngreso;
        this.carrera = carrera;
    }

    public Estudiante() {    }
    ///endregion


    ///region GEt and Set
    public Persona getX() {
        return x;
    }

    public void setX(Persona x) {
        this.x = x;
    }

    public Integer getCuota() {
        return cuota;
    }

    public void setCuota(Integer cuota) {
        this.cuota = cuota;
    }

    public Integer getAnoDeIngreso() {
        return anoDeIngreso;
    }

    public void setAnoDeIngreso(Integer anoDeIngreso) {
        this.anoDeIngreso = anoDeIngreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    ///endregion

    ///Region Metodos
    @Override
    public String toString() {
        return "Estudiante{" +
                "x=" + x +
                ", cuota=" + cuota +
                ", anoDeIngreso=" + anoDeIngreso +
                ", carrera='" + carrera + '\'' +
                "} " + super.toString();
    }
}
