package main;

import java.util.Scanner;

import sub.Sub;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();

        // Subクラスのインスタンスを作成し、名前を渡す
        Sub character = new Sub();
        character.setName(name); // 名前をセット

        // 挨拶とキャラクターのステータスを出力
        System.out.println("こんにちは 「 " + character.getName() + " 」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + character.getHp());
        System.out.println("MP：" + character.getMp());
        System.out.println("攻撃力：" + character.getAttackPower());
        System.out.println("素早さ：" + character.getSpeed());
        System.out.println("防御力：" + character.getDefense());
        System.out.println("\nさあ冒険に出かけよう！");
        
        scanner.close();
    }
}
