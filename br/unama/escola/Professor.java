package br.unama.escola;

public class Professor {
   public String nome;
   private boolean hasMestrado = false;
   private String cpf;
   
   public Professor(String nome, boolean mestrado, String cpf){
        this.nome = nome;
        this.hasMestrado = mestrado;
        this.cpf = cpf;
   }
   public String getHasMestrado(){
        String mensagem; 
        if(this.hasMestrado){
            mensagem = "Possui Mestrado";
        }else {
            mensagem = "Não Possui Mestrado";
        }
        return mensagem;
   }

   public void setHasMestrado(boolean mestrado){
        this.hasMestrado = mestrado;
   }

   public void realizaCadastro(){
    System.out.println("Cadastro");
   }
   public void lancaNota(){
    System.out.println("Lança nota");
   }
}
