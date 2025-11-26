package calculadora;

/**
 * <h2>Calculadora Aritmética</h2>
 * 
 * <p>Classe que implementa uma calculadora com operações aritméticas básicas.
 * Desenvolvida como parte de um projeto educacional para demonstração de boas práticas
 * de programação em Java, incluindo tratamento de erros e documentação.</p>
 *
 * <p><b>Operações Suportadas:</b></p>
 * <ul>
 *   <li>Adição (+)</li>
 *   <li>Subtração (-)</li>
 *   <li>Multiplicação (*)</li>
 *   <li>Divisão (/)</li>
 * </ul>
 *
 * <p><b>Tratamento de Erros:</b></p>
 * <ul>
 *   <li>Divisão por zero</li>
 *   <li>Operação inválida</li>
 * </ul>
 *
 * <p><b>Exemplo de Uso:</b></p>
 * <pre>
 * {@code
 * Calculadora calc = new Calculadora();
 * int resultado = calc.calc(10, 5, "+");  // Retorna 15
 * }
 * </pre>
 *
 * @author Vinícius Pantoja
 * @version 1.0
 * @since 2025-11-25
 */
public class Calculadora {


    /**
     * Realiza a operação de adição entre dois números inteiros.
     * <p>
     * Este método realiza uma operação de adição simples entre dois números inteiros.
     * Não há restrições quanto ao valor dos operandos, e o resultado será a soma
     * aritmética convencional dos dois números.
     *
     * <p><b>Exemplo:</b>
     * <pre>
     * {@code
     * int resultado = somar(3, 4);  // Retorna 7
     * }
     * </pre>
     *
     * @param a Primeiro operando (adicionando)
     * @param b Segundo operando (adicionador)
     * @return A soma de a e b
     * @see #calc(int, int, String)
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a operação de subtração entre dois números inteiros.
     * <p>
     * Este método subtrai o segundo número (b) do primeiro (a) e retorna o resultado.
     * O resultado pode ser negativo se o subtraendo for maior que o minuendo.
     *
     * <p><b>Exemplo:</b>
     * <pre>
     * {@code
     * int resultado = subtrair(10, 4);  // Retorna 6
     * int negativo = subtrair(5, 8);    // Retorna -3
     * }
     * </pre>
     *
     * @param a Minuendo (número do qual se subtrai)
     * @param b Subtraendo (número que se subtrai)
     * @return A diferença entre a e b (a - b)
     * @see #calc(int, int, String)
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a operação de multiplicação entre dois números inteiros.
     * <p>
     * Este método calcula o produto de dois números inteiros. O resultado é
     * a multiplicação convencional dos dois números, com tratamento adequado
     * para números negativos e zero.
     *
     * <p><b>Exemplo:</b>
     * <pre>
     * {@code
     * int resultado = multiplicar(5, 6);   // Retorna 30
     * int comNegativo = multiplicar(-3, 4); // Retorna -12
     * int porZero = multiplicar(7, 0);     // Retorna 0
     * }
     * </pre>
     *
     * @param a Primeiro fator
     * @param b Segundo fator
     * @return O produto de a e b
     * @see #calc(int, int, String)
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a operação de divisão inteira entre dois números.
     * <p>
     * Este método realiza uma divisão inteira do dividendo (a) pelo divisor (b).
     * A divisão por zero não é permitida e resultará em uma exceção.
     * 
     * <p><b>Comportamento:</b>
     * <ul>
     *   <li>Se b for zero, lança uma ArithmeticException</li>
     *   <li>Se a for divisível por b, retorna o quociente exato</li>
     *   <li>Se a não for divisível por b, retorna o piso da divisão (arredondamento para baixo)</li>
     * </ul>
     *
     * <p><b>Exemplo:</b>
     * <pre>
     * {@code
     * int resultado = dividir(10, 2);   // Retorna 5
     * int arredondado = dividir(7, 3);  // Retorna 2 (não 2.333...)
     * int erro = dividir(5, 0);        // Lança ArithmeticException
     * }
     * </pre>
     *
     * @param a Dividendo (número a ser dividido)
     * @param b Divisor (número pelo qual se divide, deve ser diferente de zero)
     * @return O quociente inteiro da divisão de a por b
     * @throws ArithmeticException Se o divisor for zero
     * @see #calc(int, int, String)
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: divisão por zero!");
        }
        return a / b;
    }

    /**
     * Método principal que executa operações matemáticas baseado no operador fornecido.
     * <p>
     * Este método atua como um roteador que delega a operação matemática apropriada
     * com base no parâmetro 'op'. É o método mais versátil da classe, permitindo
     * a execução de qualquer operação suportada através de uma única chamada.
     *
     * <p><b>Operações Suportadas:</b>
     * <table class="striped">
     * <caption>Operações Suportadas</caption>
     * <tr><th>Operação</th><th>Símbolo</th><th>Descrição</th></tr>
     * <tr><td>Adição</td><td>+</td><td>{@link #somar(int, int)}</td></tr>
     * <tr><td>Subtração</td><td>-</td><td>{@link #subtrair(int, int)}</td></tr>
     * <tr><td>Multiplicação</td><td>*</td><td>{@link #multiplicar(int, int)}</td></tr>
     * <tr><td>Divisão</td><td>/</td><td>{@link #dividir(int, int)}</td></tr>
     * </table>
     *
     * <p><b>Exemplo de Uso:</b>
     * <pre>
     * {@code
     * Calculadora calc = new Calculadora();
     * int soma = calc.calc(10, 5, "+");      // Retorna 15
     * int diferenca = calc.calc(10, 5, "-"); // Retorna 5
     * int produto = calc.calc(10, 5, "*");    // Retorna 50
     * int quociente = calc.calc(10, 5, "/");  // Retorna 2
     * int erro = calc.calc(10, 0, "/");       // Lança ArithmeticException
     * int invalido = calc.calc(1, 2, "x");    // Lança IllegalArgumentException
     * }
     * </pre>
     *
     * @param a Primeiro operando
     * @param b Segundo operando
     * @param op Operador que define a operação a ser realizada ("+", "-", "*", "/")
     * @return O resultado da operação especificada
     * @throws IllegalArgumentException Se o operador fornecido não for suportado
     * @throws ArithmeticException Se ocorrer uma divisão por zero
     * @see #somar(int, int)
     * @see #subtrair(int, int)
     * @see #multiplicar(int, int)
     * @see #dividir(int, int)
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