public class FordSedan implements Car {
    @Override
    public void exibirInfo() {
        System.out.println("Ford Sedan - Modelo Focus");
    }

    @Override
    public double getPrecoAluguel() {
        return 200.0; // preco por dia
    }
}
