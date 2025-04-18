package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    private final Egg6 egg;

    @Autowired
    public Duck5(Egg6 egg) {
        this.egg = egg;
    }

    public String getMessage() {
        return "в яйце - утка, " + egg.getMessage();
    }
    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
