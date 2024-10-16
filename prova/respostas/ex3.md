Exercício 3: 

class Calculadora {
    // Método para somar
    public double somar(double a, double b) {
        return a + b;
    }

    // Método para subtrair
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double num1 = 25;
        double num2 = 10;

        System.out.println("Somar: " + calculadora.somar(num1, num2));
        System.out.println("Subtrair: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicar: " + calculadora.multiplicar(num1, num2));
        
        try {
            System.out.println("Dividir: " + calculadora.dividir(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // Testando divisão por zero
        try {
            System.out.println("Dividir por zero: " + calculadora.dividir(num1, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}