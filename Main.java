package task;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1:「HelloWorld」をコンソール画面に表示してみよう。
		String greeting = "Hello World";
		System.out.println(greeting);

		System.out.println("------------");

		// 2:「1～10まで足した結果」をコンソール画面に表示してみよう。
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result += i;
		}
		System.out.println(result);

		System.out.println("------------");

		// 3:「3年後の今日が何曜日なのか」を計算して、コンソール画面に表示してみよう。
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime threeYearsLater = now.plusYears(3);
		DayOfWeek week = threeYearsLater.getDayOfWeek();
		System.out.println(week);

		System.out.println("------------");

		// 4:「引数が0なら偽。引数が1なら真」とコンソール画面に表示してみよう。
		int bit = new Random().nextInt(2);
		String bitAnswer = judgement(bit);
		String bitException = "Error: もう一度繰り返します。";
		int count = 1;
		while (bitException.equals(bitAnswer)) {
			count++;
			if (count == 3) {
				System.out.println("Error: 正しく処理できませんでした。強制終了します。");
				System.exit(0);
			}
			System.out.println(bitException);
			System.out.println("------------");
			bit = new Random().nextInt(2);
			bitAnswer = judgement(bit);
		}

		System.out.println(bitAnswer);

		System.out.println("------------");

		// 5:String型のListかMapを作成して、その内容をコンソール画面に表示してみよう。
		List<String> homeworkList = new ArrayList<String>();
		homeworkList.add("2回目の課題");
		System.out.println(homeworkList.get(0));

		System.out.println("------------");

		// 6:（自由課題）任意のプログラムで例外を起こしてみる。
		try {
			System.out.println("任意の数値を入力して下さい");
			int number = new Scanner(System.in).nextInt();
			System.out.println(number);
		} catch (InputMismatchException e) {
			System.out.println("入力されたものは適切ではありません、数値を入力して下さい");
		}
	}

	public static String judgement(int i) {
		if (i == 0) {
			return "偽";
		} else if (i == 1) {
			return "真";
		}
		return "Error: もう一度繰り返します。";
	}
}
