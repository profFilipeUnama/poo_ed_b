package livraria;

public class Livro{
    private String titulo;
    public int numeroPaginas;
    private double preco;

    public Livro(String titulo, int numeroPaginas, double preco){
        this.titulo = titulo;
        this.preco = preco;
        this.numeroPaginas = numeroPaginas;
    }

    public Livro(){

    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public Livro(String titulo, double preco){
        this.titulo = titulo;
        this.preco = preco;
    }


    

    void cadastrar(){
        System.out.println(" Cadastrando o livro");
    }

    double calcFrete(String cep){
        double frete = 0;
        System.out.println(" Calculando o frete para o CEP "+ cep);
        return frete;
    }

}