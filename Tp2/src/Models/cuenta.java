package Models;

import java.util.UUID;

public class cuenta {
    private clientes x;
    private String idCuenta;
    private Integer balance;


    public cuenta() {
        this.idCuenta = (UUID.randomUUID().toString().toUpperCase());
    }

    public cuenta(clientes x, Integer balance) {
        this.idCuenta = (UUID.randomUUID().toString().toUpperCase());
        this.x=x;
        this.balance=balance;
    }


    public clientes getX() {
        return x;
    }
    public void setX(clientes x) {
        this.x = x;
    }


    public String getIdCuenta() {
        return idCuenta;
    }


    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance) {
        this.balance = balance;
    }


    public void depositar (Integer dato){
        setBalance(balance+dato);
    }

    public void extrae (Integer dato){
        if (balance-dato < 0)
        {
            System.out.println("La cuenta no posee suficiente saldo");
        }
        else
        {
            setBalance(balance-dato);
        }
    }

    @Override
    public String toString() {
        return "cuenta:\n" +
                x.getNombre() +"\n"+
                " idCuenta='" + idCuenta + '\n' +
                " balance=" + balance;
    }
}
