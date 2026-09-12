import javax.swing.JOptionPane;

/* Serie2 = (N) + (N-1) + (N-2) + ... + (1) */

public class Serie02 {

    public static void main (String[] args) {

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        JOptionPane.showMessageDialog(null, "Soma = "+ FuncRecursiva(num));

    } // Fim Main

    static int FuncRecursiva(int n) {

        int soma=0;

        // Recursividade
        if (n!=1)
        {
            soma =  n + FuncRecursiva(n-1); // Soma vai armazenas N + ele mesmo subtraindo 1
            return soma;
        }
        else
        {
            return 1;
        }
    }

}
