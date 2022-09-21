package Model;

public class Peixe {
    String nome;
    String especie;
    String familia;
    int tamanho;
    String aguaDoceOuSal;
    String alimentacao;

    public Peixe(String nome, String especie, String familia,
                 int tamanho, String aguaDoceOuSal, String alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.familia = familia;
        this.tamanho = tamanho;
        this.aguaDoceOuSal = aguaDoceOuSal;
        this.alimentacao = alimentacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getAguaDoceOuSal() {
        return aguaDoceOuSal;
    }

    public void setAguaDoceOuSal(String aguaDoceOuSal) {
        this.aguaDoceOuSal = aguaDoceOuSal;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }
}
