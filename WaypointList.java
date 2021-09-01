package com.expr.mvcr.stk.svc.services.models;

import java.util.List;

public class WaypointList extends Position {
    private List<Waypoint> waypoints;

    public List<Waypoint> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<Waypoint> waypoints) {
        this.waypoints = waypoints;
    }
}
