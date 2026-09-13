import javax.swing.JOptionPane;

/* Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)! */

public class Serie05 {

    public static void main (String[] args) {

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        JOptionPane.showMessageDialog(null, "Soma = "+  FuncSoma(num));
    } // Fim Main

// A partir daqui, duas funções recursivas vão ser utilizadas, uma vai chamar a outra.

    static int FuncSoma(int n) {

        int soma;

        // Recursividade
        if (n!=1)
        {
            // A função da soma vai pausar e só vai voltar depois que receber o retorno da função do fatorial
            soma = FuncFatorial(n) + FuncSoma(n-1); // soma = fatorial + chamada do n-1
            return soma;
        }
        else
        {
            return 1;
        }
    } // Fim Função Recursiva da Soma

    static int FuncFatorial(int n) {

        int fat;

        if (n!=1)
        {
            // Recursividade
            fat = n * FuncFatorial(n-1); // fatorial = n * chamada(n-1)
            return fat;
        }
        else
        {
            return 1;
        }
    } // Fim Função Recursiva do Fatorial
}
