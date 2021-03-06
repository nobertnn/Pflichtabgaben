public class CSuv extends CAuto
{
    private final boolean m_offroadFahrbar;
    private final String m_seriennummer;
    private static int zahl1;
    private static int zahl2;

     public CSuv()
    {
        // ruft den SUV Konstruktor auf
      this( "rot", "VW", 60, 5, 250, false );
     }

     public CSuv( final boolean p_offroadFahrbar )
     {
       // ruft den SUV Konstruktor auf
      this( "rot", "VW", 60, 5, 250, p_offroadFahrbar );
      }

     public CSuv( final String p_farbe, final String p_marke, final double p_kw, final int p_anzahlGaenge, final int p_maxGeschwindigkeit, final boolean p_offroadFahrbar )
     {
      // Aufruf des Konstruktur von CAuto
      super( p_farbe, p_marke, p_kw, p_anzahlGaenge, p_maxGeschwindigkeit );
      m_offroadFahrbar = p_offroadFahrbar;
      this.m_seriennummer = zahl2+"-"+zahl1;
      zahl1++;
      if(zahl1>9)
      {
          zahl1=0;
          zahl2++;
      }
     }
     public String getOffroad()
     {
         if(this.m_offroadFahrbar == true)
         {
             return "Das Auto hat Allrad.";
         }
         else
         {
             return "Das Auto ist nicht für Offroadfahrten geeignet.";
         }
     }
     public String getSer()
     {
         return this.m_seriennummer;
     }
     @Override
     public String toString() {
		String ausgabe ="Dies ist ein "+m_farbe+"es SUV der Marke "+m_marke+".\n";
		ausgabe = ausgabe + "Es hat "+m_anzahlGaenge+" Gaenge und eine Leistung von "+m_kw+" kW.\n";
		ausgabe = ausgabe + "Das SUV hat eine Spitzengeschwindigkeit von "+ m_maxGeschwindigkeit+".\n";
        ausgabe = ausgabe + "Es faehrt aktuell "+m_aktGeschwindigkeit + " im "+ m_gang +". Gang .\n";
        if(this.m_offroadFahrbar == true)
        {
            ausgabe = ausgabe + "Es kann Offroad fahren.\n";
        }
        else
        {
            ausgabe = ausgabe + "Es kann  nicht Offroad fahren.\n";
        }
		return ausgabe;
	}
  }
