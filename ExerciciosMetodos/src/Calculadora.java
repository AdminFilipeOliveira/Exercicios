/*
 * Cria uma aplicação que resolva as seguintes situações:
Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.
Calcule o valor final de um empréstimo, a partir
     do valor solicitado. Taxas e parcelas influenciam.
     Defina arbitrariamente as faixas que influenciam
     nos valores.

Observações:
Tente ao máximo criar métodos que trabalhem sozinhos ou em conjunto
Pode chamar um método dentro de outro
Pode passar como parâmetro, a chamada de um outro método.
 */



public class Calculadora {

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void  divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }

}