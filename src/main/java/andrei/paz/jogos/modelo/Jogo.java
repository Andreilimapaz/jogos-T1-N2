package andrei.paz.jogos.modelo;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Jogo {
    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String genero;

    @Getter @Setter
    private String desenvolvedora;

    @Getter @Setter
    private double preco;
}
