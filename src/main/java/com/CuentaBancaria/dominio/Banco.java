package com.CuentaBancaria.dominio;

public class Banco {

    public long numero;
    public String tipo;
    public long saldo;
    public long tope;
    public short clave;
    public String Persona;
    public boolean activa;





    public void  cerrar(){

    }
    public boolean retirar(long monto){
        if(activa== true &&  saldo >=montoRetirar){
            this.montoRetirar;

        }else{
            System.out.println("LA CUENTA NO SE PUDO RETIRAR, LA CUENTA ESTA INACTIVA O EL SALDO ES INSUFICIENTE");
            return false

        }

    }
    public boolean consignar(long monto){

        if(activa == true){
            this.saldo += montoConsignar;
            return true;
        }
        return false;


    }
    public boolean transferir(long monto, CuentaBancaria, CuentaDestino){
        // 1. sacar de la cuenta origen
        boolean retiroBien = this.retirar(montoTransferir)
        //2. adicionar a la cuenta destino
        if(retiroBien == false){
            cuentaDestino,consignar(montoTransferir);
            return consignoBien;

        }
        return false;

    }
    public boolean verSaldoActual()
}
