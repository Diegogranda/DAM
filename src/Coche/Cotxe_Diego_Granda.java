package Coche;/*
Coche
Created by: Diego Granda
Date: 09/12/2020
*/

public class Cotxe_Diego_Granda extends CotxeAbstracte implements InterfaceCotxe{
private  EstatsMotorCotxe Estado=EstatsMotorCotxe.Aturat;
private int revoluciones=0;
    public Cotxe_Diego_Granda(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    @Override
    public void arrancarMotor() throws Exception {
        if (Estado.equals(EstatsMotorCotxe.Aturat)) {
            Estado=EstatsMotorCotxe.EnMarxa;
        }else{
            throw new Exception("El coche ya está en marcha");
        }
    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        if (Estado.equals(EstatsMotorCotxe.EnMarxa)){
            System.out.println("El motor está en marcha");
        }
        else{
            System.out.println("El motor está apagado");
        }
        return Estado;
    }

    @Override
    public int getRevolucions() {
        if (Estado.equals(EstatsMotorCotxe.EnMarxa)){
            revoluciones= (int) (Math.random()*6500+1);
        }
        else {
            revoluciones=0;
        }
        return revoluciones;
    }

    @Override
    public void aturarMotor() throws Exception {
        if (Estado.equals(EstatsMotorCotxe.EnMarxa)) {
            Estado=EstatsMotorCotxe.Aturat;
        }else{
            throw new Exception("El coche ya está aturat");
        }
    }
}