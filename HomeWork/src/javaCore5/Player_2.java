package JavaCore5;

public class Player_2 extends Player {
    private int hp = 1000;
    private String arsenal = "Пістолет(400)";
    private int hit = 400;


    public Player_2(String name) {
        super(name);
        this.hp = hp;
        this.arsenal = arsenal;
        this.hit = hit;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getArsenal() {
        return arsenal;
    }

    public void setArsenal(String arsenal) {
        this.arsenal = arsenal;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String Player2Hp() {
        System.out.println("Гравецьз пістолетом: 400");
        return "";
    }

    public String Player2Hp_1() {
        System.out.println("Гравець з пістолетом: - 200 Hp");
        System.out.println("RIP");
        return " ";
    }

    public String Player2At() {
        System.out.println("Гравець з пістолетом атакував гравця з ножем");
        return " ";
    }

    @Override
    public String toString() {
        return "Player_2{" +
                "hp=" + hp +
                ", arsenal='" + arsenal + '\'' +
                ", hit=" + hit +
                '}';
    }
}
