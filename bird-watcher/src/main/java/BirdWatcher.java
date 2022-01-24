
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdLastWeek = {0,2,5,3,7,8,4};
        return birdLastWeek;
    }

    public int getToday() {
        int output =0;
        if(!(birdsPerDay.length==0)){
            output= this.birdsPerDay[birdsPerDay.length - 1];
        }
        return output;
    }

    public void incrementTodaysCount() {
        ++this.birdsPerDay[birdsPerDay.length-1];
    }

    public boolean hasDayWithoutBirds() {
        boolean hasBird = false;
        for (int num:birdsPerDay)
            if(num==0)
                hasBird = true;
        return hasBird;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;int max = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if(i<numberOfDays) {
                count += birdsPerDay[i];
            }
            max += birdsPerDay[i];
        }
        if(!(numberOfDays<=birdsPerDay.length))
            count = max;

        return count;
    }

    public int getBusyDays() {
        int count=0;
        for(int num:birdsPerDay)
            if(num>=5)
                count++;
        return count;
    }
}
