package pacman;

public class PacmanGame {
    public static void main(String[] args) {
        Map map = new Map();
        Pacman pacman = new Pacman(map);
        Ghost ghost = new Ghost(map);
        Item item = new Item(map);
        Star star = new Star(map);

        map.display();

        // 게임 루프
        while (!pacman.isGameOver()) {
            pacman.move();
            ghost.move(0); // 예시로 첫 번째 유령만 이동
            item.checkCollection(pacman);
            star.checkCollection(pacman);
            map.display();
        }

        System.out.println("게임 종료!");
    }
}
