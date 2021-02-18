/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package climate;

/**
 *
 * @author AJAY
 */
public class Weather {
    private String windDirection;
    private double temprature;
    private boolean snowing;

    public Weather(String windDirection, double temprature, boolean snowing) {
        this.windDirection = windDirection;
        this.temprature = temprature;
        this.snowing = snowing;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public double getTemprature() {
        return temprature;
    }

    public void setTemprature(double temprature) {
        this.temprature = temprature;
    }

    public boolean isSnowing() {
        return snowing;
    }

    public void setSnowing(boolean snowing) {
        this.snowing = snowing;
    }

    @Override
    public String toString() {
        return "Weather{" + "windDirection=" + windDirection + ", temprature=" + temprature + ", snowing=" + snowing + '}';
    }
    
    
    
}
