package Model;

public class Pantera extends Felino implements IPredar{
    String cor;
    boolean riscoDeExtincao;

    public Pantera(String familia, String habitat,
                   String presa, String nome, String cor, boolean riscoDeExtincao) {
        super(familia, habitat, presa, nome);
        this.cor = cor;
        this.riscoDeExtincao = riscoDeExtincao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isRiscoDeExtincao() {
        return riscoDeExtincao;
    }

    public void setRiscoDeExtincao(boolean riscoDeExtincao) {
        this.riscoDeExtincao = riscoDeExtincao;
    }

    public Pantera(String familia, String habitat, String presa, String nome) {
        super(familia, habitat, presa, nome);
    }


    @Override
    public String getNome() {
        return super.getNome();
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
    public String getHabitat() {
        return super.getHabitat();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setHabitat(String habitat) {
        super.setHabitat(habitat);
    }

    @Override
    public String getPresa() {
        return super.getPresa();
    }


    @Override
    public void setPresa(String presa) {
        super.setPresa(presa);
    }
    public void predar(){
        System.out.println(nome + " predou uma presa, era um " + presa);
    };

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCor: " + cor + "\nFamilia: " + familia + "\nHabitat: "
                + habitat + "\nPresa: " + presa + "\nRisco de Extincao: " + riscoDeExtincao;
    }
}
