public class ToyotaSedan implements Car{
    @Override
    public void exibirInfo() {
        System.out.println("Toyota Sedan - Modelo Corolla");
    }

    @Override
    public double getPrecoAluguel() {
        return 180.0;
    }
}
