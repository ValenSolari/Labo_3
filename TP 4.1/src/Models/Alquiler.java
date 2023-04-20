package Models;

import java.time.LocalDate;

public class Alquiler {
    private String titulo;
    private Cliente x;
    private LocalDate egreso;
    private LocalDate reingreso;
    private boolean estado;///falso si no esta devuelto

    ///region Constructor


    public Alquiler(String titulo, Cliente x, LocalDate egreso, LocalDate reingreso) {
        this.titulo = titulo;
        this.x = x;
        this.egreso = egreso;
        this.reingreso = reingreso;
        this.estado = false;
    }

    public Alquiler() {
        this.estado=false;
    }
    ///endregion

    ///region Get and Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Cliente getX() {
        return x;
    }

    public void setX(Cliente x) {
        this.x = x;
    }

    public LocalDate getEgreso() {
        return egreso;
    }

    public void setEgreso(LocalDate egreso) {
        this.egreso = egreso;
    }

    public LocalDate getReingreso() {
        return reingreso;
    }

    public void setReingreso(LocalDate reingreso) {
        this.reingreso = reingreso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    ///endregion

    ///region Metodo

    @Override
    public String toString() {
        return "Alquiler{" +
                "titulo='" + titulo + '\'' +
                ", x=" + x +
                ", egreso=" + egreso +
                ", reingreso=" + reingreso +
                ", estado=" + estado +
                '}';
    }



    ///endregion


}
