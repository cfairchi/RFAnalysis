package com.expr.mvcr.stk.svc.services.models;

public class Transmitter extends Antenna {
    double frequencyHz;
    double powerWatts;
    double dataRateMbPerSecond;
    double bandwidthHz;

    public double getFrequencyHz() {
        return frequencyHz;
    }

    public void setFrequencyHz(double frequencyHz) {
        this.frequencyHz = frequencyHz;
    }

    public double getPowerWatts() {
        return powerWatts;
    }

    public void setPowerWatts(double powerWatts) {
        this.powerWatts = powerWatts;
    }

    public double getDataRateMbPerSecond() {
        return dataRateMbPerSecond;
    }

    public void setDataRateMbPerSecond(double dataRateMbPerSecond) {
        this.dataRateMbPerSecond = dataRateMbPerSecond;
    }

    public double getBandwidthHz() {
        return bandwidthHz;
    }

    public void setBandwidthHz(double bandwidthHz) {
        this.bandwidthHz = bandwidthHz;
    }
}
