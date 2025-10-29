package co.com.certificacion.mobile.interactions;

import co.com.certificacion.mobile.tasks.Help;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.certificacion.mobile.userinterfaces.LoginElements.*;

public class LogOutApplication implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BACK_BUTTON)
        );
        actor.attemptsTo(
                Click.on(BACK_BUTTON)
        );
        actor.attemptsTo(
                Click.on(LOGOUT_BUTTON)
        );
        actor.attemptsTo(
                Click.on(LOGOUT_CONFIRM)
        );
    }

    public static LogOutApplication logOutApplication() {
        return Tasks.instrumented(LogOutApplication.class);
    }

}
