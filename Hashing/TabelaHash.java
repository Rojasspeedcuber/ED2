package Hashing;
import java.util.ArrayList;
import java.util.LinkedList;
public class TabelaHash {
    private static final int TAMANHO_TABELA = 101; // Tamanho da tabela de hash
    private ArrayList<LinkedList<Carro>> tabela;

    public TabelaHash() {
        tabela = new ArrayList<>(TAMANHO_TABELA);
        for (int i = 0; i < TAMANHO_TABELA; i++) {
            tabela.add(new LinkedList<>());
        }
    }

    private int funcaoHash(String placa) {
        // Implementação do método de permutação para chaves alfanuméricas
        // (pode ser adaptado conforme necessário)
        int hash = 0;
        for (int i = 0; i < placa.length(); i++) {
            hash += placa.charAt(i) * (i + 1);
        }
        return hash % TAMANHO_TABELA;
    }

    public int buscarCarro(String placa) {
        int indice = funcaoHash(placa);
        LinkedList<Carro> lista = tabela.get(indice);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).placa.equals(placa)) {
                return i; // Retorna a posição do carro no arquivo de carros
            }
        }

        return -1; // Carro não encontrado
    }

    public void cadastrarCarro(Carro carro) {
        String placa = carro.placa;
        int indice = funcaoHash(placa);
        LinkedList<Carro> lista = tabela.get(indice);

        if (buscarCarro(placa) == -1) {
            lista.add(carro); // Adiciona o carro à lista na tabela de hash
            System.out.println("Carro cadastrado com sucesso!");
        } else {
            System.out.println("Cadastramento não pode ser efetuado. A placa já existe.");
        }
    }

    public void exibirDadosCarro(String placa) {
        int indice = funcaoHash(placa);
        LinkedList<Carro> lista = tabela.get(indice);

        int posicaoNoArquivo = buscarCarro(placa);
        if (posicaoNoArquivo != -1) {
            Carro carro = lista.get(posicaoNoArquivo);
            System.out.println("Modelo: " + carro.modelo);
            System.out.println("Placa: " + carro.placa);
            System.out.println("Cor: " + carro.cor);
            System.out.println("Matrícula do Proprietário: " + carro.matriculaProprietario);
        } else {
            System.out.println("A placa fornecida não existe no cadastro.");
        }
    }

    public void listarArquivo(ArrayList<Carro> arquivoCarros) {
        for (Carro carro : arquivoCarros) {
            System.out.println("Placa: " + carro.placa);
            System.out.println("Modelo: " + carro.modelo);
            System.out.println("Cor: " + carro.cor);
            System.out.println("Matrícula do Proprietário: " + carro.matriculaProprietario);
            System.out.println("--------");
        }
    }
}
