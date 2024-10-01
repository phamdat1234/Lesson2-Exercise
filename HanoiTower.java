package Recursive;
import java.util.Scanner;
public class HanoiTower {
	    public static void thapHaNoi(int n, char cotNguon, char cotDich, char cotTrungGian) {
	        if (n == 1) {
	            System.out.println("Di chuyển đĩa 1 từ cột " + cotNguon + " sang cột " + cotDich);
	            return;
	        }
	        // Di chuyển n-1 đĩa từ cột nguồn sang cột trung gian
	        thapHaNoi(n - 1, cotNguon, cotTrungGian, cotDich);
	        // Di chuyển đĩa cuối cùng từ cột nguồn sang cột đích
	        System.out.println("Di chuyển đĩa " + n + " từ cột " + cotNguon + " sang cột " + cotDich);
	        // Di chuyển n-1 đĩa từ cột trung gian sang cột đích
	        thapHaNoi(n - 1, cotTrungGian, cotDich, cotNguon);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số đĩa: ");
	        int soDia = scanner.nextInt();
	        
	       
	        thapHaNoi(soDia, 'A', 'C', 'B'); 
	    
	}

}
