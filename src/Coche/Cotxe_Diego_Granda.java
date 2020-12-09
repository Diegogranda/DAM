package Coche;/*
Coche
Created by: Diego Granda
Date: 09/12/2020
*/

public class Cotxe_Diego_Granda extends CotxeAbstracte implements InterfaceCotxe{

    public Cotxe_Diego_Granda(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    @Override
    public void arrancarMotor() throws Exception {
    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        return null;
    }

    @Override
    public int getRevolucions() {
        return 0;
    }

    @Override
    public void aturarMotor() throws Exception {

    }
}
