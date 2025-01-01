public class FordSUV implements Car{
    @Override
    public void exibirInfo() {
        System.out.println("Ford SUV - Modelo Explorer");
    }

    @Override
    public double getPrecoAluguel() {
        return 350.0; //preço por dia
    }
}
