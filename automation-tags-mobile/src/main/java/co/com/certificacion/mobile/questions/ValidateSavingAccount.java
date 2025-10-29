package co.com.certificacion.mobile.questions;

import static co.com.certificacion.mobile.userinterfaces.QuestionElements.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateSavingAccount implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {


        return TYPE_OF_ACCOUNT.resolveFor(actor).isVisible()
                &&  ACCOUNT_NUMBER.resolveFor(actor).isVisible()
                &&  AVAILABLE_BALANCE.resolveFor(actor).isVisible()
                &&  CURRENT_BALANCE.resolveFor(actor).isVisible()
                &&  DETAILS_TITLE.resolveFor(actor).isVisible()
                &&  MOVEMENTS_TITLE.resolveFor(actor).isVisible()
                &&  PLAN_TITLE.resolveFor(actor).isVisible();
    }

    public static ValidateSavingAccount isVisible() {
        return new ValidateSavingAccount();
    }
}
