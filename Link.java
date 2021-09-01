package com.expr.mvcr.stk.svc.services.models;

public class Link extends RFObject {
    private String transmitterPlatformId;
    private String transmitterId;
    private String ReceiverPlatformId;
    private String receiverId;

    public String getTransmitterPlatformId() {
        return transmitterPlatformId;
    }

    public void setTransmitterPlatformId(String transmitterPlatformId) {
        this.transmitterPlatformId = transmitterPlatformId;
    }

    public String getReceiverPlatformId() {
        return ReceiverPlatformId;
    }

    public void setReceiverPlatformId(String receiverPlatformId) {
        ReceiverPlatformId = receiverPlatformId;
    }

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
