public class CarsAssemble {
    private int rate = 221;
    public double productionRatePerHour(int speed) {
        double ratefailure = 0;
        double result = 0;
        if(speed>=1&&speed<=4){
            result = speed*rate;
        }else if(speed>=5&&speed<=8){
            ratefailure=1-0.9;
            result = ((speed*rate)-(speed*rate)*ratefailure);
        }else if(speed==9){
            ratefailure=1-0.8;
            result = ((speed*rate)-(speed*rate)*ratefailure);
        }else if(speed==10){
            ratefailure=1-0.77;
            result = ((speed*rate)-(speed*rate)*ratefailure);
        }
        return result;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed)/60);
    }
}
