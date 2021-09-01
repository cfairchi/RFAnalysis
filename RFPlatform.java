package com.expr.mvcr.stk.svc.services.models;

import java.util.ArrayList;
import java.util.List;

public class RFPlatform extends RFObject {
    Position position;
    private List<Antenna> antennas = new ArrayList<>();

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Antenna> getAntennas() {
        return antennas;
    }

    public void setAntennas(List<Antenna> antennas) {
        this.antennas = antennas;
    }
}
