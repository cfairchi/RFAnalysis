package com.expr.mvcr.stk.svc.models;

public class LatLonAlt {
    private double latitudeDeg;
    private double longitudeDeg;
    private double altitudeMeters;

    public LatLonAlt() {

    }

    public LatLonAlt(double latitudeDeg, double longitudeDeg, double altitudeMeters) {
        this.latitudeDeg = latitudeDeg;
        this.longitudeDeg = longitudeDeg;
        this.altitudeMeters = altitudeMeters;
    }

    public LatLonAlt(double[] theLatDegLonDegAltM) {
        this.latitudeDeg = theLatDegLonDegAltM[0];
        this.longitudeDeg = theLatDegLonDegAltM[1];
        this.altitudeMeters = theLatDegLonDegAltM[2];
    }

    public double getLatitudeDeg() {
        return latitudeDeg;
    }

    public double getLongitudeDeg() {
        return longitudeDeg;
    }

    public double getAltitudeMeters() {
        return altitudeMeters;
    }

    public void setLatitudeDeg(double latitudeDeg) {
        this.latitudeDeg = latitudeDeg;
    }

    public void setLongitudeDeg(double longitudeDeg) {
        this.longitudeDeg = longitudeDeg;
    }

    public void setAltitudeMeters(double altitudeMeters) {
        this.altitudeMeters = altitudeMeters;
    }

    @Override
    public String toString() {
        return this.latitudeDeg + ", " + this.longitudeDeg + ", " + this.altitudeMeters;
    }


}
