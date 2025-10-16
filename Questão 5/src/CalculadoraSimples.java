import javax.swing.JOptionPane;

public class CalculadoraSimples {
    public static void main(String[] args) {
        try {
            
            String input1 = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
            double num1 = Double.parseDouble(input1);

            String input2 = JOptionPane.showInputDialog(null, "Digite o segundo número:");
            double num2 = Double.parseDouble(input2);
            
            String[] operacoes = {"+", "-", "×", "÷"};
            int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha a operação:",
                "Operação",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                operacoes,
                operacoes[0]
            );
            
            double resultado = 0;
            boolean operacaoValida = true;

            switch (escolha) {
                case 0: 
                    resultado = num1 + num2;
                    break;
                case 1:
                    resultado = num1 - num2;
                    break;
                case 2: 
                    resultado = num1 * num2;
                    break;
                case 3:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida!", "Erro", JOptionPane.ERROR_MESSAGE);
                        operacaoValida = false;
                    } else {
                        resultado = num1 / num2;
                    }
                    break;
                default:
                    operacaoValida = false;
                    JOptionPane.showMessageDialog(null, "Nenhuma operação válida foi selecionada.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
            
            if (operacaoValida) {
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Entrada inválida! Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}