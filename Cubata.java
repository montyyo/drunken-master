
public class Cubata
{
    //nombre copa
    private String nameAlcohol;
    //cantidad de alcohol
    private int cantAlcohol;
    //precio copa
    private int precioCopa;
    /**
     * constructor
     */
    public Cubata(String nameAlcohol, int  cantAlcohol , int precioCopa)
    {
        this.nameAlcohol = nameAlcohol;
        this.cantAlcohol = cantAlcohol;
        this.precioCopa = precioCopa;
    }
    
    /**
     * nivel de alcohol
     */
    public int getAlcohol()
    {
      return cantAlcohol;
    }
    
   /**
    * precio de las copas
    */
   public int getPrecio()
   {
       return precioCopa;
   }
    
}
