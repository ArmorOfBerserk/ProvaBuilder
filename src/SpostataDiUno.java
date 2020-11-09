import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpostataDiUno extends BuilderParola {

    private String parola = "";
    private List<Character> vocali = Arrays.asList('a', 'e', 'i', 'o', 'u');

    @Override
    public void creaVocale(char c) {
        if( Character.isUpperCase(c) )
            c = Character.toLowerCase(c);

        int temp = vocali.indexOf(c);

        parola += vocali.get((temp + 1) % 5);
    }

    @Override
    public void creaConsonante(char c) {

        if( Character.isUpperCase(c) )
            c = Character.toLowerCase(c);

        if( c == 'z'){
            c = 'b';

            parola += c;

            return;
        }

        else{
            c += 1;

            if (vocali.contains(c))
                c += 1;

            parola += c;
        }

    }

    public String getParola(){
        return parola;
    }
}
