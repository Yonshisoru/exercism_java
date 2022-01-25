class NeedForSpeed {
    private int batteries;
    private int speed;
    private int batteryDrain;
    private int distance;
    NeedForSpeed(){}
    NeedForSpeed(int speed,int batteryDrain){
        this.batteries=100;
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distance=0;
    }

    public boolean batteryDrained() {
        boolean isDrained = true;
        if(batteries-batteryDrain>=0){
            isDrained = false;
        }
        return isDrained;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(!batteryDrained()) {
            this.distance += speed;
            this.batteries -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        boolean isFinished = true;
        while(car.distanceDriven()<distance){
            if(car.batteryDrained()) {
                isFinished = false;
                break;
            }
            car.drive();
        }
        return isFinished;
    }
}
