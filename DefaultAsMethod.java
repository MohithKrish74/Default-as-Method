package com.keyword;

class Vehicle
{
    void BrandName()                   //Following are default methods in Class Vehicle
    {
        System.out.println("What is the Brand Name ? ");
    }
    void ModelName()
    {
        System.out.println("What is the Model Name ? ");
    }
    void Mileage()
    {
        System.out.println("What is the Mileage of the Vehicle ? ");
    }
    void FuelType()
    {
        System.out.println("What is the Fuel Type ? ");
    }
    void Capacity()
    {
        System.out.println("What is the Capacity of the Vehicle ? ");
    }
}
class Car extends Vehicle
{
    void BrandName()
    {
        System.out.println("The Brand Name is Maruti Suzuki. ");
    }
    void ModelName()
    {
        System.out.println("The Model Name is Maruti Suzuki Swift.");
    }
    void Mileage()
    {
        System.out.println("The Mileage of the Vehicle is 25 km/hr. ");
    }
    void FuelType()
    {
        System.out.println("The Fuel Type is Diesel.");
    }
    void Capacity()
    {
        System.out.println("The Capacity of the Vehicle is 4. ");
    }
}
public class DefaultAsMethod
{
    public static void main(String[] args)
    {
        Car swift = new Car();
        System.out.println("Details of the car :");
        swift.BrandName();
        swift.ModelName();
        swift.Mileage();
        swift.FuelType();
        swift.Capacity();
    }
}
