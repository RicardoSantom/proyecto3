/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto3;

public class Triangle {

    private float base;
    private float height;

    public Triangle() {
    }

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    /**
     * This function returns the value of the triangle area
     *
     * @return area of the triangle
     */
    public float calculateArea() {
        return (base * height) / 2;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getArea() {
        return height;
    }

    public void setArea(float area) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

}
