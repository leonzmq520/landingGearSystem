package model;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by zhoumaoqiao on 15/10/17.
 */
public class MechanicalModel extends Observable {

    private boolean timerComplete = false;
    private boolean timerInHalf = false;



    /**
     * setter/getter of the end cycle timer
     * @param value
     */
    public void setTimerComplete(boolean value) {
        this.timerComplete = value;
        setChanged();
        notifyObservers();
    }

    public boolean getTimerComplete() {
        return this.timerComplete;
    }

    /**
     * setter/getter of the half timer cycle
     * @param value
     */
    public void setTimerInHalf(boolean value) {
        this.timerInHalf = value;
        setChanged();
        notifyObservers();
    }

    public boolean getTimerInHalf() {
        return this.timerInHalf;
    }



    public MechanicalModel() {

    }

    /**
     * init the cycle timer in 10 seconds
     * @return
     */
    public void initCycleTimer(){
        TimerTask firstTask = new TimerTask(){
            @Override
            public void run() {
                System.out.println("Time start (0 s)!!!");
            }
        };

        TimerTask secondTask = new TimerTask(){
            @Override
            public void run() {
                System.out.println("Time in half (5 s)!!!");
                setTimerInHalf(true);
            }
        };

        TimerTask lastTask = new TimerTask(){
            @Override
            public void run() {
                System.out.println("Time over (10 s)!!!");
                setTimerComplete(true);
            }
        };
        Timer timer = new Timer(true);
        long delay = 5*1000;
        long period = 9999*1000;
        // schedules the task to be run in an interval
        timer.schedule(firstTask, delay * 0);
        timer.schedule(secondTask, delay / 2);
        timer.schedule(lastTask, delay);
    }

}


