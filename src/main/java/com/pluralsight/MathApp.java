package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question1
        double bobSalary = 100000;
        double garySalary = 1500000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        //Question2
        double carPrice = 450000;
        double truckPrice = 75000;
        double smallestVehiclePrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest price is " + smallestVehiclePrice);

        //Question3
        double radiusOfCircle = 7.25;
        double areaOfCircle = Math.PI * (radiusOfCircle * radiusOfCircle); //Area of Circle formula is PI * Radius squared
        System.out.println("Area of the Circle is " + areaOfCircle);

        //Question4
        double number = 5.0;
        System.out.println("The square root of 5.0 is " + Math.sqrt(number));

        //Question5
        int pointAxValue = 5;
        int pointAyValue = 10;
        int pointBxValue = 85;
        int pointByValue = 50;
        //Formula for distance btn two points is square root (x2-x1)^2 + (y2-y1)^2
        double distanceBtn2Points = Math.sqrt(Math.pow(pointBxValue - pointAxValue, 2) + Math.pow(pointByValue - pointAyValue, 2));
        System.out.println("The distance between points is " + distanceBtn2Points);

        //Question6
        double negNumber = -3.5;
        System.out.println("The absolute positive number for " + negNumber + " is " + Math.abs(negNumber));

        //Question7
        double randomNumber = Math.random();    //generates a random number between 0-1 but not equal to 1 or 0
        System.out.println("Random number is " + randomNumber);

        //Question8
        int secondsInHour = 3600; //3600 secs in an hour
        int hoursPerDay = 24;
        int days = 24;
        int totalNumberSeconds = secondsInHour * hoursPerDay * days;
        System.out.println("Total number of seconds in 24 days is: " + totalNumberSeconds);
        int totalMilliseconds =  totalNumberSeconds * 1000; // 1 second = 1000 milliseconds
        System.out.println("Total number of Milliseconds in 24 days is: " + totalMilliseconds);



    }
}
