package Recursive;

public class CheckNum {
    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }

    public static int checkNum(int num) {
        int sum = sumOfDigits(num);
        if (sum % 9 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int num = -89271;
        System.out.println(checkNum(num)); 
    }
}
//Đây là bài tập kiểm tra một số có chia hết cho 9 hay không bằng đệ quy.
