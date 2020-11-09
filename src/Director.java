public class Director {

    private BuilderParola builder;

    public Director (BuilderParola builder){
        this.builder = builder;
    }

    public void creaParola(){
        builder.creaVocale('a');
        builder.creaConsonante('l');
        builder.creaVocale('e');
        builder.creaConsonante('x');
    }
}
