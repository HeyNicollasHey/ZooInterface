package Model;

public class Tubarao extends Peixe implements INadar, IPredar{

    boolean riscoDeExtincao;
    boolean abissal;

    public Tubarao(String nome, String especie, String familia, int tamanho,
                   String aguaDoceOuSal, String alimentacao, boolean riscoDeExtincao, boolean abissal) {
        super(nome, especie, familia, tamanho, aguaDoceOuSal, alimentacao);
        this.riscoDeExtincao = riscoDeExtincao;
        this.abissal = abissal;
    }

    public boolean isRiscoDeExtincao() {
        return riscoDeExtincao;
    }

    public void setRiscoDeExtincao(boolean riscoDeExtincao) {
        this.riscoDeExtincao = riscoDeExtincao;
    }

    public boolean isAbissal() {
        return abissal;
    }

    public void setAbissal(boolean abissal) {
        this.abissal = abissal;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEspecie() {
        return super.getEspecie();
    }

    @Override
    public void setEspecie(String especie) {
        super.setEspecie(especie);
    }

    @Override
    public String getFamilia() {
        return super.getFamilia();
    }

    @Override
    public void setFamilia(String familia) {
        super.setFamilia(familia);
    }

    @Override
    public int getTamanho() {
        return super.getTamanho();
    }

    @Override
    public void setTamanho(int tamanho) {
        super.setTamanho(tamanho);
    }

    @Override
    public String getAguaDoceOuSal() {
        return super.getAguaDoceOuSal();
    }

    @Override
    public void setAguaDoceOuSal(String aguaDoceOuSal) {
        super.setAguaDoceOuSal(aguaDoceOuSal);
    }

    @Override
    public String getAlimentacao() {
        return super.getAlimentacao();
    }

    @Override
    public void setAlimentacao(String alimentacao) {
        super.setAlimentacao(alimentacao);
    }
    public void nadar(){
        System.out.println(nome + " esta nadando");
    };

    public void predar(){
        System.out.println(nome + " predou uma presa");
    };

    @Override
    public String toString() {
        return "Tubarao{" +
                "riscoDeExtincao=" + riscoDeExtincao +
                ", abissal=" + abissal +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", familia='" + familia + '\'' +
                ", tamanho=" + tamanho +
                ", aguaDoceOuSal='" + aguaDoceOuSal + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                '}';
    }
}
