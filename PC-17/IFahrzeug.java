public class CAuto implements IFahrzeug
{
  // --- Eigenschaften ---
  // --- Konstruktoren ---
  // --- Methoden / Verhalten ---

  @Override
  public void schalte( final int p_gang )
  {
      m_gang = p_gang % (m_anzahlGaenge + 1);
      m_gang = m_gang < 0 ? 0 : m_gang;
  }

  @Override
  public void beschleunige( final int p_inkrement )
  {
      m_aktGeschwindigkeit += p_inkrement;
      m_aktGeschwindigkeit = m_aktGeschwindigkeit > m_maxGeschwindigkeit ? m_maxGeschwindigkeit : m_aktGeschwindigkeit;
  }

  @Override
  public void bremse( final int p_dekrement )
  {
      m_aktGeschwindigkeit -= p_dekrement;
      m_aktGeschwindigkeit = m_aktGeschwindigkeit < 0 ? 0 : m_aktGeschwindigkeit;
  }
}
public interface IFahrzeug
{
  void schalte( final int p_gang );
  void beschleunige( final int p_inkrement );
  void bremse( final int p_dekrement );
}