package Recursive;

public class CountNum {
	public static int countNum(int num) {
		int count = 0;
		while(num > 0) {
			int x = num % 10;
			num = (int) num / 10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int num = 83274190;
		System.out.println(countNum(num));
	}
}
// Đây là bài toán đếm có bao nhiêu số chữ số của 1 số nguyên dương.