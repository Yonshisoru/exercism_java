class RotationalCipher {
    private int shiftKeys = 0;
    RotationalCipher(int shiftKey) {
        shiftKeys = shiftKey;
    }

    String rotate(String data) {
        int currentChar = 0;
        int rotatingChar = 0;
        String result = "";
        if (data.length() != 0) {
            for (int i = 0; i < data.length(); i++) {
                //System.out.println((int)data.charAt(i));
                if (data.charAt(i) >= 65 && data.charAt(i) <= 90) {
                    if (((data.charAt(i) + shiftKeys) > 90)) {
                        rotatingChar = (data.charAt(i) + shiftKeys) - 90;
                        currentChar = 65 + rotatingChar - 1;
                        result += (char) currentChar;
                    } else {
                        rotatingChar = shiftKeys;
                        currentChar = data.charAt(i) + rotatingChar;
                        result += (char) currentChar;
                    }
                } else if (data.charAt(i) >= 97 && data.charAt(i) <= 122) {
                    if (((data.charAt(i) + shiftKeys) > 122)) {
                        rotatingChar = (data.charAt(i) + shiftKeys) - 122;
                        currentChar = 97 + rotatingChar - 1;
                        result += (char) currentChar;
                    } else {
                        rotatingChar = shiftKeys;
                        currentChar = data.charAt(i) + rotatingChar;
                        result += (char) currentChar;
                    }
                } else {
                    currentChar = data.charAt(i);
                    result += (char) currentChar;
                }
                System.out.println(rotatingChar);
            }
        }
        return result;
    }
}
