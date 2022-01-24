import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        boolean isEmpty = false;
        if(languages.isEmpty())
            isEmpty =true;
        return isEmpty;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        if(languages.size()!=0)
            languages.remove(languages.indexOf(language));
    }

    public String firstLanguage() {
        String output = "";
        if(languages.size()!=0)
            output = languages.get(0);
        return output;
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        boolean output = false;
        if(languages.size()!=0)
            output = languages.contains(language);
        return output;
    }

    public boolean isExciting() {
        boolean output =false;
        if(languages.contains("Java")||languages.contains("Kotlin"))
            output = true;
        return output;
    }
}
