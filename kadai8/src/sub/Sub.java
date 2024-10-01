package sub;

import java.util.Random;

public class Sub {
    private String name;
    private int hp;
    private int mp;
    private int attackPower;
    private int speed;
    private int defense;

    // コンストラクタ
    public Sub(String name) {
        this.name = name;
        generateRandomStatus();
    }

    // ランダムなステータスを生成
    private void generateRandomStatus() {
        Random rand = new Random();
        this.hp = rand.nextInt(901) + 100; // HPを100から1000の間で生成
        this.mp = rand.nextInt(901) + 100; // MPを100から1000の間で生成
        this.attackPower = rand.nextInt(501); // 攻撃力を0から500の間で生成
        this.speed = rand.nextInt(1001); // 素早さを0から1000の間で生成
        this.defense = rand.nextInt(101); // 防御力を0から100の間で生成
    }

    // Getterメソッド
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefense() {
        return defense;
    }
}
