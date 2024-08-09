package principles;
class Musician { 
    public void play() { 
        System.out.println("play"); 
    } 
} 
  
class Singer extends Musician { 
    public void sing() { 
        System.out.println("sing"); 
    } 
} 
  
class Drummer extends Musician { 
    public void drum() { 
        System.out.println("drum"); 
    } 
} 


class Singr { 
    public void sing() { 
        System.out.println("sing"); 
    } 
} 
  
class Drummr { 
    public void drum() { 
        System.out.println("drum"); 
    } 
} 
  
class SingerDrummer { 
    Singer singer = new Singer(); 
    Drummer drummer = new Drummer(); 
  
    public void play() { 
        singer.sing(); 
        drummer.drum(); 
    } 
} 

public class CompositionOverInhertiance {

}
