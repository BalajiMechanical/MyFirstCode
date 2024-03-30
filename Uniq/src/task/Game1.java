//package task;
//
//interface gameRun {
//	void up();
//
//	void down();
//
//	void left();
//
//	void Right();
//}
//
//class pacMan implements gameRun {
//
//	@Override
//	public void up() {
//		System.out.println("pacman up");
//	}
//
//	@Override
//	public void down() {
//		System.out.println("pacman down");
//	}
//
//	@Override
//	public void left() {
//		System.out.println("pacman left");
//	}
//
//	@Override
//	public void Right() {
//		System.out.println("pacman right");
//	}
//
//}
//
//class mario implements gameRun {
//
//	@Override
//	public void up() {
//		System.out.println("Mario up");
//	}
//
//	@Override
//	public void down() {
//		System.out.println("Mario down");
//	}
//
//	@Override
//	public void left() {
//		System.out.println("Mario left");
//	}
//
//	@Override
//	public void Right() {
//		System.out.println("Mario right");
//	}
//
//}
//
//class contraa implements gameRun {
//
//	@Override
//	public void up() {
//		System.out.println("Contra up");
//	}
//
//	@Override
//	public void down() {
//		System.out.println("Contra down");
//	}
//
//	@Override
//	public void left() {
//		System.out.println("Contra Left");
//	}
//
//	@Override
//	public void Right() {
//		System.out.println("Contra Right");
//	}
//
//}
//
//class GameRunner1 {
//	gameRun gr;
//
//	public GameRunner1(gameRun gr) {
//		this.gr = gr;
//	}
//}
//
//public class Game1 {
//
//	public static void main(String[] args) {
//		pacMan pac = new pacMan();
//		mario mar = new mario();
//		GameRunner1 grun = new GameRunner1(mar);
//	}
//
//}
