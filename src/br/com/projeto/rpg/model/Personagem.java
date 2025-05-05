package br.com.projeto.rpg.model;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int nivel;
    private int defesa;
    private int estamina;
    private int velocidade;
    private String raca;
    private double peso;
    private char genero;
    private Mao mao;

    public Personagem(String nome, int vida, int nivel, int defesa, int estamina, int velocidade, String raca, double peso, char genero, Mao mao) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.defesa = defesa;
        this.estamina = estamina;
        this.velocidade = velocidade;
        this.raca = raca;
        this.peso = peso;
        this.genero = genero;
        this.mao = mao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Mao getMao() {
        return mao;
    }

    public void setMao(Mao mao) {
        this.mao = mao;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", nivel=" + nivel +
                ", defesa=" + defesa +
                ", estamina=" + estamina +
                ", velocidade=" + velocidade +
                ", raca='" + raca + '\'' +
                ", peso=" + peso +
                ", genero=" + genero +
                ", mao=" + mao +
                '}';
    }
}
