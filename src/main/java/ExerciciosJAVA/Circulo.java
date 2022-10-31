package ExerciciosJAVA;

public class Circulo {
    private double raio;
    private String cor;


    public Circulo(double raio, String cor){
        this.raio=raio;
        this.cor=cor;
    }

    public double calcaularArea(){
        double area=0.0;
        return area=Math.PI*Math.pow(raio,2);
    }

    public double circuferencia(){
        double circuferencia=0;
        return  circuferencia=2*Math.PI*raio;
    }

    public  double setRaio(double novoRaio){
        return raio=novoRaio;
    }

    public static void main(String[] args) {
        Circulo circulo1=new Circulo(5,"vermelho");
        System.out.println("A área do circulo é "+circulo1.calcaularArea());
        System.out.println("A circuferência do circulo é "+circulo1.circuferencia());
    }


}
