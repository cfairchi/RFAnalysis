package com.expr.mvcr.stk.svc.services.models;

import com.expr.mvcr.stk.svc.models.TimeInterval;

import java.util.List;

public class LinkBudgetRequest {
    private List<RFPlatform> rfPlatforms;
    private List<Link> links;
    private List<TimeInterval> evalIntervals;
    private double timeStepSeconds;

    public LinkBudgetRequest() {
    }

    public List<RFPlatform> getRfPlatforms() {
        return rfPlatforms;
    }

    public void setRfPlatforms(List<RFPlatform> rfPlatforms) {
        this.rfPlatforms = rfPlatforms;
    }

    public double getTimeStepSeconds() {
        return timeStepSeconds;
    }

    public void setTimeStepSeconds(double timeStepSeconds) {
        this.timeStepSeconds = timeStepSeconds;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<TimeInterval> getEvalIntervals() {
        return evalIntervals;
    }

    public void setEvalIntervals(List<TimeInterval> evalIntervals) {
        this.evalIntervals = evalIntervals;
    }


}
