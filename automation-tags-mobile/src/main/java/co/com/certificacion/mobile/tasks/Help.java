package co.com.certificacion.mobile.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.mobile.userinterfaces.HelpElements.*;
import static co.com.certificacion.mobile.userinterfaces.LoginElements.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Help implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(MESSAGE_BUTTON, isVisible()).forNoMoreThan(90).seconds(),
                Click.on(MESSAGE_BUTTON)
        );

        actor.attemptsTo(
                WaitUntil.the(UNDERSTOOD_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(UNDERSTOOD_BUTTON)
        );

        actor.attemptsTo(
                WaitUntil.the(HELP_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HELP_BUTTON)
        );

        actor.attemptsTo(
                WaitUntil.the(CONTACT_US, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CONTACT_US)
        );

        actor.attemptsTo(
                WaitUntil.the(TALK_TO_US, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TALK_TO_US)
        );

        actor.attemptsTo(
                WaitUntil.the(BACK_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BACK_BUTTON)
        );
        actor.attemptsTo(
                WaitUntil.the(VISIT_US, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(VISIT_US)
        );
        actor.attemptsTo(
                WaitUntil.the(BACK_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BACK_BUTTON)
        );
        actor.attemptsTo(
                WaitUntil.the(INIT_TAB, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(INIT_TAB)
        );

        actor.attemptsTo(
                WaitUntil.the(LOGOUT_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LOGOUT_BUTTON)
        );

        actor.attemptsTo(
                WaitUntil.the(LOGOUT_CONFIRM, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LOGOUT_CONFIRM)
        );


    }

    public static Help me() {
        return Tasks.instrumented(Help.class);
    }

}
