package JavaCore5;

public class Player_1 extends Player{
    private int hp = 1100;
    private String arsenal = "Рушниця(600)";
    private int hit = 600;


    public Player_1(String name) {
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
    public String Player1Hp(){      //атакован 3
        System.out.println("Гравецьз рушницею: 950 Hp");
        return "";
    }
    public String Player1At_1(){      //напал на 3
        System.out.println("Гравець з рушницею атакував гравця з ножем");
        return "";
    }
    public String Player1At_2(){      //напал на 2
        System.out.println("Гравець з рушницею атакував гравця з пістолетом" );
        return "";
    }
}
