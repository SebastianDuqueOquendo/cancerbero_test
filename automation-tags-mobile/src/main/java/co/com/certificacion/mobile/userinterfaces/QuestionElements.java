package co.com.certificacion.mobile.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class QuestionElements {
    public static final Target SAVING_ACCOUNT_TITLE = Target.the("Saving account" )
            .located(By.xpath("//android.view.View[@content-desc=\"Cuentas Cuenta de Ahorros\"]"));

    public static final Target TYPE_OF_ACCOUNT = Target.the("Type of account" )
            .located(By.xpath("//android.view.View[@content-desc=\"Ahorros\"]"));

    public static final Target ACCOUNT_NUMBER = Target.the("Account number" )
            .located(By.xpath("//android.view.View[@content-desc=\"406 - 717353 - 84\"]"));

    public static final Target AVAILABLE_BALANCE = Target.the("Available balance" )
            .located(By.xpath("//android.view.View[@content-desc=\"Saldo disponible\"]"));

    public static final Target CURRENT_BALANCE = Target.the("Current balance" )
            .located(By.xpath("//android.view.View[@content-desc=\"$ 98.000.000,00\"]"));

    public static final Target DETAILS_TITLE = Target.the("Details title" )
            .located(By.xpath("//android.view.View[@content-desc=\"Detalles\"]"));

    public static final Target MOVEMENTS_TITLE = Target.the("Movements title" )
            .located(By.xpath("//android.view.View[@content-desc=\"Movimientos\"]"));

    public static final Target PLAN_TITLE = Target.the("Plan title" )
            .located(By.xpath("//android.view.View[@content-desc=\"Plan\"]"));

}
