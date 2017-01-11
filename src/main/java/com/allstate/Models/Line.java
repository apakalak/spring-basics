package com.allstate.Models;

public class Line {
    public Line(){

    }

    public static double getDistance(Point A, Point B) {
        int a= (A.getX() - B.getX()) * (A.getX() - B.getX());
        int b= (A.getY() - B.getY()) * (A.getY() - B.getY());
        return (java.lang.Math.sqrt(a +b));
    }
}
