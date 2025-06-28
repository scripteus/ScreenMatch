public class Main {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();

        ninja.setNome("Naruto");
        ninja.setVila("Konoha");
        ninja.setJutsu("Chidori");


        Uzumaki uzumaki = new Uzumaki();

        uzumaki.setNome("Uzumaki");
        uzumaki.setVila("Konoha");
        uzumaki.setJutsu("Rasengan");
        uzumaki.setTemBijuu(true);

        Uchiha uchiha = new Uchiha();

        uchiha.setTemSharingan(true);
        uchiha.setNome("Sasuke");
        uchiha.setVila("Konoha");
        uchiha.setJutsu("Rasengan");

        System.out.println("Nome: " + ninja.getNome());
        System.out.println("Vila: " + ninja.getVila());
        System.out.println("Jutsu: " + ninja.getJutsu());
        System.out.println("------------------------------");

        System.out.println("Nome: " + uzumaki.getNome());
        System.out.println("Vila: " + uzumaki.getVila());
        System.out.println("Jutsu: " + uzumaki.getJutsu());
        System.out.println("Tem Bijuu: " + uzumaki.isTemBijuu());

        System.out.println("------------------------------");

        System.out.println("Nome: " + uchiha.getNome());
        System.out.println("Vila: " + uchiha.getVila());
        System.out.println("Jutsu: " + uchiha.getJutsu());
        System.out.println("Tem Sharingan: " + uchiha.isTemSharingan());

    }
}
