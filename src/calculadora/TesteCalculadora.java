package calculadora;

/**
 * <h1>Teste da Classe Calculadora</h1>
 * 
 * <p>Classe de demonstração que testa as funcionalidades da classe {@link Calculadora}.
 * Este programa executa uma série de testes automatizados para validar o comportamento
 * das operações aritméticas implementadas, incluindo tratamento de erros.</p>
 *
 * <p><b>Cenários de Teste:</b></p>
 * <ul>
 *   <li>Operações básicas (adição, subtração, multiplicação, divisão)</li>
 *   <li>Tratamento de divisão por zero</li>
 *   <li>Tratamento de operação inválida</li>
 * </ul>
 *
 * <p><b>Saída Esperada:</b></p>
 * <pre>
 * 2 + 3 = 5
 * 10 - 4 = 6
 * 3 * 5 = 15
 * 20 / 4 = 5
 * Erro capturado: Erro: divisão por zero!
 * Erro capturado: Operação inválida: x
 * </pre>
 *
 * @author Vinícius Pantoja
 * @version 1.0
 * @see Calculadora
 * @since 2023-11-25
 */
public class TesteCalculadora {

    /**
     * Ponto de entrada principal para o programa de teste da calculadora.
     * <p>
     * Este método executa uma série de testes na classe {@link Calculadora} para demonstrar
     * seu funcionamento e verificar o tratamento de erros. Cada operação é executada
     * dentro de um bloco try-catch para capturar e exibir quaisquer exceções que possam ocorrer.
     *
     * <p><b>Fluxo de Execução:</b>
     * <ol>
     *   <li>Cria uma instância de {@link Calculadora}</li>
     *   <li>Executa operações de teste</li>
     *   <li>Exibe os resultados no console</li>
     *   <li>Captura e trata exceções para operações inválidas</li>
     * </ol>
     *
     * <p><b>Notas de Implementação:</b>
     * <ul>
     *   <li>Usa blocos try-catch individuais para cada operação para garantir que
     *       uma falha em um teste não impeça a execução dos demais.</li>
     *   <li>Inclui exemplos de operações válidas e inválidas para fins de demonstração.</li>
     *   <li>Formata a saída para melhor legibilidade no console.</li>
     * </ul>
     *
     * @param args Argumentos de linha de comando (não utilizados)
     *
     * @see Calculadora#calc(int, int, String)
     * @see ArithmeticException
     * @see IllegalArgumentException
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