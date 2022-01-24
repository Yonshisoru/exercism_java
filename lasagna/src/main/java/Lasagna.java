public class Lasagna {
    private int expectedtime = 40;
    // TODO: define the 'expectedMinutesInOven()' method
        public int expectedMinutesInOven(){
            return expectedtime;
        }
    // TODO: define the 'remainingMinutesInOven()' method
        public int remainingMinutesInOven(int minute){
            return (expectedtime-minute);
        }
    // TODO: define the 'preparationTimeInMinutes()' method
        public int preparationTimeInMinutes(int layer){
            int timebylayer = 2;
            return (layer*timebylayer);
        }
    // TODO: define the 'totalTimeInMinutes()' method
        public int totalTimeInMinutes(int layer,int timeinoven){
            return(preparationTimeInMinutes(layer)+timeinoven);
        }
}
