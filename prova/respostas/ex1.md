Exercício 1: 

class Pessoa {
    private double altura;
    private double peso;

    public Pessoa(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double calculeIMC() {
        return peso / (altura * altura); // Calcula o IMC
    }

    public String getPesoStatus() {
        double imc = calculeIMC();
        if (imc < 18.5) {
            return "ABAIXO_DO_PESO";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "PESO_NORMAL";
        } else {
            return "SOBREPESO";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = null;
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Encerrar programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a altura da pessoa (em metros): ");
                    double altura = scanner.nextDouble();

                    double peso;
                    while (true) {
                        System.out.print("Digite o peso da pessoa (em kg): ");
                        peso = scanner.nextDouble();
                        if (peso < 0 || peso > 200) {
                            System.out.println("Peso inválido, digite novamente.");
                        } else {
                            break;
                        }
                    }

                    pessoa = new Pessoa(altura, peso);
                    System.out.println("Status: " + pessoa.getPesoStatus());
                    break;

                case 2:
                    running = false;
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}








