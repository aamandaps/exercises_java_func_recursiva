import javax.swing.JOptionPane;

/* Serie3 = (1/1) + (1/2) + (1/3) + .... + (1/N) */

public class Serie03 {

    public static void main (String[] args) {

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        JOptionPane.showMessageDialog(null, "Soma = "+ String.format("%.2f", FuncRecursiva(num)) );
    } // Fim Main

    static double FuncRecursiva (int n) {

        double soma;

        // Recursividade
        if (n!=1)
        {
            soma =  1.0/n + (FuncRecursiva(n-1)); // Vai realizar a primeira divisão do 1 e depois alterar apenas o denominador. Soma vai armazenar tudo
            return soma;
        }
        else
        {
            return 1.0;
        }
    } // Fim Função

}
