package Recursive;

public class CheckNum4 {
	public static boolean checkNum(int num) {
		int result = 0; // Khởi tạo biến số nguyên result = 0
		while(num != 0) {    //   Chạy cho tới khi nào num < 0 thì dừng
			if(num < 0) {
				num = num * -1;
			}
			int x = num % 10;		
			num = (int) num / 10;
			result += x;
		}
		if (result % 3 == 0 & result % 9 != 0) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		int num = -22222221;
		System.out.println(checkNum(num));
	}
}
//Đây là bài toán kiểm tra xem liệu một số có chia hết cho 3 nhưng không chia hết cho 9 hay không bằng phương pháp thông thường.
