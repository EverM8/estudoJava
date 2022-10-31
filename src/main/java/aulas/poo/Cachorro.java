package aulas.poo;

//Subclasse da SUPERCLASSE Pet
public class Cachorro extends Pet {
    private String comidaFavorita;
    private String raca;

    //construtor
    public Cachorro(String nome, int idade, double peso, String comidaFavorita, String raca){
        //super -> representa a SUPERCLASSE Pet
        super(nome,idade,peso); //chamando o construtor da classe pai(SUPERCLASSE)
        this.comidaFavorita=comidaFavorita;
        this.raca=raca;
    }

    @Override // anotação=vamos sobrescrever a ação fazer som
    public void fazerSom(){
        System.out.println("Latido!!!");
    }

    @Override
    public void brincar() {
        this.fazerSom();
        super.brincar();//está chamando o método(ato) brincar() de Pet(Superclasse)
        this.dormir();//dormir da SUPERCLASSE Pet, não foi sobrescrita
    }

    @Override
    public void comer(String comida) {
        if (comida.equals(this.comidaFavorita)){
            super.comer(comida);
            this.peso+=0.2;
            //this.setPeso(this.getPeso()+0.2); //caso peso seja private
        }else{
            System.out.println("Quero "+comida+" não!");
        }
    }

    public void correrAtrasDaMoto() {
        this.fazerSom();
        System.out.println("Correndo atrás da moto!");
    }

    public static void main(String[] args) {
        //Testar a herança
        Pet pet1=new Pet("Fred",3,20.5);
        pet1.dormir();
        pet1.comer("carne");
        pet1.fazerSom();
        System.out.println("=============================");

        Cachorro rex=new Cachorro("Rex", 4,50.0, "Osso","Pitbull");

        rex.fazerSom();
        rex.comer("Feijão");
        rex.setPeso(49.0);
        System.out.println(rex.getPeso());
        rex.brincar();
        rex.comer("Osso");
        System.out.println(rex.getPeso());
        rex.correrAtrasDaMoto();

    }
}
