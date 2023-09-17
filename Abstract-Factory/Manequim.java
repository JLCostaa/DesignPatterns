package maiin;
public class Manequim {
    RoupaTronco tronco;
    RoupaPernas pernas;
    RoupaPes pes;
    public Manequim() {
        System.out.println("Manequim sem roupa");
    }

    public void colocarRoupa(FactoryRoupa trajeRoupa){
        System.out.println("Manequim com roupa");
        this.tronco = trajeRoupa.criaRoupaTronco();
        this.pernas = trajeRoupa.criaRoupaPernas();
        this.pes = trajeRoupa.criaRoupaPes();
    }
    
}
