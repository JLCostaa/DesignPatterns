package maiin;

public class TrajeFactoryCasual extends FactoryRoupa{

    @Override
    public RoupaTronco criaRoupaTronco() {
        
        return new Camiseta();
    }

    @Override
    public RoupaPernas criaRoupaPernas() {
        
        return new Bermuda();
    }

    @Override
    public RoupaPes criaRoupaPes() {
       
        return new Chinelo();
    }

}
