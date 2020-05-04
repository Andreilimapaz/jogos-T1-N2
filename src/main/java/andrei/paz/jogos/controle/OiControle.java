package andrei.paz.jogos.controle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OiControle {
    @GetMapping("/")
    public String mensagem(){
        return "Oi seja bem vindo a nossa loja de jogos!!";
    }
}
