package com.example.vierentwintiguurszeilracecalculator;

// import from https://www.24uurszeilrace.nl/WedstrijdInfo/Boeien.aspx
public class Waypoint {
    private String name = null;
    private float[] position = new float[2];

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float[] getPosition() {
        return position;
    }

    public void setPosition(float[] position) {
        this.position = position;
    }

    public Waypoint(String name, float[] position) {
        this.name = name;
        this.position = position;
    }
}
