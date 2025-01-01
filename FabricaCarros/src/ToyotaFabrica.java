public class ToyotaFabrica implements FabricaDeCarros{

    @Override
    public Car criarSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Car criarSUV(){
        return new ToyotaSUV();
    }
}
