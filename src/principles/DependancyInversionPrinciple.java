package principles;

interface ElectronicDevice{
	public void charged();
}
class Charger implements ElectronicDevice{
	@Override
	public void charged() {
		 System.out.println("i am a charger");
	 }
}
class Mobile {
	public void mobile(ElectronicDevice e) {
		
	e.charged();
	System.out.println("mobile getting chargered");
	}
	
	
	
}
public class DependancyInversionPrinciple {
             public static void main(String[] args) {
            	 Charger c=new Charger();
            	 Mobile m=new Mobile();
            	 m.mobile(c);
            	
             }
             
}


