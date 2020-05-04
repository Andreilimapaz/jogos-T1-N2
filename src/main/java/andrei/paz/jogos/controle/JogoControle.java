package andrei.paz.jogos.controle;


import andrei.paz.jogos.modelo.Jogo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JogoControle {

    @GetMapping("/consoles")
    public ArrayList<Jogo> getConsoles(){
        Jogo console1 = new Jogo();
        console1.setNome("Playstation 4");
        console1.setDesenvolvedora("Sony");
        console1.setPreco(1.800);

        Jogo console2 = new Jogo();
        console2.setNome("Xbox One");
        console2.setDesenvolvedora("Microsoft");
        console2.setPreco(1.300);

        Jogo console3 = new Jogo();
        console3.setNome("Nintendo Switch");
        console3.setDesenvolvedora("Nintendo");
        console3.setPreco(2.300);

        ArrayList<Jogo> lista1 = new ArrayList<>();

        lista1.add(console1);
        lista1.add(console2);
        lista1.add(console3);

        return lista1;
    }

    @GetMapping("/listajogos")
    public ArrayList<Jogo> ListaJogos(){

        Jogo jogo1 = new Jogo();
        jogo1.setNome("Oblivion");
        jogo1.setGenero("RPG");
        jogo1.setPreco(50.00);
        jogo1.setDesenvolvedora("Bethesda");

        Jogo jogo2 = new Jogo();
        jogo2.setNome("Fifa 2020");
        jogo2.setGenero("Esportes");
        jogo2.setPreco(199.00);
        jogo2.setDesenvolvedora("Ea");

        Jogo jogo3 = new Jogo();
        jogo3.setNome("Mass Effect");
        jogo3.setGenero("RPG espacial");
        jogo3.setPreco(80.00);
        jogo3.setDesenvolvedora("Bioware");

        ArrayList<Jogo> lista2 = new ArrayList<>();

        lista2.add(jogo1);
        lista2.add(jogo2);
        lista2.add(jogo3);

        return lista2;
    }
}

