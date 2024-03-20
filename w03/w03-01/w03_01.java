package practice;

import java.util.Scanner;

public class w03_01 {
	static Game encode(String str) {
		switch (str) {
			case "바위" :  return Game.ROCK;
			case "보" : return Game.PAPER;
			case "가위" : return Game.SCISSORS;
		}
		return Game.ERROR;
	}
	
	static Score whoswin(Game com, Game you) {
		if (com.equals(Game.ROCK)) {
			if (you.equals(Game.PAPER))
				return Score.WIN;
			else if (you.equals(Game.SCISSORS))
				return Score.LOSE;
			else if (you.equals(Game.ROCK))
				return Score.EQUAL;
		} else if (com.equals(Game.PAPER)) {
			if (you.equals(Game.SCISSORS))
				return Score.WIN;
			else if (you.equals(Game.ROCK))
				return Score.LOSE;
			else if (you.equals(Game.PAPER))
				return Score.EQUAL;
		} else if (com.equals(Game.SCISSORS)) {
			if (you.equals(Game.ROCK))
				return Score.WIN;
			else if (you.equals(Game.PAPER))
				return Score.LOSE;
			else if (you.equals(Game.SCISSORS))
				return Score.EQUAL;
		}
		return Score.ERROR;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("컴퓨터의 입력: ");
		String comInput = sc.next();
		System.out.print("당신의 입력: ");
		String yourInput = sc.next();
		
		Score rslt = whoswin(encode(comInput), encode(yourInput));
		System.out.println(Score.print(rslt));
		
		sc.close();
	}
}