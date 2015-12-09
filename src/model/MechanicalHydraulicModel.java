package model;

/**
 * Created by zhoumaoqiao on 15/10/28.
 */
public class MechanicalHydraulicModel {

    //Parameters
    public  int systemCounter = 0;

    private boolean gearLockedInExtendedPosition;
    private boolean gearLockedInRetractedPosition;
    private boolean gearShockAbsorberOnGround;

    private boolean doorLockedInOpenedPosition;
    private boolean doorLockedInClosedPosition;

    private boolean doorOpenedByCylinder;
    private boolean gearExtendedByCylinder;

    private boolean generalPressurizedByElectroValve;
    private boolean doorOpeningPressurizedByElectroValve;
    private boolean doorClosingPressurizedByElectroValve;
    private boolean gearExtendingPressurizedByElectroValve;
    private boolean gearRetractingPressurizedByElectrovalve;

    private boolean hydraulicCircuitPressurized;

    private boolean analogicalSwitchOpened = true;

    public MechanicalHydraulicModel(boolean gearLockedInExtendedPosition, boolean gearLockedInRetractedPosition,
                                    boolean gearShockAbsorberOnGround, boolean doorLockedInOpenedPosition, boolean doorLockedInClosedPosition,
                                    boolean doorOpenedByCylinder, boolean gearExtendedByCylinder,
                                    boolean generalPressurizedByElectroValve, boolean doorOpeningPressurizedByElectroValve,
                                    boolean doorClosingPressurizedByElectroValve, boolean gearExtendingPressurizedByElectroValve,
                                    boolean gearRetractingPressurizedByElectrovalve, boolean hydraulicCircuitPressurized, boolean analogicalSwitchOpened){
        super();
        this.gearLockedInExtendedPosition = gearLockedInExtendedPosition;
        this.gearLockedInRetractedPosition = gearLockedInRetractedPosition;
        this.gearShockAbsorberOnGround = gearShockAbsorberOnGround;
        this.doorLockedInOpenedPosition = doorLockedInOpenedPosition;
        this.doorLockedInClosedPosition = doorLockedInClosedPosition;
        this.doorOpenedByCylinder = doorOpenedByCylinder;
        this.gearExtendedByCylinder = gearExtendedByCylinder;
        this.generalPressurizedByElectroValve = generalPressurizedByElectroValve;
        this.doorOpeningPressurizedByElectroValve = doorOpeningPressurizedByElectroValve;
        this.doorClosingPressurizedByElectroValve = doorClosingPressurizedByElectroValve;
        this.gearExtendingPressurizedByElectroValve = gearExtendingPressurizedByElectroValve;
        this.gearRetractingPressurizedByElectrovalve = gearRetractingPressurizedByElectrovalve;
        this.hydraulicCircuitPressurized = hydraulicCircuitPressurized;
        this.analogicalSwitchOpened = analogicalSwitchOpened;
    }

    //Setter and Getter functions

    public boolean isGearExtendedByCylinder() {
        return gearExtendedByCylinder;
    }

    public void setGearExtendedByCylinder(boolean gearExtendedByCylinder) {
        this.gearExtendedByCylinder = gearExtendedByCylinder;
    }

    public boolean isDoorClosingPressurizedByElectroValve() {
        return doorClosingPressurizedByElectroValve;
    }

    public void setDoorClosingPressurizedByElectroValve(boolean doorClosingPressurizedByElectroValve) {
        this.doorClosingPressurizedByElectroValve = doorClosingPressurizedByElectroValve;
    }

    public boolean isGeneralPressurizedByElectroValve() {
        return generalPressurizedByElectroValve;
    }

    public void setGeneralPressurizedByElectroValve(boolean generalPressurizedByElectroValve) {
        this.generalPressurizedByElectroValve = generalPressurizedByElectroValve;
    }

    public boolean isDoorOpeningPressurizedByElectroValve() {
        return doorOpeningPressurizedByElectroValve;
    }

    public void setDoorOpeningPressurizedByElectroValve(boolean doorOpeningPressurizedByElectroValve) {
        this.doorOpeningPressurizedByElectroValve = doorOpeningPressurizedByElectroValve;
    }

    public boolean isGearExtendingPressurizedByElectroValve() {
        return gearExtendingPressurizedByElectroValve;
    }

    public void setGearExtendingPressurizedByElectroValve(boolean gearExtendingPressurizedByElectroValve) {
        this.gearExtendingPressurizedByElectroValve = gearExtendingPressurizedByElectroValve;
    }

    public boolean isHydraulicCircuitPressurized() {
        return hydraulicCircuitPressurized;
    }

    public void setHydraulicCircuitPressurized(boolean hydraulicCircuitPressurized) {
        this.hydraulicCircuitPressurized = hydraulicCircuitPressurized;
    }

    public boolean isAnalogicalSwitchOpened() {
        return analogicalSwitchOpened;
    }

    public void setAnalogicalSwitchOpened(boolean analogicalSwitchOpened) {
        this.analogicalSwitchOpened = analogicalSwitchOpened;
    }

    public boolean isGearRetractingPressurizedByElectrovalve() {
        return gearRetractingPressurizedByElectrovalve;
    }

    public void setGearRetractingPressurizedByElectrovalve(boolean gearRetractingPressurizedByElectrovalve) {
        this.gearRetractingPressurizedByElectrovalve = gearRetractingPressurizedByElectrovalve;
    }

    public boolean isDoorLockedInClosedPosition() {
        return doorLockedInClosedPosition;
    }

    public void setDoorLockedInClosedPosition(boolean doorLockedInClosedPosition) {
        this.doorLockedInClosedPosition = doorLockedInClosedPosition;
    }

    public boolean isDoorOpenedByCylinder() {
        return doorOpenedByCylinder;
    }

    public void setDoorOpenedByCylinder(boolean doorOpenedByCylinder) {
        this.doorOpenedByCylinder = doorOpenedByCylinder;
    }

    public boolean isDoorLockedInOpenedPosition() {
        return doorLockedInOpenedPosition;
    }

    public void setDoorLockedInOpenedPosition(boolean doorLockedInOpenedPosition) {
        this.doorLockedInOpenedPosition = doorLockedInOpenedPosition;
    }

    public boolean isGearLockedInRetractedPosition() {
        return gearLockedInRetractedPosition;
    }

    public void setGearLockedInRetractedPosition(boolean gearLockedInRetractedPosition) {
        this.gearLockedInRetractedPosition = gearLockedInRetractedPosition;
    }

    public boolean isGearLockedInExtendedPosition() {
        return gearLockedInExtendedPosition;
    }

    public void setGearLockedInExtendedPosition(boolean gearLockedInExtendedPosition) {
        this.gearLockedInExtendedPosition = gearLockedInExtendedPosition;
    }

    public boolean isGearShockAbsorberOnGround() {
        return gearShockAbsorberOnGround;
    }

    public void setGearShockAbsorberOnGround(boolean gearShockAbsorberOnGround) {
        this.gearShockAbsorberOnGround = gearShockAbsorberOnGround;
    }
}
