public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String output = "";
            switch(shirtNum){
                case 1:output = "goalie";break;
                case 2:output = "left back";break;
                case 3:case 4:output = "center back";break;
                case 5:output = "right back";break;
                case 6:case 7:case 8:output = "midfielder";break;
                case 9:output = "left wing";break;
                case 10:output = "striker";break;
                case 11:output = "right wing";break;
                default:throw new IllegalArgumentException();
            }
        return output;
    }
}
