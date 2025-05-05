package br.com.projeto.rpg.model;

public class Guerreiro extends Personagem{
    private int forca;
    private String armadura;
    private int nivelDeFe;


    public Guerreiro(String nome,int forca,String armadura,int nivelDeFe, int vida, int nivel, int defesa, int estamina, int velocidade, String raca, double peso, char genero, Mao mao) {
        super(nome, vida, nivel, defesa, estamina, velocidade, raca, peso, genero, mao);
        this.forca=forca;
        this.armadura=armadura;
        this.nivelDeFe=nivelDeFe;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public int getNivelDeFe() {
        return nivelDeFe;
    }

    public void setNivelDeFe(int nivelDeFe) {
        this.nivelDeFe = nivelDeFe;
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "nome='" + getNome() + '\'' +
                ", vida=" + getVida() +
                ", nivel=" + getNivel() +
                ", defesa=" + getDefesa() +
                ", estamina=" + getEstamina() +
                ", velocidade=" + getVelocidade() +
                ", raca='" + getRaca() + '\'' +
                ", peso=" + getPeso() +
                ", genero=" + getGenero() +
                ", mao=" + getMao() +
                "forca=" + forca +
                ", armadura='" + armadura + '\'' +
                ", nivelDeFe=" + nivelDeFe +
                '}';
    }
}


