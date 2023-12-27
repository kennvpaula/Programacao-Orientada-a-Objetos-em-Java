/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;


/**
 *
 * @author kenne
 */
public class Livro implements Publicacao {
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;    
    
    
   
     
    public void detalhes() {
        System.out.println("O titulo do livro e: " + this.getTitulo());
        System.out.println("O total de paginas do livro e: " + this.getTotPaginas());
        if(this.getAberto()) {
          System.out.println("A pagina atual e: " + this.pagAtual); 
        } else {
            System.out.println("O livro esta fechado");
        }
        
        System.out.println("O leitor e: " + leitor.getNome());
        System.out.println("A idade do leitor e: " + leitor.getIdade());
        System.out.println("O sexo do leitor e: " + leitor.getSexo());
        
//        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor + 
//                "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual + 
//                "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + 
//                "\n, leitor=" + leitor.getSexo()+ "\n, leitor=" + leitor.getIdade()+'}';
    }
        
        
    

   

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
     @Override
    public void abrir() {
        this.aberto = true;
        System.out.println("Livro aberto");
             
    }

    @Override
    public void fechar() {
     this.aberto = false;
        System.out.println("Livro fechado");
        
    }

    @Override
    public void folhear() {
        if(this.getAberto() && this.pagAtual <= this.totPaginas){
            this.setPagAtual(this.getPagAtual() + 10 );
           System.out.println("Voce folheou 10 paginas e a pagina atual e: " + this.getPagAtual());
           System.out.println("Faltam " + (this.getTotPaginas() - this.getPagAtual()) + " para voce finaliza-lo");         
      }   else {
          System.out.println("Impossivel folhear, porque o livro esta fechado");
      }
    }

    @Override
    public void avancarPag() {
        if(this.getAberto() && this.pagAtual <= this.totPaginas){
            this.setPagAtual(this.getPagAtual() + 1);
               System.out.println("Voce avancou uma pagina e a pagina atual e: " + this.getPagAtual());
               System.out.println("Faltam " + (this.getTotPaginas() - this.getPagAtual()) + " para voce finaliza-lo");
    } else {
                    System.out.println("Impossivel avancar pagina, porque o livro esta fechado");
    }
    }

    @Override
    public void voltarPag() {
       if(this.getAberto() && this.pagAtual <= this.totPaginas){
            this.setPagAtual(this.getPagAtual() - 1);
               System.out.println("Voce voltou uma pagina e a atual e: " + this.getPagAtual());
               System.out.println("Faltam " + (this.getTotPaginas() - this.getPagAtual()) + " para voce finaliza-lo");
    } else {
            System.out.println("Impossivel voltar pagina, porque o livro esta fechado");
       }
    
    
    
    }
}
