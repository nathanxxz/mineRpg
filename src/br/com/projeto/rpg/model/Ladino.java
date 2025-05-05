package br.com.projeto.rpg.model;

public class Ladino extends Personagem {
    private int nivelDeAgilidade;
    private int nivelDeFurtividade;
    private int nivelDePrestidigitacao;


    public Ladino(String nome,int nivelDeAgilidade,int nivelDeFurtividade,int nivelDePrestidigitacao, int vida, int nivel, int defesa, int estamina, int velocidade, String raca, double peso, char genero, Mao mao) {
        super(nome, vida, nivel, defesa, estamina, velocidade, raca, peso, genero, mao);
        this.nivelDeAgilidade=nivelDeAgilidade;
        this.nivelDeFurtividade=nivelDeFurtividade;
        this.nivelDePrestidigitacao=nivelDePrestidigitacao;
    }

    public int getNivelDeAgilidade() {
        return nivelDeAgilidade;
    }

    public void setNivelDeAgilidade(int nivelDeAgilidade) {
        this.nivelDeAgilidade = nivelDeAgilidade;
    }

    public int getNivelDeFurtividade() {
        return nivelDeFurtividade;
    }

    public void setNivelDeFurtividade(int nivelDeFurtividade) {
        this.nivelDeFurtividade = nivelDeFurtividade;
    }

    public int getNivelDePrestidigitacao() {
        return nivelDePrestidigitacao;
    }

    public void setNivelDePrestidigitacao(int nivelDePrestidigitacao) {
        this.nivelDePrestidigitacao = nivelDePrestidigitacao;
    }

    @Override
    public String toString() {
        return "Ladino{" +
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
                "nivelDeAgilidade=" + nivelDeAgilidade +
                ", nivelDeFurtividade=" + nivelDeFurtividade +
                ", nivelDePrestidigitacao=" + nivelDePrestidigitacao +
                '}';
    }
}
