package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import util.ServiceConsume;

import static util.Resources.LIST_USER;

public class GetListUsers implements Task {

    //envia el recurso
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ServiceConsume.basicGet(LIST_USER.getResource()));
    }


}
