package JavaCore5;

public class App {
    public static void main(String[] args) {
        Player player = new Player("");
        Player_1 player_1 = new Player_1("1");
        Player_2 player_2 = new Player_2("2");
        Player_3 player_3 = new Player_3("3");

        System.out.println("Гравець " + player_1.getName() + "\n" + "Зброя: " + player_1.getArsenal() + "\n" + "Сила атаки: " + player_1.getHit() + "\n" + "-----------");
        System.out.println("Гравець " + player_2.getName() + "\n" + "Зброя: " + player_2.getArsenal() + "\n" + "Сила атаки: " + player_2.getHit() + "\n" + "-----------");
        System.out.println("Гравець " + player_3.getName() + "\n" + "Зброя: " + player_3.getArsenal() + "\n" + "Сила атаки: " + player_3.getHit() + "\n" + "-----------");

        System.out.println("=================  Війна  =================");
        System.out.println(player_1.Player1At_1() + "\n" + player_2.Player2Hp());
        System.out.println("=================");
        System.out.println(player_2.Player2At() + "\n" + player_3.Player3Hp());
        System.out.println("=================");
        System.out.println(player_3.Player3At() + "\n" + player_1.Player1Hp());
        System.out.println("=================");
        System.out.println(player_1.Player1At_2() + "\n" + player_3.Player3Hp_2());
        System.out.println("=================");
        System.out.println(player_1.Player1At_2() + "\n" + player_2.Player2Hp_1());
        System.out.println("=================");
        System.out.println("Переможець - Гравець з рушницею");



    }
}
