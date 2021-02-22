package Coche;/*
Created by: alumne-DAM
El 22/02/2021
*/

public class CotxeSegonaPart_diego_granda2 extends Cotxe_Diego_Granda{

//PROPIEDADES
private MarxesAutomatic marxaAut;
private MarxesManual marxaMa;
private EstatsMotorCotxe estatMotor;


//CONSTRUCTORES

    public CotxeSegonaPart_diego_granda2(String marca ,String model ,TipusCanvi tipuscanvi) {
        super( marca ,model ,tipuscanvi );
        this.estatMotor=EstatsMotorCotxe.Aturat;
        this.marxaAut=MarxesAutomatic.N;
        this.marxaMa=MarxesManual.N;
    }


    //METODOS

    public void canviarMarxaAutomatic(MarxesAutomatic marxa) throws Exception{
        if(this.estatMotor.equals(EstatsMotorCotxe.Aturat ))throw new Exception("El cotxe està aturat. No pots canviar de marxa");
        else if ()
    }

    public void canviarMarxaManual(MarxesManual marxa) throws Exception {

    }

}
