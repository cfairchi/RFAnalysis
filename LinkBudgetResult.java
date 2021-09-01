package com.expr.mvcr.stk.svc.services.models;

import java.util.List;

public class LinkBudgetResult {
    private List<LinkBudgetInterval> linkBudgetIntervals;

    public LinkBudgetResult() {
    }

    public List<LinkBudgetInterval> getLinkBudgetIntervals() {
        return linkBudgetIntervals;
    }

    public void setLinkBudgetIntervals(List<LinkBudgetInterval> linkBudgetIntervals) {
        this.linkBudgetIntervals = linkBudgetIntervals;
    }
}
