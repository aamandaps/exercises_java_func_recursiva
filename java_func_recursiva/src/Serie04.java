import javax.swing.JOptionPane;

/* Serie4 = (N/1) +(N-1/2 ) + (N-2/ 3) + .... + (1/N) */

public class Serie04 {

    public static void main (String[] args) {

        int num;
        int den=1;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        JOptionPane.showMessageDialog(null, "Soma = "+ String.format("%.2f", FuncRecursiva(num, den)));
    } // Fim Main

    static double FuncRecursiva(int n,int d) { // Dois parâmetros estão sendo passados, n=numerador e d=denominador

        double soma;

        // Recursividade
        if (n!=1)
        {
            soma = (double) n/d + FuncRecursiva(n-1, d+1); // O numerador vai ser decrementado e o denominador incrementado
            return soma;
        }
        else
        {
            return 1.0/d; // Vai retornar a divisão, pra não perder o valor de d quando n já for == 1
        }
    } // Fim Função
}
