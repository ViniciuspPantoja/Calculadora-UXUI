package calculadora;

/**
 * Classe que representa uma calculadora simples com operações básicas.
 * Suporta as operações de adição, subtração, multiplicação e divisão.
 * Inclui tratamento de erros para operações inválidas e divisão por zero.
 */
public class Calculadora {


    /**
     * Realiza a adição de dois números inteiros.
     * 
     * @param a Primeiro operando
     * @param b Segundo operando
     * @return A soma de a e b
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     * 
     * @param a Minuendo
     * @param b Subtraendo
     * @return A diferença entre a e b
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros.
     * 
     * @param a Primeiro fator
     * @param b Segundo fator
     * @return O produto de a e b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números inteiros.
     * 
     * @param a Dividendo
     * @param b Divisor (não pode ser zero)
     * @return O quociente da divisão inteira de a por b
     * @throws ArithmeticException Se o divisor for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: divisão por zero!");
        }
        return a / b;
    }

    /**
     * Executa uma operação matemática entre dois números inteiros.
     * 
     * @param a Primeiro operando
     * @param b Segundo operando
     * @param op Operação a ser realizada ("+", "-", "*", "/")
     * @return O resultado da operação
     * @throws IllegalArgumentException Se a operação fornecida não for suportada
     * @throws ArithmeticException Se ocorrer divisão por zero
     */
    public int calc(int a, int b, String op) {

        switch (op) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return dividir(a, b);
            default:
                throw new IllegalArgumentException("Operação inválida: " + op);
        }
    }
}