package controller;

import java.io.IOException;
import view.PilotView;
import model.MechanicalModel;
/**
 * Created by zhoumaoqiao on 15/10/17.
 */
public class Main {
    public static void main(String[] arg) throws IOException {
        MechanicalModel model = new MechanicalModel();
        PilotView view = new PilotView(model);
        DigitalController controller = new DigitalController(model, view);
        view.retractionGearButton.addActionListener(controller);
        view.extensionGearButton.addActionListener(controller);
    }
}


