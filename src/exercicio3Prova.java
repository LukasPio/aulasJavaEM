import javax.swing.*;

public class exercicio3Prova {
    public static void main(String[] args) {
        int maiorIdade = 0;
        int contadorDePessoas = 0;

        for (int i = 0; i < 23000; i++) {
            String sexo = JOptionPane.showInputDialog(null, "Digite F para feminino e M para masculino");
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));
            String corCabelo = JOptionPane.showInputDialog(null, "Digite a cor do seu cabelo");
            String corOlho = JOptionPane.showInputDialog(null, "Digite a cor dos seus olhos");

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (sexo.equals("f") && idade >= 18 && idade <= 35 && corCabelo.equals("loiro") && corOlho.equals("verde")) {
                contadorDePessoas++;
            }
        }

        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Número de mulheres, com idade entre 18 e 35, olhos verdes e cabelos loiros: " + contadorDePessoas);
    }
}
