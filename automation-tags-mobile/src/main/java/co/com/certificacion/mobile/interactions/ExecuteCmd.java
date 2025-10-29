package co.com.certificacion.mobile.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExecuteCmd implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

            String commandFirebase = "adb shell setprop debug.firebase.analytics.app co.com.bancolombia.personas.superapp";
            try {
                Runtime tiempoEjecucion = Runtime.getRuntime();
                Process proceso = tiempoEjecucion.exec("cmd.exe /C " + commandFirebase);

                InputStream is = proceso.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public static ExecuteCmd executeCmd() {
        return Tasks.instrumented(ExecuteCmd.class);
    }
}
