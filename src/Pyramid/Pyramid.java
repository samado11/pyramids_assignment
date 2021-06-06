/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pyramid;

/**
 *
 * @author maroa
 */
public class Pyramid {
    private double height;
    private String modern_name;
    private String phareoh;
    private String site;
    public Pyramid(String phareoh,String modern_name,String site,double height) {
        this.phareoh = phareoh;
        this.modern_name = modern_name;
        this.site = site;
        this.height = height;
  }
    

    public double getHeight() {
        return height;
    }

    public String getModern_name() {
        return modern_name;
    }

    public String getPhareoh() {
        return phareoh;
    }

    public String getSite() {
        return site;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public void setPhareoh(String phareoh) {
        this.phareoh = phareoh;
    }

    public void setSite(String site) {
        this.site = site;
    }
    public String toString(){
        String obj = height+" "+modern_name+" "+phareoh+" "+site;
        return obj;  
 }  
    
    
}
