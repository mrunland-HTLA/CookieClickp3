import java.util.Timer;
import java.util.TimerTask;

public class Game {
    int cookieCounter;
    int cookiesPerClick;
    int cookiesPerSecond;

    public Game () {
        cookieCounter = 0;
        cookiesPerClick = 1;
        cookiesPerSecond = 0;
        

        Timer slowCooker = new Timer();
        TimerTask slow = new TimerTask() {
            @Override
            public void run() {
                cookieCounter+=cookiesPerSecond;
            }
        };
        slowCooker.schedule(slow,0,1000);




    }

    public void cookieClick() {
        cookieCounter+=cookiesPerClick;
    }
    public void upgradeButton1() {
        if (cookieCounter >= 5 ) {
            cookiesPerClick++;
            cookieCounter -= 5;
        }
    }
    public void upgradeButton2() {
        if (cookieCounter >= 25 ) {
            cookiesPerSecond++;
            cookieCounter -= 25;
        }
    }

}
