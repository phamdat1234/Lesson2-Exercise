package Recursive;

public class CountNum2 {
	public static int countNum(int num) {
		if(num / 10 < 1) {
			return 1;
		}
		return 1 + countNum((int) num / 10);
	}
	public static void main(String[] args) {
		int num = 139283;
		System.out.println(countNum(num));
	}
}
