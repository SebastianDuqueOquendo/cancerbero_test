package co.com.certificacion.mobile.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HelpElements {

    public static final Target MESSAGE_BUTTON = Target.the("Message button")
            .locatedBy("//android.widget.Button[@content-desc=\"Mensajes\"]");

    public static final Target UNDERSTOOD_BUTTON = Target.the("Understood button")
            .locatedBy("//android.widget.Button[@content-desc=\"Entendido\"]");


    public static final Target HELP_BUTTON = Target.the("Help button")
            .locatedBy("//android.widget.Button[@content-desc=\"Ayuda\"]");

    public static final Target INIT_TAB = Target.the("Init tab")
            .locatedBy("//android.widget.Button[@content-desc=\"Inicio, Pesta\u00f1a 1 de 5\"]");

    public static final Target CONTACT_US = Target.the("Contact us")
            .locatedBy("//android.widget.Button[@content-desc=\"Cont\u00e1ctanos \"]");

    public static final Target TALK_TO_US = Target.the("Talk to us")
            .locatedBy("//android.view.View[@content-desc=\"Hablemos, , Bot\u00f3n.\"]");

    public static final Target VISIT_US = Target.the("Visit us")
            .locatedBy("//android.view.View[@content-desc=\"Vis\u00edtanos, , Bot\u00f3n.\"]");

}
