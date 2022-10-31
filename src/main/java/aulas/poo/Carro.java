package aulas.poo;

public class Carro {
    String marca;
    String modelo;
    int ano;
    boolean flex;
    int qtPortas;
    double combustivelAtual;
    double consumo;

    boolean estaLigado;

    Carro(String modelo, String marca, int ano, boolean flex, int qtPortas, double consumo){
        this.modelo=modelo;
        this.marca=marca;
        this.ano=ano;
        this.flex=flex;
        this.qtPortas=qtPortas;
        this.combustivelAtual=30.0;
        this.consumo=consumo;
        this.estaLigado=false;

    }

    //Abastecer
    void abastecer(double total){
        this.combustivelAtual+=total;
    }
    //Ligar
    void ligar(){
        this.estaLigado=true;
    }
    //Desligar
    void desligar(){
        this.estaLigado=false;
    }
    // Viajar
    boolean viajar(String local, double distancia) {
        if (!this.estaLigado) {
            this.ligar();
        }
        //calcula quantos litros serão necessários para a viagem

        double totaLitros = distancia / this.consumo;
        if (this.combustivelAtual-totaLitros>0){
            this.combustivelAtual-=totaLitros;
            System.out.println("A viagem para " + local+ " aconteceu. Sobrou "+this.combustivelAtual+ "L.");
            return true;//a viagem aconteceu
        }else{
            System.out.println("A viagem não foi possível");
            return false;
        }
    }

    //A main serve para testar a classe
    public static void main(String[] args) {
        Carro carro1=new Carro("GOLF R","VOLKSWAGEN",2022,true,4,12);
        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estaLigado);
        carro1.ligar();
        System.out.println(carro1.estaLigado);

        boolean viajou=carro1.viajar("Fortaleza",3000);
        System.out.println(viajou);
    }


}
