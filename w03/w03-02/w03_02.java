package practice;

import java.util.Scanner;

public class w03_02 {

	static Score whoswin(Game com, Game you) {
		Score[][]  scoreBoard = {
			{Score.EQUAL, Score.LOSE, Score.WIN},
			{Score.WIN, Score.EQUAL, Score.LOSE},
			{Score.LOSE, Score.WIN, Score.EQUAL}
		};
		
		return scoreBoard[com.getCodeNum()][you.getCodeNum()];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("컴퓨터의 입력: ");
		String comInput = sc.next();
		Game com = Game.encode(comInput);
		
		System.out.print("당신의 입력: ");
		String yourInput = sc.next();
		Game user = Game.encode(yourInput);
		
		Score rslt = whoswin(user, com);
		System.out.println(Score.print(rslt));
		
		sc.close();
	}
}