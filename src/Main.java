public class Main {
    public static void main(String[] args) {
        TuttoMaiuscolo prova = new TuttoMaiuscolo();
        SpostataDiUno prova1 = new SpostataDiUno();
        // Director director = new Director(prova);
        Director director = new Director(prova1);


        director.creaParola();
        //System.out.println(prova.getParola());
        System.out.println(prova1.getParola());

    }
}
