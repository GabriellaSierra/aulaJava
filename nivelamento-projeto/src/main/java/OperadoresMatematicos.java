public class OperadoresMatematicos {
    public static void main(String[] args) {
        // Java:
        // =, -, +, %, +=, -=, ++, --

        Double numero1 = 42.0;
        Double numero2 = 2.0;

        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtração: " + (numero1 - numero2));
        System.out.println("Multiplicação: " + (numero1 * numero2));
        System.out.println("Divisão: " + (numero1 / numero2));

        Double resultadoPotencia = Math.pow(numero1, numero2);
        System.out.println("Potência: " + resultadoPotencia);

        // ou:
        // System.out.println("Potência: " + Math.pow(numero1, numero2));
    }
}
