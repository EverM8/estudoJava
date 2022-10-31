package aulas.poo;

import java.time.LocalDate;

public class ClienteTeste {

    //Encapsulamento
    //Escolhe quais atributos/métodos serão visíveis fora da classe
    //public (padrão) => vísivel para todos
    //private =>  os métodos/atributos são vísiveis apenas na classe
    //protected => bem parecido com o private
    public static void main(String[] args) {
        Cliente cliente1=new Cliente(1,"Felipe","Jose", LocalDate.of(1993,7,15),1.85,95);

        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getNomeCompleto());
        cliente1.setAltura(50);
        cliente1.setAltura(1.5);


    }
}
