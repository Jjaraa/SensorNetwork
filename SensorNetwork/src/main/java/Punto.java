/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Master
 */
public class Punto {
    protected double coordenadaX;
    protected double coordenadaY;
    
    public Punto(double x, double y){
        this.coordenadaX = x;
        this.coordenadaY = y;
    }
    
    public double getCoordenadaX(){
        return this.coordenadaX;
    }
    
    public double getCoordenadaY(){
        return this.coordenadaY;
    }
    
    public void setCoordenadaX(double x){
        this.coordenadaX = x;
    }
    
    public void setCoordenadaY(double y){
        this.coordenadaY = y;
    }
}
