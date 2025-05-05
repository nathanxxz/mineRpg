package br.com.projeto.rpg.model;

import br.com.projeto.rpg.contratos.IPoderDeFogo;
import br.com.projeto.rpg.contratos.IPoderDeGelo;

public class Mago extends Personagem implements IPoderDeFogo, IPoderDeGelo {
    private int nivelDeMana;
    private int nivelDeInteligencia;
    private int nivelDeSabedoria;

    public Mago(String nome,int nivelDeInteligencia,int nivelDeMana,int nivelDeSabedoria, int vida, int nivel, int defesa, int estamina, int velocidade, String raca, double peso, char genero, Mao mao) {
        super(nome, vida, nivel, defesa, estamina, velocidade, raca, peso, genero, mao);
        this.nivelDeInteligencia=nivelDeInteligencia;
        this.nivelDeMana=nivelDeMana;
        this.nivelDeSabedoria=nivelDeSabedoria;
    }

    @Override
    public void chamas() {
        System.out.println("Mago tacou chamas");

    }

    @Override
    public void punhoEscaldante() {
        System.out.println("Mago abateu ace");

    }

    @Override
    public void congelar() {
        System.out.println("Mago tacou gelinho");

    }

    @Override
    public void espinhosDeGelo() {
        System.out.println("Mago tacou espinho de gelo");

    }

    public int getNivelDeMana() {
        return nivelDeMana;
    }

    public void setNivelDeMana(int nivelDeMana) {
        this.nivelDeMana = nivelDeMana;
    }

    public int getNivelDeInteligencia() {
        return nivelDeInteligencia;
    }

    public void setNivelDeInteligencia(int nivelDeInteligencia) {
        this.nivelDeInteligencia = nivelDeInteligencia;
    }

    public int getNivelDeSabedoria() {
        return nivelDeSabedoria;
    }

    public void setNivelDeSabedoria(int nivelDeSabedoria) {
        this.nivelDeSabedoria = nivelDeSabedoria;
    }

    @Override
    public String toString() {
        return "Mago{" +
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
                ", nivel de mana=" + this.nivelDeMana +
                ", nivel de inte=" + this.nivelDeInteligencia +
                ", nivel de sabedoria=" + this.nivelDeSabedoria +
                '}';
    }
}
