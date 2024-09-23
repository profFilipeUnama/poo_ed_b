package br.unama.escola;

public class Main {
    public static void main(String[] args) {
        Professor obj = new Professor("Filipe", true, "000.000.000-00");
        /*obj.hasMestrado = true;
        obj.nome = "Filipe";*/
        
        /*String mensagem;
        if(obj.hasMestrado){
            mensagem = "Possui Mestrado";
        }else {
            mensagem = "Não possui Mestrado";
        }*/
        System.out.println("Prof." + obj.nome + " " + obj.getHasMestrado());
    }
    
}
