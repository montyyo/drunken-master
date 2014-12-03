
public class Cubata
{
    //nombre copa
    private String nameAlcohol;
    //cantidad de alcohol
    private int cantAlcohol;
    
    /**
     * constructor
     */
    public Cubata(String nameAlcohol, int  cantAlcohol)
    {
        this.nameAlcohol = nameAlcohol;
        this.cantAlcohol = cantAlcohol;
    }
    
    /**
     * nivel de alcohol
     */
    public int getAlcohol()
    {
      return cantAlcohol;
    }
    
   
    
}
