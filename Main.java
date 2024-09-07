//Main Class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar =new Car("blue", "Farari");
     
        // Using the object
        myCar.getModel();
        myCar.getColor();
        
        // Accessing the object's attributes
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Color: " + myCar.getColor());
    }
}