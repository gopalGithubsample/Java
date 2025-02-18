package com.wipro.java;

class LinkedInProfile {
    String name;
    String title;
    int connections;

    public LinkedInProfile(String name, String title, int connections) {
        this.name = name;
        this.title = title;
        this.connections = connections;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Title: " + title + ", Connections: " + connections;
    }
}

