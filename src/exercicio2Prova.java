import javax.swing.*;

public class exercicio2Prova {
    public static void main(String[] args) {

        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor"));
        double menorValor = valor;
        double maiorValor = valor;

        for (int i = 1; i < 5; i++) {
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor"));
            if (valor > maiorValor) {
                maiorValor = valor;
            }
            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }
}
