package com.expr.mvcr.stk.svc.services.models;

import com.expr.mvcr.stk.svc.models.LatLonAlt;

public class Waypoint {
    private LatLonAlt latLonAlt;
    private String timeStampIso;

    public LatLonAlt getLatLonAlt() {
        return latLonAlt;
    }

    public void setLatLonAlt(LatLonAlt latLonAlt) {
        this.latLonAlt = latLonAlt;
    }

    public String getTimeStampIso() {
        return timeStampIso;
    }

    public void setTimeStampIso(String timeStampIso) {
        this.timeStampIso = timeStampIso;
    }
}
