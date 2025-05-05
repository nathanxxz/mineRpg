package br.com.projeto.rpg.main;

import br.com.projeto.rpg.enumerador.TipoDeArmaEnum;
import br.com.projeto.rpg.model.Arma;
import br.com.projeto.rpg.model.Mago;
import br.com.projeto.rpg.model.Mao;

public class Main {
    public static void main(String[] args) {
        Mago mago= new Mago("SASUKEEEE",100,100,100,100,100,100,100,100,"Humano",55, 'M',new Mao());
        mago.getMao().setMaoDi(new Arma("Cobrao",TipoDeArmaEnum.CAJADO));
        mago.getMao().setMaoEsq(new Arma("Escudao",TipoDeArmaEnum.ESCUDO));
        System.out.println(mago);

    }
}
