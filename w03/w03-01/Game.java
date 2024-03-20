package practice;

//public enum Game {
//	ROCK, PAPER, SCISSORS, ERROR;
//}

public enum Game {
	ROCK(0), PAPER(1), SCISSORS(2), ERROR(-1);
	
	private int codeNum;
	
	Game(int num) {
		codeNum = num;
	}
	
	public int getCodeNum() {
		return codeNum;
	}

	public static Game encode(String input) {
		switch (input) {
			case "바위" :  return Game.ROCK;
			case "보" : return Game.PAPER;
			case "가위" : return Game.SCISSORS;
		}
		return Game.ERROR;
	}
}