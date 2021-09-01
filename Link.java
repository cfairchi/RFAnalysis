package com.expr.mvcr.stk.svc.services.models;

public class Link extends RFObject {
    private String transmitterId;
    private String receiverId;

    public String getTransmitterId() {
        return transmitterId;
    }

    public void setTransmitterId(String transmitterId) {
        this.transmitterId = transmitterId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }
}
