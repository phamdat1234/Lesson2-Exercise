package Recursive;
public class BiToDec {
    public static int binaryToDecimal(String binary, int index) {
        // Điều kiện dừng: nếu đã duyệt hết chuỗi
        if (index == binary.length()) {
            return 0;
        }

        // Lấy giá trị của chữ số nhị phân hiện tại
        int digit = binary.charAt(index) - '0';

        // Tính toán giá trị của chữ số hiện tại dựa trên vị trí của nó
        int power = binary.length() - 1 - index; // vị trí mũ của 2

        // Gọi đệ quy với phần còn lại của chuỗi
        return (digit * (int)Math.pow(2, power)) + binaryToDecimal(binary, index + 1);
    }

    public static void main(String[] args) {
        String binaryString = "1101"; 
        int decimal = binaryToDecimal(binaryString, 0); 
        System.out.println("Giá trị thập phân của " + binaryString + " là: " + decimal);
    }
}
