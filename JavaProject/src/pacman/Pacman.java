package pacman;

import java.util.Scanner;

public class Pacman {
    private Map map;

    public Pacman(Map map) {
        this.map = map;
    }

    public void move() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이동 (W↑, A←, S↓, D→): ");
        String input = scanner.nextLine().toUpperCase(); // 대문자로 변환

        switch (input) {
            case "W":
                map.movePacman(0, -1);
                break;
            case "A":
                map.movePacman(-1, 0);
                break;
            case "S":
                map.movePacman(0, 1);
                break;
            case "D":
                map.movePacman(1, 0);
                break;
            default:
                System.out.println("잘못된 입력");
                return; // 잘못된 입력시 메서드 종료
        }

        if (isGameOver()) {
            System.out.println("게임 오버!");
        }
    }

    public boolean isGameOver() {
        return map.isGameOver();
    }
}
