package JavaCore5;

public class Player_3 extends Player{
    private int hp = 1000;
    private String arsenal = "Ніж(150)";
    private int hit = 150;



    public Player_3(String name) {
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

    public String Player3Hp(){
        System.out.println("Гравець з ножем: 400 Hp");
        return " ";
    }
    public String Player3Hp_2(){
        System.out.println("Гравець з ножем: 0 Hp");
        System.out.println("RIP");
        return " ";
    }
    public String Player3At(){
        System.out.println("Гравець з ножем атакував гравця з рушницею");
        return "";
    }

    @Override
    public String toString() {
        return "Player_3{" +
                "hp=" + hp +
                ", arsenal='" + arsenal + '\'' +
                ", hit=" + hit +
                '}';
    }
}
