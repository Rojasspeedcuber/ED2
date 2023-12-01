package Hashing;

import java.util.Scanner;

public class SistemaCadastroCarros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaCarros lista = new ListaCarros();
        TabelaHash tabela = new TabelaHash();
        Carro car;

        String placa, marca, modelo, cor;
        int matricula;
        char resp;

        lista.carregarLista();
        System.out.println("Carros cadastrados até o momento: ");
        lista.listar();

        System.out.println("Sistema de cadastramento de carros");
        do{
            System.out.println("Informe a matricula do proprietário: ");
            matricula = in.nextInt(); in.nextLine();
            car = new Carro (matricula);
            System.out.println("Informe a placa do carro: ");
            placa = in.nextLine();
            car.setPlaca(placa);
            System.out.println("Informe a marca do carro: ");
            marca = in.nextLine();
            car.setMarca(marca);
            System.out.println("Informe o modelo do carro: ");
            modelo = in.nextLine();
            car.setModelo(modelo);
            System.out.println("Informe a cor do carro: ");
            cor = in.nextLine();
            car.setCor(cor);
            lista.inserir (car);
            tabela.cadastrarCarro(car);
            System.out.println("Deseja cadastrar outro carro (s/n)? ");
            resp = in.next().charAt(0); in.nextLine();
            resp = Character.toLowerCase(resp);
            while (resp != 's' && resp != 'n') {
                System.out.println("Resposta inválida. Digite s ou n: ");
                resp = in.next().charAt(0); in.nextLine();
                resp = Character.toLowerCase(resp);
            } 

        }while (resp == 's');
        System.out.println("Gravando dados no disco ...");
        lista.gravarLista();
        System.out.println("Dados gravados com sucesso.");
        System.out.println("Deseja ver todos os alunos cadastrados em arquivo até o momento? (s/n): ");
        resp = in.next().charAt(0); in.nextLine();
        resp = Character.toLowerCase(resp);
        while (resp != 's' && resp != 'n') {
            System.out.println("Resposta inválida. Digite s ou n: ");
            resp = in.next().charAt(0); in.nextLine();
            resp = Character.toLowerCase(resp);  
        }
        if (resp == 's') {
            ListaCarros listaArq = new ListaCarros();       
            listaArq.carregarLista();
            listaArq.listar();
        }
        System.out.println("Fim do programa");
        
    }
}