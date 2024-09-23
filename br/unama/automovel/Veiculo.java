package br.unama.automovel;

public class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca= marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }
}
