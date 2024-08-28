package main;
import business.Escolaridade;
import business.Pessoa;

public class App {

    public static Pessoa[] users = new Pessoa[10]; 
    public static void main(String[] args) {

        users[0] = new Pessoa();
        
        users[0].setNome("Igor");
        users[0].setDataNascimento(2003, 8, 4);
        users[0].setAltura(1.74f);
        users[0].setPeso(72);
        users[0].setEscolaridade(Escolaridade.POS_GRADUACAO);

        System.out.println("Meu nome é " + users[0].getNome() + ", nasci em " + users[0].getDataNascimento() + ", tenho " + users[0].getAltura() + "m de altura, peso " + users[0].getPeso() + "kg. \nMinha escolaridade é: " + users[0].getEscolaridade() + "em Engenharia de Software.");
    }
}