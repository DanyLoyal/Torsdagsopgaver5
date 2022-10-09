package task_1;
/*This task is an exercise in the syntax of writing entity classes, and how to connect those by assigning instances of one class to instance fields of another.

        1.a Create a Driver.java class with the following private fields (use appropriate types):

        name
        age
        1.b Create a constructor that populates all the fields above.

        1.c Create a Car.java class with the following private fields (use appropriate types):

        make
        model
        year
        bodyStyle
        driver
        1.d Create a constructor, that populates all the fields above, except the Driver.

        1.e A car is not instantiated with a Driver, so we need another way to assign and un-assign a driver to a car: create getter and setter methods for the Driver variable, of the Car class.

        1.f Override the toString() method in the Car class, returning: "Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle

        Help:
        1.g Override the toString() method in the Driver class, returning: " is driven by "+name

        1.h In the main method, instantiate a new Driver, populating the fields with your own name and age.

        1.i In the main method, instantiate a new Car, populating the field with whatever values you see fit.

        1.j In the main method, assign the driver to the car created, using the setter method created in step 1.e

        1.k print the toString() method of the car you've created followed by the toString() method of the driver.

        1.l In the main method, create yet another car and assign the same driver to this car.

        1.m repeat the step 1.k for the new car created in 1.l.

*/




public class Main {

    static Driver driver = new Driver("Danyal", 21);

    static Car car = new Car("BMW", "330i", 2022, "coupe");

    public static void main(String[] args) {
        car.setDriver(String.valueOf(driver));

        Car car_2 = new Car("Audi","RS7",2022,"Coupe");
        car_2.setDriver(String.valueOf(driver));

        System.out.print(car.toString());

        System.out.print(car_2.toString());
        System.out.print(driver.toString());
    }



}
