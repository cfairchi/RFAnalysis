package com.expr.mvcr.stk.svc.services.models;

public abstract class Antenna extends RFObject {
    private RFGainPattern rfGainPattern;
    private String targetRFPlatformId;

    public RFGainPattern getRfGainPattern() {
        return rfGainPattern;
    }

    public void setRfGainPattern(RFGainPattern rfGainPattern) {
        this.rfGainPattern = rfGainPattern;
    }

    public String getTargetRFPlatformId() {
        return targetRFPlatformId;
    }

    public void setTargetRFPlatformId(String targetRFPlatformId) {
        this.targetRFPlatformId = targetRFPlatformId;
    }
}
