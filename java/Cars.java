//creating the car class
class Car 
{
    // creating the name, engine, cylinder and wheels variables
    String name;
    int cylinder;
    String engine="true";
    int wheels=4;

    //initializing a parameterized constructor for car class
    Car( int c, String n)
    {
        name=n;
        cylinder=c;
    }

    // Getter methods
    public String getName() 
    {
        return name;
    }

     // Getter methods
    public int getCylinder() 
    {
        return cylinder;
    }

    // defining the startEngine method
    String startEngine()
    {
        return " CAR--->startEngine()";
    }

     // defining the accelerate method
     String accelerate()
    {
        return " CAR--->accelerate()";
    }

    // defining the brake method
     String brake()
    {
        return " CAR--->brake()";
    }

}

//creating the Honda sub class which extends base class car
class Honda extends Car
{
    //initializing the parameterized constructor
    Honda(int c, String n)
    {
        //calling the super class constructor
        super( c,  n);
    }

    // overriding the startEngine method of the base class car
     String startEngine()
    {
        return " Honda--->startEngine()";
    }

    // overriding the accelerate method of the base class car
     String accelerate()
    {
        return " Honda--->accelerate()";
    }
    
    // overriding the brake method of the base class car
     String brake()
    {
        return " Honda--->brake()";
    }
}

//creating the Toyota sub class which extends base class car
class Toyota extends Car
{
    
    //initializing the parameterized constructor
    Toyota(int c, String n)
    {
          //calling the super class constructor
        super(c,  n);
    }

    // overriding the startEngine method of the base class car
     String startEngine()
    {
        return " Toyota--->startEngine()";
    }

    
    // overriding the accelerate method of the base class car
     String accelerate()
    {
        return " Toyota--->accelerate()";
    }
      
    // overriding the brake method of the base class car
     String brake()
    {
        return " Toyota--->brake()";
    }
}

//creating the Ford sub class which extends base class car
class Ford extends Car
{
     //initializing the parameterized constructor
    Ford(int c, String n)
    {
         //calling the super class constructor
        super(c,  n);
    }

    // overriding the startEngine method of the base class car
     String startEngine()
    {
        return " Ford--->startEngine()";
    }

    
    // overriding the accelerate method of the base class car
     String accelerate()
    {
        return " Ford--->accelerate()";
    }

      
    // overriding the brake method of the base class car
     String brake()
    {
        return " Ford--->brake()";
    }
}

//Creating the main demo class for cars
class Cars
{
    public static void main(String args[])
    {
        // creating the individual objects for Car class, Honda class, Toyota class, Ford class
        Car car = new Car(8, "Base Car");
        Honda honda= new Honda(6, "Honda Accord");
        Toyota toyota= new Toyota(4,"Toyota RAV4");
        Ford ford = new Ford(8,"Ford Truck F-250");

        // creating an array of objects for the Car class
        Car ArrayCars[]= new Car[4];

        // initializing individual objects to the array
        ArrayCars[0]=car;
        ArrayCars[1]=honda;
        ArrayCars[2]=toyota;
        ArrayCars[3]=ford;

        // iterating in the for loop to call the methods and display them
        for (int i =0; i< ArrayCars.length; i++)
        {
            System.out.println(ArrayCars[i].startEngine());
            System.out.println(ArrayCars[i].accelerate());
            System.out.println(ArrayCars[i].brake());
            
        }
    }
}