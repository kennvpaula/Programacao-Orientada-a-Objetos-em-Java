/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolivro;

/**
 *
 * @author kenne
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Pessoa p [] = new Pessoa[2];
      p[0] = new Pessoa("Luana", 18, "f");
      p[1] = new Pessoa("Lucas", 21, "m");
      
        
      Livro l [] = new Livro[2];
      l[0] = new Livro("Minha vida", "Kennedy", 300, p[0] );
      l[1] = new Livro("Iphone", "Bill Gates", 450, p[1]);
        
      
        l[1].abrir();
        l[1].avancarPag();
        l[1].abrir();
        l[1].fechar();
        l[1].abrir();
        l[1].avancarPag();
        l[1].fechar();
        l[1].avancarPag();
}
}
