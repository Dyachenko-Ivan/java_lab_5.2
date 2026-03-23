package org.example;

public interface IMAtrix {
    double getIndex(int x, int y);
    void setIndex(int x, int y, double value);
    double calculateDet();
}