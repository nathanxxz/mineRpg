package br.com.projeto.rpg.model;

import br.com.projeto.rpg.enumerador.TipoDeArmaEnum;

public class Arma {
    private String nome;
    private int poder;
    private TipoDeArmaEnum tipoDeArmaEnum;

    public Arma(String nome, TipoDeArmaEnum tipoDeArmaEnum) {
        this.nome = nome;
        this.poder = poder;
        this.tipoDeArmaEnum = tipoDeArmaEnum;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public TipoDeArmaEnum getTipoDeArmaEnum() {
        return tipoDeArmaEnum;
    }

    public void setTipoDeArmaEnum(TipoDeArmaEnum tipoDeArmaEnum) {
        this.tipoDeArmaEnum = tipoDeArmaEnum;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nome='" + nome + '\'' +
                ", poder=" + poder +
                ", tipoDeArmaEnum=" + tipoDeArmaEnum +
                '}';
    }
}
