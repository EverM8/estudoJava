package aulas.poo;

public class PessoaTeste {
    public static void main(String[] args) {
        //new=>constroi um NOVO objeto de Pessoa
        Pessoa pessoa1=new Pessoa();
        pessoa1.nome="José";
        pessoa1.sobrenome="Carlos";
        pessoa1.idade=29;
        pessoa1.peso=55.0;
        pessoa1.altura=1.65;

        pessoa1.dizOla();

        Pessoa pessoa4 = new Pessoa("Pedro", "Gomes", 35, 1.75, 30.5);

        Pessoa recemNascido=new Pessoa("Enzo","Pereira");
        System.out.println(recemNascido.altura);
        recemNascido.idade++;//envelhecer
        recemNascido.dizOla();

        pessoa4.dizOla();
        pessoa4.mostrarIMC();
        double imcPessoa4= pessoa4.calculaImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("batata");

        //Exemplo pessoa
        Pessoa pedro=new Pessoa("Pedro","Joao",29,1.8,80);
        Pessoa jose=new Pessoa("Jose","Carlos",30,1.75,93);

        pedro.cumprimentar(jose);
        pedro.cumprimentar(jose);
    }
}
