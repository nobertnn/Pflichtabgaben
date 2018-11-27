/*
 * @cond LICENSE
 * ######################################################################################
 * # Hausaufgabe3 27/11/2018                                                            #
 * #                                                                                    #
 * # Authored by Mengjie Zou/Jincheng Hu                                                #
 * ######################################################################################
 * @endcond
 */


/**
 * Test Mainmethode für hierarchische Typenvererbung
 * demonstriert Vewrwendung von instanceof und Casting bei Klassen mit Vererbung
 */

public class CMain
{
 

    public static void main( String[] args )
        {
        CAuto auto1 = new CSuv("rot", "golf", 6, 180, false);
        CAuto auto2 = new CAuto("gelb", "VW", 6, 220);
        IFahrzeug fox = auto2;
        IFahrzeug jeep;
        jeep = auto1;
        jeep.schalte(5);
        System.out.println(auto1.getGang());
        fox.schalte(3);
        System.out.println(auto2.getGang());
        

     // nutze diese Methode für die weiteren Teile der Aufgabe
    }
}