import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void seApresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e eu tenho " + this.idade + " anos.");
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println("Feliz aniversário! Agora " + this.nome + " tem " + this.idade + " anos.");
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}

class Estudante extends Pessoa {
    private String matricula;

    public Estudante(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void seApresentar() {
        System.out.println("Olá, sou o estudante " + getNome() + ", tenho " + getIdade() + " anos e minha matrícula é " + this.matricula + ".");
    }

    public void estudar() {
        System.out.println(getNome() + " está estudando para a prova.");
    }
}



public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", 29);
        Pessoa pessoa2 = new Pessoa("Bruno", 35);

        System.out.println("--- Apresentações Iniciais ---");
        pessoa1.seApresentar();
        pessoa2.seApresentar();

        System.out.println("\n--- Eventos ---");
        pessoa1.fazerAniversario();

        System.out.println("\n--- Apresentação Atualizada ---");
        pessoa1.seApresentar();

        System.out.println("\n--- Acessando dados com Getters ---");
        String nomeDaPessoa2 = pessoa2.getNome();
        System.out.println("O nome da segunda pessoa é " + nomeDaPessoa2 + ".");

        System.out.println("\n--- Criando um Estudante ---");
        Estudante estudante1 = new Estudante("Carla", 21, "SI12345");
        estudante1.seApresentar();
        estudante1.estudar();
        estudante1.fazerAniversario();
    }
}