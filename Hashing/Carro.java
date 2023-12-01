package Hashing;

import java.io.Serializable;

public class Carro implements Serializable {
    String placa;
    String marca;
    String modelo;
    String cor;
    final int matriculaProprietario;

    public Carro(int matriculaProprietario) {
        this.matriculaProprietario = matriculaProprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMatriculaProprietario() {
        return matriculaProprietario;
    }
    
}
