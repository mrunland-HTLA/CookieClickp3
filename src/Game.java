import java.util.Timer;
import java.util.TimerTask;
/*
TODO:
Make the numbers increase when we buy more upgrades


 */


public class Game {
    protected int cookieCounter;
    private int cookiesPerClick;
    private int cookiesPerSecond;
    protected int upgrade1Cost;
    protected int upgrade2Cost;
    private int upgradeCount;

    public Game () {
        cookieCounter = 0;
        cookiesPerClick = 1;
        cookiesPerSecond = 0;
        upgrade1Cost = 5;
        upgrade2Cost = 25;
        upgradeCount = 0;
        

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
        if (cookieCounter >= upgrade1Cost ) {
            cookiesPerClick++;
            cookieCounter -= upgrade1Cost;
            upgradeCount++;
            upgrade1Cost += upgradeCount;
        }

    }
    public void upgradeButton2() {
        if (cookieCounter >= upgrade2Cost ) {
            cookiesPerSecond++;
            cookieCounter -= upgrade2Cost;
            //
            //
        }

    }

}
