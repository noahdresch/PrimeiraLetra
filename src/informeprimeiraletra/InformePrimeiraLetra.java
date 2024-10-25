/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package informeprimeiraletra;

/**
 *
 * @author Noa
 */
public class InformePrimeiraLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ler 10 nomes de pessoa. Armazenar em um vetor.
        // Escrever o vetor lido.
        // Em seguida, escrever a primeira letra de cada nome.
        
        String nomes[] = new String[10];
        
        // ler o vetor = encher o vetor com dados
        for (int i = 0; i < 10; i++) {
            nomes[i] = Entrada.leiaString("Informe um nome: " + "(" + i + ")");
        }
        
        //imprimir 1° letra
        for (int i = 0; i < 10; i++) {
            System.out.println(nomes[i].charAt(0));
        }
        
        
        System.exit(0);
    }
    
}
