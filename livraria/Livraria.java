package livraria;
public class Livraria{
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Percy Jackson";
        System.out.println(livro1.titulo);
        livro1.cadastrar();
    }
}