package com.example.vierentwintiguurszeilracecalculator;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WPStorage {
    private HashSet<Waypoint> waypoints;

    public WPStorage() {
    }

    public Set<Waypoint> getWaypoints() {
        return  Collections.unmodifiableSet(waypoints);
    }

    public void getWaypoint(String name) {
        //?
    }

    public void addWaypoint(String name, float[] position) {
        waypoints.add(new Waypoint(name, position));
    }
}
