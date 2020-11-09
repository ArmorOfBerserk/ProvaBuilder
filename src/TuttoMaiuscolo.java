public class TuttoMaiuscolo extends BuilderParola {

    private String parola = "";

    @Override
    public void creaConsonante(char c) {
        char temp = Character.toUpperCase(c);
        parola += temp;
    }

    @Override
    public void creaVocale(char c) {
        char temp = Character.toUpperCase(c);
        parola += temp;
    }

    public String getParola(){
        return parola;
    }
}
