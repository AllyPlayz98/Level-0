import org.teachingextensions.logo.Tortoise;
public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise.show();
		drawSquare();
}
	static void drawSquare() {
		for (int torto = 0; torto<4; torto++){
			Tortoise.move(100);
			Tortoise.turn(90);
		}
	}
}
