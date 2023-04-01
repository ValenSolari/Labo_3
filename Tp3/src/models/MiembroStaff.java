package models;

public class MiembroStaff extends Persona {
    private Integer salario;

    private Integer turno;

    //region Constructores
    public MiembroStaff() {    }

    public MiembroStaff(String dni, String nombre, String apellido,
                        String email, String dirreccion, Integer salario
                        , Integer turno) {
        super(dni, nombre, apellido, email, dirreccion);
        this.salario = salario;
        this.turno = turno;
    }
    //endregion

    ///region Get and Set
    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Integer getTurno() {
        return turno;
    }

    public void setTurno(Integer turno) {
        this.turno = turno;
    }
    ///endregion


    ///region Metodos
    @Override
    public String toString() {
        return "MiembroStaff{" +
                "salario=" + salario +
                ", turno=" + turno +
                "} " + super.toString();
    }
}
