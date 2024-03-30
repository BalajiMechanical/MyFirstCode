package task;

class pacman {
	void up() {
		System.out.println("Pacman Up");
	}

	void down() {
		System.out.println("Pacman Down");
	}

	void left() {
		System.out.println("Pacman Left");
	}

	void Right() {
		System.out.println("Pacman Right");
	}
}

class Mario {
	void up() {
		System.out.println("Mario Up");
	}

	void down() {
		System.out.println("Mario Down");
	}

	void left() {
		System.out.println("Mario Left");
	}

	void Right() {
		System.out.println("Mario Right");
	}
}

class contra  {
	void up() {
		System.out.println("Contra Up");
	}

	void down() {
		System.out.println("Contra down");
	}

	void left() {
		System.out.println("Contra Left");
	}

	void Right() {
		System.out.println("Contra Right");
	}
}

class GameRunner {
//	pacman pa;
//	public GameRunner(pacman pac) {
//		
//	}
	
	void run(Mario p) {
		p.up();
		p.down();
		p.left();
		p.Right();
	}
}

public class Game {

	public static void main(String[] args) {
		pacman obj = new pacman();
		Mario obj1 = new Mario();
		contra obj2 = new contra();

		GameRunner g = new GameRunner();
		g.run(obj1);
	}

}
