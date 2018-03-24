/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahate
 */
public class ExternalTrip extends Trip {

    @Override
    public String CalculatePrice() {
        Double result, rateperkm;
        rateperkm = 0.8;
        result = (Double.parseDouble(this.getDistance()) * rateperkm);
        Math.floor(result);
        String finalresult = result.toString();
        return finalresult;
    }

}
