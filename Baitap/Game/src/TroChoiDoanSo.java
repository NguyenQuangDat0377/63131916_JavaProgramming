import java.util.Random;
import java.util.Scanner;

public class TroChoiDoanSo {

    public static void main(String[] args) {
        Random random = new Random();

        int soMayTinh = random.nextInt(10) + 1;

        System.out.println("Chào mừng bạn đến với trò chơi đoán số!");

        doanSo(soMayTinh);

        System.out.println("Cảm ơn bạn đã tham gia trò chơi!");
    }

    public static void doanSo(int soMayTinh) {
        Scanner scanner = new Scanner(System.in);
        int soDoan;

        System.out.println("Máy tính đã chọn một số từ 1 đến 10. Hãy đoán xem đó là số gì.");

        do {
            System.out.print("Nhập số của bạn: ");
            soDoan = scanner.nextInt();

            if (soDoan < soMayTinh) {
                System.out.println("Số bạn đoán quá thấp. Hãy thử lại!");
            } else if (soDoan > soMayTinh) {
                System.out.println("Số bạn đoán quá cao. Hãy thử lại!");
            } else {
                System.out.println("Chúc mừng! Bạn đã đoán đúng số " + soMayTinh + ".");
            }

        } while (soDoan != soMayTinh);

        scanner.close();
    }
}
