package principles;

//class SerpantEagle {
//    void eat() {
//        System.out.println("Serpant eats only sea food");
//    }
//    void fly() {
//        System.out.println("Eagle flies");
//    }
//}
//
//class GoldenEagle {
//    void eat() {
//        System.out.println("Golden eats fresh food");
//    }
//    void fly() {
//        System.out.println("Eagle flies");
//    }
//}
//
//class BirdFamily {
//    void birdfly(Object bird) {
//        if (bird instanceof SerpantEagle) {
//            SerpantEagle serpantEagle = (SerpantEagle) bird;
//            serpantEagle.eat();
//            serpantEagle.fly();
//        } else if (bird instanceof GoldenEagle) {
//            GoldenEagle goldenEagle = (GoldenEagle) bird;
//            goldenEagle.eat();
//            goldenEagle.fly();                                                                 //Without OCP PRinciple.
//        }
//        // Every time a new bird type is added, we need to modify this method
//    }
//}
//
//public class WithoutOCP {
//    public static void main(String[] args) {
//        SerpantEagle s1 = new SerpantEagle();
//        GoldenEagle g1 = new GoldenEagle();
//        BirdFamily bb = new BirdFamily();
//        
//        bb.birdfly(g1);
//        bb.birdfly(s1);
//    }
//}


abstract class Bird{
	abstract void eat();
	 abstract void fly();
}
abstract class Eagle extends Bird{
	 @Override
	void fly() {
		System.out.println("Eagle flies");
		
	}
}
class SerpantEagle extends Eagle{
	 @Override
	void eat() {
		System.out.println("serpant eats only sea food");
		
	}
}
class GoldenEagle extends Eagle{
	 @Override
	void eat() {
		System.out.println("gloden eats fresh food");
		
	}
}
class BirdFamily {
	void birdfly(Bird b){
		 b.eat();
		 b.fly();
		 
	}                                                                         //with ocp Principle
	
}



public class OpenClosedPrincipleOCP {
	  public static void main(String[] args) {
	       	 SerpantEagle s1=new SerpantEagle();
	       	 GoldenEagle g1=new GoldenEagle();
	       	 BirdFamily bb=new BirdFamily();
	       	 bb.birdfly(g1);
	       	 bb.birdfly(s1);
	       	 
	        }
}
