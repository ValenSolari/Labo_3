package Package;

import java.util.UUID;

public class Password {
    private int longitud;
    private String contraseña;

    ///region Constructores

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generadorPassword(longitud);
    }
    public Password() {
        this.longitud=8;
        this.contraseña=generadorPassword(8);
    }

    ///endregion

    ///region Get and Set

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }


    ///endregion

    ///region Metodos

    @Override
    public String toString() {
        return "Password{" +
                "longitud=" + longitud +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }

    public static String generadorPassword (int longitud){
        String aux="";
        aux= UUID.randomUUID().toString().substring(0,longitud);


        return aux;
    }



    ///endregion
}
