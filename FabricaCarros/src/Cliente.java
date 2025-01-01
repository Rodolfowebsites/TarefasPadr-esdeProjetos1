import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à locadora de carros!");
        System.out.println("Escolha a montadora:");
        System.out.println("1. Ford");
        System.out.println("2. Toyota");
        System.out.println("Digite sua escolha: ");
        int escolhaMontadora = scanner.nextInt();

        FabricaDeCarros fabrica;
        if (escolhaMontadora == 1) {
            fabrica = new FordFabrica();
        } else if (escolhaMontadora == 2) {
            fabrica = new ToyotaFabrica();
        } else {
            System.out.println("Opção inválida. Encerrando o programa.");
            return;
        }

        System.out.println("Escolha o tipo de carro:");
        System.out.println("1. Sedan");
        System.out.println("2. SUV");
        System.out.println("Digite sua escolha: ");
        int escolhaTipo = scanner.nextInt();

        Car carroEscolhido;
        if (escolhaTipo == 1) {
            carroEscolhido = fabrica.criarSedan();
        } else if (escolhaTipo == 2) {
            carroEscolhido = fabrica.criarSUV();
        } else {
            System.out.println("Opção inválida. Encerrando o programa.");
            return;
        }

        System.out.println("Quantos dias você deseja alugar o carro?");
        System.out.println("Digite o número de dias: ");
        int dias = scanner.nextInt();

        // Exibir informações do carro e calcular o custo total
        System.out.println("\nVocê escolheu o seguinte carro:");
        carroEscolhido.exibirInfo();
        double custoTotal = carroEscolhido.getPrecoAluguel() * dias;
        System.out.printf("Custo total do aluguel por %d dias: R$ %.2f%n", dias, custoTotal);

        scanner.close();
    }
}
