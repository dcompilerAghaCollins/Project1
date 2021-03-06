

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@ManagedBean
@SessionScoped
public class Car1 implements Serializable{

    private String model;
    private String manufacturer;
    private int year;
    private String color;
    
    public Car1() {
        
    }
    public Car1(String model,String manufacturer, int year, String color){
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
