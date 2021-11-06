
package Comparacao;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        
        Livro livro1 = new Livro("Livrão");
        Livro livro2 = new Livro("Livrinho");
        Livro livro3 = new Livro("Livrario");
        Livro livro4 = new Livro("Livraço");
        Livro livro5 = new Livro("Livrurium");
        
        lista.adicionar(livro1);
        lista.adicionar(livro2);
        lista.adicionar(livro3);
        lista.adicionar(livro4);
        lista.adicionar(livro5);
        
       while (true) {
           String resp = "";
            switch(JOptionPane.showInputDialog("O que você deseja fazer?\n"
                                              + "adiocionar\n"
                                              + "remover\n"
                                              + "listar\n")) {
                case "adicionar":       //Float.parseFloat
                    Livro livro = new Livro((JOptionPane.showInputDialog("Qual é o valor?")));
                    lista.adicionar(livro);
                    break;
                case "remover":
                    lista.remover(JOptionPane.showInputDialog("qual livro será removido?"));
                    break;
                case "listar":                
                    lista.listar();
            if (resp.toLowerCase().equals("n")) {
                break;
            }
       }
        
        /*
        System.out.println("Primeira listagem");
        lista.listar();
        
        //lista.remover(livro1);
        System.out.println(" ");
        System.out.println("Segunda listagem");
        lista.listar();
        
        System.out.println(" ");
        System.out.print("Primerio Livro da lista: ");
        lista.getCabeca().dados();
        System.out.print("Último Livro da lista: ");
        lista.getCauda().dados();
*/
    }
 }
}
