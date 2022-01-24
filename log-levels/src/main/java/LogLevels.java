public class LogLevels {
    
    public static String message(String logLine) {
        logLine=logLine.substring(logLine.indexOf(":")+1,logLine.length()).trim();
        return logLine;
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[")+1, (logLine.indexOf("]"))).toLowerCase();
    }

    public static String reformat(String logLine) {
        String firsttext = logLine.substring(logLine.indexOf(":")+1,logLine.length()).trim();
        String operation = logLine.substring(logLine.indexOf("[")+1, (logLine.indexOf("]"))).toLowerCase();
        String result = firsttext+" ("+operation+")";
        return result;
    }
}
