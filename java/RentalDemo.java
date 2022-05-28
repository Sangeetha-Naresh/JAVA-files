//creating the vehical renta' class
class VehicleRental
{
    // creating the make, year and rental_price variables
    String make,model;
    int year;
    double rental_price;

    //initializing a parameterized constructor for Vehicle Rental class
    VehicleRental( int y, String ma,String mo,double rp)
    {
        year=y;
        make=ma;
        model=mo;
        rental_price=rp;
    }

    // Getter methods
    public String getMake() 
    {
        return make;
    }
    // Getter methods
    public String getModel() 
    {
        return model;
    }

     // Getter methods
    public int getYear() 
    {
        return year;
    }

    void displayRental()
    {
        System.out.println("Year : "+getYear());
        System.out.println("Make : "+getMake());
        System.out.println("Model : "+getModel());
    }
}

//creating the CarRental sub class which extends base class VehicleRental
class CarRental extends VehicleRental
{
    int passengers;
    char suv;
    final static double premium_amount= 50.0;

    //initializing the parameterized constructor
    CarRental(int y, String ma, String mo, double rp, int pa, char s)
    {
        //calling the super class constructor

        super( y,  ma,mo,rp);

        //assigning passengers and suv value
        passengers=pa;
        suv=s;
        
        //checking if SUV to add the additional premium amount
        if(suv=='y' || suv=='Y'){
            rental_price=rental_price+premium_amount;
        }
        
    }

    //getters for getting passengers number
     public int getPassengers() 
    {
        return passengers;
    }

    
    //getters for getting rental price
     public double getRentalPrice() 
    {
        return rental_price;
    }

    //overriding the displayRental method of the base class VehicleRental
    void displayRental()
    {
        //calling the super class method
        super.displayRental();

        //checking for SUV upgrade
        if(suv=='y' || suv=='Y')
        {
            System.out.println("SUV UPGRADE");
        }

        System.out.println("The number of Passengers is : "+ getPassengers());
        System.out.println("Rental Price : $"+  String.format("%.2f", getRentalPrice()));
    }
  
}
   
//creating the TruckRental sub class which extends base class VehicleRental
class TruckRental extends VehicleRental
{
    int capacity;
    char discount;
    final static double discount_amount= 25.0;

    //initializing the parameterized constructor
    TruckRental(int y, String ma, String mo, double rp, int ca, char d)
    {
        //calling the super class constructor

        super( y,  ma,mo,rp);

        //assigning capacity and discount value
        capacity=ca;
        discount=d;
        
        //checking if applicable for the discount amount
        if(discount=='y' || discount=='Y')
        {
            rental_price=rental_price-discount_amount;
        }
        
    }

    //getters for getting capacity
     public int getCapacity() 
    {
        return capacity;
    }

    
    //getters for getting rental price
     public double getRentalPrice() 
    {
        return rental_price;
    }

    //overriding the displayRental method of the base class VehicleRental
    void displayRental()
    {
        //calling the super class method
        super.displayRental();

        //checking if discount is applicable
        if(discount=='y' || discount=='Y')
        {
            System.out.println("DISCOUNT APPLIED");
        }

        System.out.println("Capacity is : "+ getCapacity()+" pounds");
        System.out.println("Rental Price : $"+ String.format("%.2f", getRentalPrice()));
    }
  
}
   


//Creating the main demo class 
class RentalDemo
{
    public static void main(String args[])
    {
        // creating the individual objects 
        CarRental car1 = new CarRental(2022, "Chevrolet","Malibu",39.99,5,'N');
        CarRental car2 = new CarRental(2022, "Chevrolet","Tahoe",79.99,7,'Y');

        TruckRental truck1= new TruckRental(2020,"Ford","E450",135.99,8900,'Y');
        TruckRental truck2= new TruckRental(2006,"GMC","C6500",92.99,25000,'N');
        

        //calling the display rental function for individual objects
        car1.displayRental();
        System.out.println("");
        car2.displayRental();
        System.out.println("");

        truck1.displayRental();
        System.out.println("");
        truck2.displayRental();
        
    }
}