package controller;

import model.MechanicalModel;
import view.PilotView;

import java.awt.event.*;

/**
 * Created by zhoumaoqiao on 15/10/17.
 */


public class DigitalController implements ActionListener {
    private  PilotView pilotView;
    private  MechanicalModel mechanicalModel;
    /**
     * Contractor
     * @param mechanicalModel
     * @param pilotView
     */
    public DigitalController(MechanicalModel mechanicalModel, PilotView pilotView) {
        this.mechanicalModel = mechanicalModel;
        this.pilotView = pilotView;
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.pilotView.retractionGearButton){
            //start in the down position
            //this.pilotView.retractionGearButton.setEnabled(false);
            this.pilotView.lockedRadioButton.setEnabled(false);
            this.pilotView.lockedRadioButton.setSelected(false);
            this.pilotView.manueveringRadioButton.setEnabled(true);
            this.pilotView.manueveringRadioButton.setSelected(true);

            pilotView.enablePilotInterface();
            //end in the up position




        }else if(e.getSource() == this.pilotView.extensionGearButton){
            //start in the up position
           // this.pilotView.extensionGearButton.setEnabled(false);
            this.pilotView.lockedRadioButton.setEnabled(false);
            this.pilotView.lockedRadioButton.setSelected(false);
            this.pilotView.manueveringRadioButton.setEnabled(true);
            this.pilotView.manueveringRadioButton.setSelected(true);

            pilotView.enablePilotInterface();
            //end in the down position
        }

    }
}

