
package maiin;

public class Maiin {

   
    public static void main(String[] args) {
       FactoryRoupa trajeRoupa = FactoryRoupa.getFactory("Casual");
        Manequim manequim = new Manequim();
        manequim.colocarRoupa(trajeRoupa);
    }
    
}
