package calculadora;

/**
 * Classe de teste para demonstrar o funcionamento da classe Calculadora.
 * Realiza uma série de operações matemáticas e exibe os resultados no console.
 */
public class TesteCalculadora {

    /**
     * Método principal que executa os testes da calculadora.
     * 
     * @param args Argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        try {
            System.out.println("2 + 3 = " + calc.calc(2, 3, "+"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("10 - 4 = " + calc.calc(10, 4, "-"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("3 * 5 = " + calc.calc(3, 5, "*"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("20 / 4 = " + calc.calc(20, 4, "/"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Divisão por zero
        try {
            System.out.println("10 / 0 = " + calc.calc(10, 0, "/"));
        } catch (Exception e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        // Operação inválida
        try {
            System.out.println(calc.calc(5, 5, "x"));
        } catch (Exception e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
    }
}