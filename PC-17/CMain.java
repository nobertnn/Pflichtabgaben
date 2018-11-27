public class CMain { 
    public static void main(String[] p_args) 
    { 
 
       IFahrzeug car = new CAuto(); 
       IFahrzeug suv = new CSuv();  
        car.beschleunige(1);  
        car.bremse(2); 
        car.schalte(3); 
        suv.beschleunige(4); 
         suv.bremse(5); 
         suv.schalte(6); 
    }  
} 
