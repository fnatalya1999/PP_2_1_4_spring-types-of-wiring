package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private final Needle7 needle;

    @Autowired
    public Egg6(Needle7 needle) {
        this.needle = needle;
    }

    public String getMessage() {
        return needle.getMessage();
    }
    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
