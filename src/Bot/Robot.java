package Bot;

import java.util.Calendar;
import java.util.Locale;


public class Robot {
    private static final Locale LOCALE = new Locale("pt", "BR");
    private static final Calendar birthday = Calendar.getInstance();
    private static final String signature = "#MDP-115";
    private static final String name = "Bookie";
    private static Robot instance;

    private Calendar today;

    private Robot() {
        today = Calendar.getInstance();
    }

    /**
     * Implementing singleton design pattern.
     * @return = if not instanced, Bookie is created and returned. Else, returns the already instanced Bookie.
     */
    public Robot getInstance(){
        if (instance == null)
            instance = new Robot();

        return instance;
    }

    public void drinkWarning(){

    }
}
