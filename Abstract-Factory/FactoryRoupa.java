package maiin;
public abstract class FactoryRoupa {
    FactoryRoupa FabricaDeRoupa;
    public static FactoryRoupa getFactory(String tiporoupa){
        if(tiporoupa.equals("Formal")){
            return new TrajeFactoryFormal();
        }
        if(tiporoupa.equals("Casual")){
            return new TrajeFactoryCasual();
        }
        return null;
    }
    
    public abstract RoupaTronco criaRoupaTronco();
    public abstract RoupaPernas criaRoupaPernas();
    public abstract RoupaPes criaRoupaPes();
}
