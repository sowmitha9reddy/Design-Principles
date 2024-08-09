package principles;

 class Vehicle {
    public void drive() {
        System.out.println("Driving...");
    }
    //abstract void refuel();
    
}
 class Car extends Vehicle {
	    @Override
	    public void drive() {
	        System.out.println("Car is driving...");
	    }

	    public void refuel() {
	        System.out.println("Refueling the car...");
	    }
	}
 class Bicycle extends Vehicle {
	    @Override
	    public void drive() {
	        System.out.println("Bicycle is riding...");
	    }

//	    // Bicycles do not refuel
//	    public void refuel() {                                       // Do not make sense
//	    		        
//	    }
	}

public class LiskovSubstitutionPrincipleLSP {
	
		   public static void main(String[] args) {
		       Vehicle car = new Car();
		       Vehicle bicycle = new Bicycle();

		       car.drive();     
		       bicycle.drive(); 

		      
		       ((Car) car).refuel();    
		       ((Car) bicycle).refuel(); 
		   }
		

}




