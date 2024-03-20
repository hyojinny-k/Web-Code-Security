package practice;

public enum Score {
	WIN, LOSE, EQUAL, ERROR;

	static String print(Score rslt) {
		switch (rslt) {
			case WIN :  return "당신이 이겼습니다.";
			case LOSE : return "컴퓨터가 이겼습니다.";
			case EQUAL : return "비겼습니다.";
		} return "에러";
	}	
}
