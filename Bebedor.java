
public class Bebedor
{
    //nombre
    private String name;
    //nivel alcohol en sangre
    private int drinkLevel;
   //limite
    private int maximo;
    public Bebedor(String name, int maximo)
    {
        this.name = name;
        drinkLevel = 0;
        this.maximo = maximo;
    }
    
    /**
     * tomar una copa
     */
    public void beberCopa(Cubata copa)
    {
      if (drinkLevel < maximo){
          int nivel = copa.getAlcohol();
          drinkLevel = drinkLevel + nivel;
      }
      else
      {
         System.out.println("LLAMAME UN TAXI ANDRES");  
      }
    }
}
