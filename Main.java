package task;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;

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
		LocalDateTime localDateTime = now.plusYears(3);
		DayOfWeek week = localDateTime.getDayOfWeek();
		System.out.println(week);

		System.out.println("------------");

		// 4:「引数が0なら偽。引数が1なら真」とコンソール画面に表示してみよう。
		int bit = new java.util.Random().nextInt(2);
		System.out.println(judgment(bit));

		System.out.println("------------");

		// 5:String型のListかMapを作成して、その内容をコンソール画面に表示してみよう。
		ArrayList<String> arrayString = new ArrayList<String>();
		arrayString.add("2回目の課題");
		System.out.println(arrayString.get(0));

		System.out.println("------------");

		// 6:（自由課題）任意のプログラムで例外を起こしてみる。
		try {
			System.out.println("任意の数値を入力して下さい");
			int number = new java.util.Scanner(System.in).nextInt();
			System.out.println(number);
		} catch (InputMismatchException e) {
			System.out.println("入力されたものは適切ではありません、数値を入力して下さい");
		}
	}

	public static boolean judgment(int i) {
		if (i == 0) {
			return false;
		}
		return true;
	}
}
