package ntu.vd2

import android.os.Bundle
import android.appcompat.app.AppCompatActivity;
import android.view.View;

    // Khai báo các đối tượng gán với đkhiển tương ứng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }
        void TimDieuKhien(){
            editTextso1 =(EditText) findViewById (R.id.edtSo1);
            editTextso2 =(EditText) findViewById (R.id.edtSo2);
            editTextKQ =(EditText) findViewById (R.id.edtKQ);
        }

        // Xử lý cộng
        void XuLy/cong(View v) {
            // Code cộng ở đây
            //b1. Lấy dữ liệu 2 số
            //b1.1. Tìm EditText số 1 và số 2
            //b1.2. Lấy dữ liệu từ 2 đkhiển đó

            String soThu1= editTextSo1.getText().toString();
            String soThu2= editTextSo2.getText().toString();
            //b1.3. Chuyển dữ liệu từ chuỗi sang số
            float_soA = Float.parseFloat(soThu1);
            float_soB = Float.parseFloat(soThu2);
            // Tính toán
            float_Tong = soA + soB;
            //b3. Hiện kết quả
            //b3.1.
            EditText editTextsoKQ =(EditText) findViewById (R.id.edtKetQua);
            //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
            String chuoiKQ = String.valueOf(Tong);
            //B3.3. gán kết quả lên đk
            editTextKQ.setText(chuoiKQ);

        }
        // Xử lý trừ
        void XuLy/tru(View v) {
            // Code trừ ở đây
            //b1. Lấy dữ liệu 2 số
            //b1.1. Tìm EditText số 1 và số 2
            //b1.2. Lấy dữ liệu từ 2 đkhiển đó

            String soThu1= editTextSo1.getText().toString();
            String soThu2= editTextSo2.getText().toString();
            //b1.3. Chuyển dữ liệu từ chuỗi sang số
            float_soA = Float.parseFloat(soThu1);
            float_soB = Float.parseFloat(soThu2);
            // Tính toán
            float_Tong = soA - soB;
            //b3. Hiện kết quả
            //b3.1.
            EditText editTextsoKQ =(EditText) findViewById (R.id.edtKetQua);
            //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
            String chuoiKQ = String.valueOf(Tong);
            //B3.3. gán kết quả lên đk
            editTextKQ.setText(chuoiKQ);

        }

        // Xử lý nhân
        void XuLy/nhan(View v) {
            // Code nhân ở đây
            // Code cộng ở đây
            //b1. Lấy dữ liệu 2 số
            //b1.1. Tìm EditText số 1 và số 2
            //b1.2. Lấy dữ liệu từ 2 đkhiển đó

            String soThu1= editTextSo1.getText().toString();
            String soThu2= editTextSo2.getText().toString();
            //b1.3. Chuyển dữ liệu từ chuỗi sang số
            float_soA = Float.parseFloat(soThu1);
            float_soB = Float.parseFloat(soThu2);
            // Tính toán
            float_Tong = soA * soB;
            //b3. Hiện kết quả
            //b3.1.
            EditText editTextsoKQ =(EditText) findViewById (R.id.edtKetQua);
            //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
            String chuoiKQ = String.valueOf(Tong);
            //B3.3. gán kết quả lên đk
            editTextKQ.setText(chuoiKQ);

        }

        // Xử lý chia
        void XuLy/chia(View v) {
            // Code chia ở đây
            // Code cộng ở đây
            //b1. Lấy dữ liệu 2 số
            //b1.1. Tìm EditText số 1 và số 2
            //b1.2. Lấy dữ liệu từ 2 đkhiển đó

            String soThu1= editTextSo1.getText().toString();
            String soThu2= editTextSo2.getText().toString();
            //b1.3. Chuyển dữ liệu từ chuỗi sang số
            float_soA = Float.parseFloat(soThu1);
            float_soB = Float.parseFloat(soThu2);
            // Tính toán
            float_Tong = soA / soB;
            //b3. Hiện kết quả
            //b3.1.
            EditText editTextsoKQ =(EditText) findViewById (R.id.edtKetQua);
            //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
            String chuoiKQ = String.valueOf(Tong);
            //B3.3. gán kết quả lên đk
            editTextKQ.setText(chuoiKQ);
}