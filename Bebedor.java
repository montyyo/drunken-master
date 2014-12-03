
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
     * tomar una copa sin sobrepasar limite
     */
    public void beberCopa(Cubata copa)
    {
      if (drinkLevel < (maximo +1)){
          int nivel = copa.getAlcohol();
          drinkLevel = drinkLevel + nivel;
      }
      else
      {
         System.out.println("LLAMAME UN TAXI ANDRES");  
      }
    }
    
    
    /**
     * preguntas
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
              System.out.println(pregunta.toUpperCase()); 
          }
             
    }
          
    
}
