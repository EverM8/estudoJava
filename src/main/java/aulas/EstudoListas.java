package aulas;

import java.util.ArrayList;

public class EstudoListas {
    public static void main(String[] args) {
        //cria um novo ArrayList vazio que guarda Integer
        ArrayList<Integer> numeros=new ArrayList<>();
        ArrayList<String> nomes=new ArrayList<>();

        System.out.println(numeros);

        //Adicionando elementos no array
        numeros.add(10); // .add equivale ao push no JS
        numeros.add(20);
        numeros.add(200);
        numeros.add(1999);
        numeros.add(200);

        System.out.println(numeros);
        System.out.println(numeros.get(2)); //equivale ao numeros[2]
        //numeros[0]=500
        numeros.set(0,500);
        System.out.println(numeros);

        //remove= remove o elemento na posição informada
        numeros.remove(0);//remove o elemento na posição 0
        System.out.println(numeros);

        System.out.println(numeros.size()); //array.length

        for (int i=0;i< numeros.size();i++){
            System.out.println(numeros.get(i));
        }

        System.out.println("--------------");
        for (int numero:numeros){//Para cada valor dentro do array ele executa o código
            System.out.println(numero);
        }

        System.out.println(numeros.contains(500)); //true=achou, false=não achou
        System.out.println(numeros.indexOf(1000)); //qual a posição do 100 na lista
        System.out.println(numeros.indexOf(500)); // -1=não achou o elemento
        System.out.println(numeros.indexOf(200)); // mostra o array do primeiro encontrado
        System.out.println(numeros.lastIndexOf(200)); // mostra o último encontrado


    }
}
