
public class Bebedor
{
    //nombre bebedor
    private String name;
    //nivel alcohol en sangre
    private int drinkLevel;
   //limite
    private int maximo;
    //dinero
    private int dinero;
    public Bebedor(String name, int maximo, int dinero)
    {
        this.name = name;
        drinkLevel = 0;
        this.maximo = maximo;
        this.dinero = dinero;
    }
    
    public int getLevel()
    {
        return drinkLevel;
    }
    
    /**
     * tomar una copa 
     */
    public void beberCopa(Cubata copa)
    {
      if (drinkLevel < (maximo +1)){
          int nivel = copa.getAlcohol();
          drinkLevel = drinkLevel + nivel;
          dinero = dinero - copa.getPrecio();
      }
      else
      {
         System.out.println("LLAMAME UN TAXI ANDRES");  
      }
    }
         
    /**
     * preguntas y respuestas en relación a la cantidad de alcohol en sangre 
     */
    public  void  contesta (String pregunta)
    {
          int letras = pregunta.length();
          int par = letras % 2;
          
          if (drinkLevel < (maximo +1)){
              if(par == 0){
                System.out.println("si");
              }
              else
              {
                System.out.println("no");
              }
          }
          else{
              if(drinkLevel > (maximo + 1 ) || pregunta.contains(name))
              {
                  System.out.println(pregunta.toUpperCase());
              }
                           
          }
             
    }
      

    /**
     * metodo que si supera el limite de alcohol en sangre se llama a un taxi y si no lo supera el camarero le permite conducir
     */
    public void llamaUnTaxi( int precioTaxi)
    {
        
        int taxi = precioTaxi;
        if (drinkLevel < (maximo + 1 ) ){
        
            System.out.println(" tu nivel de alcohol en sangre es menor que el maximo para conducir, tomo las llaves");
        }
        else
        {
            if(drinkLevel > maximo && dinero >= taxi){
                System.out.println(" NO PUEDES CONDUCIR TE LLAMO UN TAXI");
            
            }
            else{
                System.out.println("no tienes dinero para un taxi");
            }
        }
        
    
    }
}
