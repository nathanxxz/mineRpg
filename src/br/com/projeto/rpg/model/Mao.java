package br.com.projeto.rpg.model;

public class Mao {
    private Arma maoEsq;
    private Arma maoDi;


    public Arma getMaoEsq() {
        return maoEsq;
    }

    public void setMaoEsq(Arma maoEsq) {
        this.maoEsq = maoEsq;
    }

    public Arma getMaoDi() {
        return maoDi;
    }

    public void setMaoDi(Arma maoDi) {
        this.maoDi = maoDi;
    }

    @Override
    public String toString() {
        return "Mao{" +
                "maoEsq=" + maoEsq +
                ", maoDi=" + maoDi +
                '}';
    }
}
