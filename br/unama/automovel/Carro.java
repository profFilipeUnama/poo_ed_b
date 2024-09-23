package br.unama.automovel;

public class Carro extends Veiculo{
    
    public void exibirDetalhes(){
        System.out.println("Detalhes do nosso carro -------");
        System.out.println("Ano: " + this.ano);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
}
