package co.com.certificacion.mobile.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.mobile.userinterfaces.LoginElements.*;
import static co.com.certificacion.mobile.userinterfaces.LoginElements.LOGOUT_CONFIRM;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SavingAccount implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BALANCE_BUTTON, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BALANCE_BUTTON)
        );
        actor.attemptsTo(
                WaitUntil.the(ACCOUNT_DETAILS, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ACCOUNT_DETAILS)
        );
        actor.attemptsTo(
                WaitUntil.the(DETAILS_TAB, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DETAILS_TAB)
        );
        actor.attemptsTo(
                WaitUntil.the(MOVEMENTS_TAB, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(MOVEMENTS_TAB)
        );
        actor.attemptsTo(
                WaitUntil.the(PLAN_TAB, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(PLAN_TAB)
        );

    }

    public static SavingAccount withTheAmount() {
        return Tasks.instrumented(SavingAccount.class);
    }
}
