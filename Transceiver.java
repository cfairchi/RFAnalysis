package com.expr.mvcr.stk.svc.services.models;

public class Transceiver extends RFObject {
    private Transmitter transmitter;
    private Receiver receiver;

    public Transmitter getTransmitter() {
        return transmitter;
    }

    public void setTransmitter(Transmitter transmitter) {
        this.transmitter = transmitter;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
}
