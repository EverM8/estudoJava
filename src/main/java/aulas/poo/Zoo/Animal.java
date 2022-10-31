package aulas.poo.Zoo;

//Na interface você define um conjunto de métodos(sem corpo)
//E a classe que herda deve implementar esses métodos
public interface Animal {
    void dormir();
    void fazerSom();
    void comer(String comida);
}
//Gato precisa implements os métodos
class Gato implements Animal {
    @Override
    public void dormir() {
        System.out.println("zzzzzz Miado");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer(String comida) {
        if (comida.equals("Peixe")) {
            System.out.println("Comendo Peixe");
        } else {
            System.out.println("Não quero " + comida);
        }
    }
}

    class Galinha implements Animal{
        @Override
        public void dormir(){
            System.out.println("zzzzz Có có");
        }

        @Override
        public void fazerSom() {
            System.out.println("Có Có Có Có");
        }

        @Override
        public void comer(String comida) {
            System.out.println("Comendo"+comida);
        }

        public static void main(String[] args) {
            Galinha galinha=new Galinha();
            Gato gato=new Gato();

            galinha.fazerSom();
            galinha.dormir();
            galinha.comer("Milho");

            gato.fazerSom();
            gato.dormir();
            gato.comer("Peixe");

            //Interfacenão consigo criar um objeto
            //Animal novoAnimal=new Animal();//não consigo criar, pois é uma interface

            Animal animalGalinha=galinha;
            Animal animalGato=gato;
            System.out.println("=========POLIMORFISMO==========");
            animalGalinha.fazerSom();
            animalGato.fazerSom();



        }
    }
