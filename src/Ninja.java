public class Ninja {

    private String nome;
    private String vila;
    private String jutsu;

    public void usarJutsu() {
        System.out.println("Usando jutsu: " + jutsu);
    }

    public void correr() {
        System.out.println(nome + " está correndo!");
    }

    public void lutar() {
        System.out.println(nome + " está lutando!");
    }

    public void recuperarChakra() {
        System.out.println(STR. " \{nome} está Recuperando chakra...");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public String getJutsu() {
        return jutsu;
    }

    public void setJutsu(String jutsu) {
        this.jutsu = jutsu;
    }
}
