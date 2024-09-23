package br.unama.automovel;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste");
        Carro carro = new Carro();
        carro.setMarca("BMW");
        carro.setModelo("X6M competition");
        carro.setAno(2024);
        carro.exibirDetalhes();
        
    }
}

