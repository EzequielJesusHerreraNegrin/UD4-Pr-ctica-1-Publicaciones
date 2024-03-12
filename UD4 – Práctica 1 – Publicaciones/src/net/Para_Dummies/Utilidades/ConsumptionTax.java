package net.Para_Dummies.Utilidades;

public class ConsumptionTax {

    public static float calIGICTax(int price){

        return price * 1.07f;
        // el pvp deve contener el incremento del impuesto, el precio base es
        // distributionprice
    }

    public static float calIVATax(int price){

        return price * 1.21f;
    }
}
