import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> reversedList(List<Signal> list){
        List<Signal> reversed = new ArrayList<>();
        for (int j = list.size() - 1; j >= 0; j--) {
            //System.out.println(list.get(j));
            reversed.add(list.get(j));
        }
        return reversed;
    }
    List<Signal> calculateHandshake(int number) {
        boolean switchCase = false;
        List<Signal> list = new ArrayList<>();
        String binary = Integer.toBinaryString(number);
        int count = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            //System.out.println((binary.length()-i)%5);
            if(((binary.length()-i)%5)==0) {
                switchCase = !switchCase;
            }
            //System.out.println(count+" "+binary.charAt(i));
            if (binary.charAt(i) == '0') {
                count++;
            }else{
                if((count==4&&switchCase)) {
                    if (!list.isEmpty()) {
                        list = reversedList(list);
                    }
                    count=-1;
                }else {
                    if (!switchCase) {
                        if (count == 0 && !list.contains(Signal.WINK)) {
                            list.add(Signal.WINK);
                            count++;
                        } else if (count == 1 && !list.contains(Signal.DOUBLE_BLINK)) {
                            list.add(Signal.DOUBLE_BLINK);
                            count++;
                        } else if (count == 2 && !list.contains(Signal.CLOSE_YOUR_EYES)) {
                            list.add(Signal.CLOSE_YOUR_EYES);
                            count++;
                        } else if (count == 3 && !list.contains(Signal.JUMP)) {
                            list.add(Signal.JUMP);
                            count++;
                        } else if (count >= 4) {
                            if (!list.isEmpty()) {
                                list = reversedList(list);
                            }
                            count = 0;
                        }
                    } else {
                        //System.out.println("^^^");
                        if (count == 0) {
                            if (!list.isEmpty()) {
                                list = reversedList(list);
                            }
                        } else if (count == 4 && !list.contains(Signal.WINK)) {
                            list.add(Signal.WINK);
                            count = 0;
                        } else if (count == 3 && !list.contains(Signal.DOUBLE_BLINK)) {
                            list.add(Signal.DOUBLE_BLINK);
                            count++;
                        } else if (count == 2 && !list.contains(Signal.CLOSE_YOUR_EYES)) {
                            list.add(Signal.CLOSE_YOUR_EYES);
                            count++;
                        } else if (count == 1 && !list.contains(Signal.JUMP)) {
                            list.add(Signal.JUMP);
                            count++;
                        }
                    }
                }
            }
        }
        return list;
    }
}
