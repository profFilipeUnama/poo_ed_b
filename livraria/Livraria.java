package livraria;
public class Livraria{
    public static void main(String[] args) {
       // Livro livro1 = new Livro();
       // livro1.titulo = "Percy Jackson";
       // System.out.println(livro1.titulo);
       // livro1.cadastrar();
       Livro livro2 = new Livro("Harry ...", 50.99);
       livro2.  (); 

       Livro livro3 = new Livro();
       Livro livro4 = new Livro("Harry ..", 500, 50.99);
       livro4.setTitulo("Percy");
       System.out.println(livro4.getTitulo());
    }
}