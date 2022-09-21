package Model;

public class Felino {
    String nome;
    String familia;
    String habitat;
    String presa;

    public Felino(String familia, String habitat, String presa,String nome) {
        this.familia = familia;
        this.habitat = habitat;
        this.presa = presa;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getPresa() {
        return presa;
    }

    public void setPresa(String presa) {
        this.presa = presa;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
