package com.expr.mvcr.stk.svc.services.models;

public class ParabolicGainPattern extends RFGainPattern {
    /**
     * Antenna back lobe gain, applied when the angle is greater than 90 degrees from the boresight.
     */
    private double backLobeGain;
    /**
     * Antenna diameter in meters.
     */
    private double diameter;
    /**
     * Antenna efficiency, as a ratio between zero and one.
     */
    private double efficiency;

    public double getBackLobeGain() {
        return backLobeGain;
    }

    public void setBackLobeGain(double backLobeGain) {
        this.backLobeGain = backLobeGain;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }
}
