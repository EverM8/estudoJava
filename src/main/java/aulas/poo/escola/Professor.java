package aulas.poo.escola;

public class Professor extends Pessoa{
    private String formacao;

    public Professor(String nome, String email, String arroz, String formacao) {
        super(nome, email, arroz);
        this.formacao = formacao;
    }

    @Override //indica que há sobrescrita
    public void seApresentar(){
        super.seApresentar();//super=Pessoa ( System.out.println("Olá me chamo "+this.name+"!");
        System.out.println("Eu sou um professor com formação em "+this.formacao);
    }

    public String getFormacao() {
        return formacao;
    }
}
