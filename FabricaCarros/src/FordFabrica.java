public class FordFabrica implements FabricaDeCarros{

    @Override
    public Car criarSedan() {
        return new FordSedan();
    }

    @Override
    public Car criarSUV(){
        return new FordSUV();
    }
}
