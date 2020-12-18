package Coche;/*
Coche
Created by: Diego Granda
Date: 11/12/2020
*/

public class CotxeSegonaPart_diego_granda extends Cotxe_Diego_Granda {
    public CotxeSegonaPart_diego_granda(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }
    //Marchas inicializan en neutro
    private marchasAuto marchaAuto= marchasAuto.N;
    private marchasManual marchaManual= marchasManual.N;
    //Enums con las marchas
    public enum marchasManual{
        R,N,m1,m2,m3,m4,m5,m6

    }
    public enum marchasAuto{
        R,N,F
    }
    //metodos a implementar
    public void CanviarMarxaManual(char a) throws Exception{
    if (tipuscanvi.equals(TipusCanvi.CanviManual) && a=='+'){
        switch (marchaManual){
            case R:marchaManual=marchasManual.N;break;
            case N:marchaManual=marchasManual.m1;break;
            case m1:marchaManual=marchasManual.m2;break;
            case m2:marchaManual=marchasManual.m3;break;
            case m3:marchaManual=marchasManual.m4;break;
            case m4:marchaManual=marchasManual.m5;break;
            case m5:marchaManual=marchasManual.m6;break;
            default:
                throw new Exception("No se Puede hacer esto");
        }
    }
    else if (tipuscanvi.equals(TipusCanvi.CanviManual) && a=='-'){
        switch(marchaManual){
            case m6:marchaManual=marchasManual.m5;
            case m5:marchaManual=marchasManual.m4;
            case m4:marchaManual=marchasManual.m3;
            case m3:marchaManual=marchasManual.m2;
            case m2:marchaManual=marchasManual.m1;
            case m1:marchaManual=marchasManual.N;
            case N:marchaManual=marchasManual.R;
            default:
                throw new Exception ("No se Puede hacer esto");
        }
    }else{
        throw new Exception("el coche no es manual o no existe esta marcha");
    }

    }
    public void CanviarMarchaAuto(char a) throws Exception {
        if (tipuscanvi.equals(TipusCanvi.CanviAutomatic) && a == '+') {
            switch (marchaAuto) {
                case R:marchaAuto = marchasAuto.N;
                    break;
                case N:marchaAuto = marchasAuto.F;
                    break;
                case F:marchaAuto = marchasAuto.R;
                    break;
                default:
                    throw new Exception("No se puede hacer esto");
            }

        } else if (tipuscanvi.equals(TipusCanvi.CanviAutomatic) && a == '-') {
            switch (marchaAuto) {
                case R:marchaAuto = marchasAuto.F;
                case F:marchaAuto = marchasAuto.N;
                case N:marchaAuto = marchasAuto.R;
                default:
                    throw new Exception("no se puede hacer esto");
            }

        }


    }
}