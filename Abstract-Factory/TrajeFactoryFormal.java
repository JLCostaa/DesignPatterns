package maiin;
public class TrajeFactoryFormal extends FactoryRoupa{

    @Override
    public RoupaTronco criaRoupaTronco() {
       
        return new Camisa();
    }

    @Override
    public RoupaPernas criaRoupaPernas() {
       
        return new Calca();
    }

    @Override
    public RoupaPes criaRoupaPes() {
       
        return new Sapato();
    }

}
