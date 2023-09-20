import javax.swing.*;

public class exercicio1Prova {
    public static void main(String[] args) {

        int mediaFilhos = 0, numeroFilhos, taxaSalarioEspecifico = 0;
        double maiorSalario = 0, mediaSalarial = 0, salario;



        for (int i=1;i<10;i++){
            numeroFilhos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de filhos seus"));
            salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu salário "));
            mediaSalarial += salario;
            mediaFilhos += numeroFilhos;
            if (maiorSalario<salario){
                maiorSalario =salario;
            }
            if (salario<=1680) {
                taxaSalarioEspecifico++;
            }
        }
            mediaSalarial /= 10;
            mediaFilhos /= 10;
        taxaSalarioEspecifico = (taxaSalarioEspecifico/10)*100;
        System.out.println(mediaFilhos);
        System.out.println(mediaSalarial);
        System.out.println(maiorSalario);
        System.out.println(taxaSalarioEspecifico);
    }
}
