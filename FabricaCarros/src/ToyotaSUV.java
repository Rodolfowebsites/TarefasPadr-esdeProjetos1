public class ToyotaSUV implements Car{
    @Override
    public void exibirInfo () {
        System.out.println("Toyota SUV - Modelo RAV4");
    }

    @Override
    public double getPrecoAluguel() {
        return 320.0;
    }
}
