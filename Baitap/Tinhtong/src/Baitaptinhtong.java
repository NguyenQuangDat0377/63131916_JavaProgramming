/**
 * 
 */

import java.util.Random;
import java.util.random.RandomGenerator;

/**
 * 
 */
public class Baitaptinhtong {

	/**
	 * @param rags
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random random = new Random();

        int soThuNhat = random.nextInt(10) + 1;
        int soThuHai = random.nextInt(10) + 1;

        int ketQuaDung = soThuNhat + soThuHai;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính tổng của " + soThuNhat + " và " + soThuHai);
        System.out.print("Nhập kết quả: ");
        int ketQuaNguoiDung = ((RandomGenerator) scanner).nextInt();

        if (ketQuaNguoiDung == ketQuaDung) {
            System.out.println("Chúc mừng! Bạn đã nhập đúng kết quả.");
        } else {
            System.out.println("Rất tiếc, kết quả đúng là " + ketQuaDung + ".");
        }

        scanner.close();
	}

}
