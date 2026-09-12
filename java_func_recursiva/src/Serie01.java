import javax.swing.JOptionPane;

/* Serie1 = (1+2+3+ ... +100) */

public class Serie01 {

    public static void main (String[] args) {

        int num=100;

        JOptionPane.showMessageDialog(null, "Soma = "+FuncRecursiva(num));
    } // Fim Main

    static int FuncRecursiva(int n) {

        int soma=0;

        // Recursividade
        if (n>1)
        {
            soma = n + (FuncRecursiva(n-1));
            return soma;
        }
        else
        {
            return 1;
        }
    }// Fim Função
}
