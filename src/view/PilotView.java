package view;

import model.MechanicalModel;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhoumaoqiao on 15/10/18.
 */
public class PilotView extends JFrame implements Observer {
    public JPanel gearPanel = new JPanel();
    public JPanel imageGearPanel = new JPanel();
    public JLabel frontGearLabel = new JLabel();
    public JButton retractionGearButton = new JButton();
    public JButton extensionGearButton = new JButton();
    public JRadioButton lockedRadioButton = new JRadioButton();
    public JRadioButton manueveringRadioButton = new JRadioButton();
    public JRadioButton failureRadioButton = new JRadioButton();
    public JList simulationSystemMessageList = new JList();
    public JScrollPane simulationSystemMessageScollPane = new JScrollPane();
    public ImageIcon imgDown = new ImageIcon("./images/gearDown.png");
    public ImageIcon imgMiddle = new ImageIcon("./images/gearMiddle.png");
    public ImageIcon imgUp = new ImageIcon("./images/gearUp.png");

    public JButton imageGearDownButton = new JButton(imgDown);
    public JButton imageGearMiddleButton = new JButton(imgMiddle);
    public JButton imageGearUpButton = new JButton(imgUp);



    private MechanicalModel mechanicalModel;



    /**
     * Constructor
     *
     * @param mechanicalModel
     */
    public PilotView(MechanicalModel mechanicalModel) {
        this.mechanicalModel = mechanicalModel;

        retractionGearButton.setText("Move up the landing gear(Retraction)");
        extensionGearButton.setText("Move down the landing gear(Extension)");
        extensionGearButton.setEnabled(false);
        frontGearLabel.setText("Landing Gear Status : ");

        lockedRadioButton.setEnabled(true);
        lockedRadioButton.setSelected(true);
        lockedRadioButton.setForeground(new Color(-13369600));
        lockedRadioButton.setText("Gears Are Locked");
        manueveringRadioButton.setEnabled(false);
        manueveringRadioButton.setForeground(new Color(-13312));
        manueveringRadioButton.setText("Gears Manuevering");
        failureRadioButton.setEnabled(false);
        failureRadioButton.setForeground(new Color(-52480));
        failureRadioButton.setText("Landing Gear System Failure");

        simulationSystemMessageScollPane.getViewport().setView(simulationSystemMessageList);
        simulationSystemMessageScollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        imageGearDownButton.setEnabled(true);
        imageGearMiddleButton.setEnabled(true);
        imageGearMiddleButton.setVisible(false);
        imageGearUpButton.setEnabled(true);
        imageGearUpButton.setVisible(false);

        gearPanel.add(retractionGearButton);
        gearPanel.add(extensionGearButton);
        gearPanel.add(frontGearLabel);
        gearPanel.add(lockedRadioButton);
        gearPanel.add(manueveringRadioButton);
        gearPanel.add(failureRadioButton);
        gearPanel.add(simulationSystemMessageScollPane);

        gearPanel.add(imageGearDownButton);
        gearPanel.add(imageGearMiddleButton);
        gearPanel.add(imageGearUpButton);

        add(gearPanel, BorderLayout.NORTH);

        this.mechanicalModel.addObserver(this);
        // set off the parameters of the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300, 500);
        this.setLocation(500, 300);
        this.setTitle("Landing Gear Simulation System");
        this.setVisible(true);

    }
    /**
     *
     *reset those control buttons after one cycle period
     */
    public  void enablePilotInterface(){
        this.mechanicalModel.initCycleTimer();
    }



    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        //gears position from down to up
        if((!this.extensionGearButton.isEnabled()) && (this.retractionGearButton.isEnabled())){
            if(this.mechanicalModel.getTimerInHalf()){
                this.imageGearDownButton.setVisible(false);
                this.imageGearMiddleButton.setVisible(true);
                this.imageGearUpButton.setVisible(false);
                System.out.println("from down to up in the half");
                //reset the half timer in false after one once used
                this.mechanicalModel.setTimerInHalf(false);
            }

            if(this.mechanicalModel.getTimerComplete()) {
                this.extensionGearButton.setEnabled(true);
                this.imageGearDownButton.setVisible(false);
                this.imageGearMiddleButton.setVisible(false);
                this.imageGearUpButton.setVisible(true);
                //reset down button to be enable if not it will occur a failure action
                this.retractionGearButton.setEnabled(false);
                this.lockedRadioButton.setEnabled(true);
                this.lockedRadioButton.setSelected(true);
                this.manueveringRadioButton.setEnabled(false);
                this.manueveringRadioButton.setSelected(false);
                System.out.println("***from down to up in the end***");
                //reset the end timer in false after one once used
                this.mechanicalModel.setTimerComplete(false);

            }
        }

        else if((this.extensionGearButton.isEnabled()) && (!this.retractionGearButton.isEnabled())){
            //gears position from up to down
            if(this.mechanicalModel.getTimerInHalf()){
                this.imageGearUpButton.setVisible(false);
                this.imageGearMiddleButton.setVisible(true);
                this.imageGearDownButton.setVisible(false);
                System.out.println("from up to down in the half");
                //reset the half timer in false after one once used
                this.mechanicalModel.setTimerInHalf(false);
            }

            if(this.mechanicalModel.getTimerComplete()){
                this.retractionGearButton.setEnabled(true);
                this.imageGearDownButton.setVisible(false);
                this.imageGearMiddleButton.setVisible(false);
                this.imageGearDownButton.setVisible(true);
                //reset up button to be enable if not it will occur a failure action
                this.extensionGearButton.setEnabled(false);
                this.lockedRadioButton.setEnabled(true);
                this.lockedRadioButton.setSelected(true);
                this.manueveringRadioButton.setEnabled(false);
                this.manueveringRadioButton.setSelected(false);
                System.out.println("***from up to down in the end***");
                //reset the end timer in false after one once used
                this.mechanicalModel.setTimerComplete(false);


            }
        }else {
            //system has failure action
            this.failureRadioButton.setEnabled(true);
            this.failureRadioButton.setSelected(true);
            this.lockedRadioButton.setEnabled(false);
            this.lockedRadioButton.setSelected(false);
            this.manueveringRadioButton.setEnabled(false);
            this.manueveringRadioButton.setSelected(false);
        }



    }
}

