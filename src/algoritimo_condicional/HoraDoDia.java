package algoritimo_condicional;

import java.time.LocalTime;

public class HoraDoDia {
    public static void main(String[] args) {
        // pegar data e hora do sistema
        // retornar ao usuário se é Bom dia, Boa Tarde e Boa noite.

        LocalTime relogio = LocalTime.now();
        int hora = relogio.getHour();

        System.out.println(relogio);

        if (hora < 12) {
            System.out.println("Bom Dia!");
        } else if (hora < 18){
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }
    }
    
    
}
