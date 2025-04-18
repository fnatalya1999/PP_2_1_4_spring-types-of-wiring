package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    @Autowired
    private final Rabbit4 rabbit;

    @Autowired
    public Wood3(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    public String getMessage() {
        return "на том острове дуб стоит, " + rabbit.getMessage();
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
