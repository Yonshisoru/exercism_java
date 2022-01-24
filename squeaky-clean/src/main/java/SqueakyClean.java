import java.util.Locale;

class SqueakyClean {
    static String clean(String identifier) {
        String cleaned = "";
        if(identifier!=null) {
            String cleaning = "";
            boolean kebabdetected = false;
            for(int i=0;i<identifier.length();i++) {
                    if (identifier.charAt(i) == ' ') {
                        cleaning = cleaning + "_";
                    } else if (identifier.charAt(i) >= 0 && identifier.charAt(i) <= 31) {
                        cleaning = cleaning + "CTRL";
                    } else if (identifier.charAt(i) == '-') {
                        kebabdetected = true;
                    } else if(!Character.isLetter(identifier.charAt(i))){
                        continue;
                    } else {
                        if (identifier.charAt(i) >= 913 && identifier.charAt(i) <= 937) {
                            cleaning = cleaning + (identifier.charAt(i)) + "";
                        } else if ((identifier.charAt(i) >= 945) && (identifier.charAt(i) <= 969)) {

                        } else {
                            //System.out.print(identifier.charAt(i));
                            cleaning += identifier.charAt(i) + "";
                        }
                    }
                    //System.out.println(">>" + cleaning);
            }
            cleaned = cleaning;
            if(kebabdetected){
                cleaning.replaceAll("-","");
                cleaned = (cleaning.charAt(0)+"")+Character.toUpperCase(cleaning.charAt(1))+cleaning.substring(2,cleaning.length());
            }
        }
        return cleaned;
    }
}
