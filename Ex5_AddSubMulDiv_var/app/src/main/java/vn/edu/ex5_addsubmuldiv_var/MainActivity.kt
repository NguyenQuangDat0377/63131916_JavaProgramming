package vn.edu.ex5_addsubmuldiv_var

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import vn.edu.ex5_addsubmuldiv_var.ui.theme.Ex5_AddSubMulDiv_varTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ex5_AddSubMulDiv_varTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ex5_AddSubMulDiv_varTheme {
        Greeting("Android")
    }
}

public class MainActivity extends AppCompaActivity {

    @Override
    protect void onCreate(Bundle savedInstanceState) {
        super.OnCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tìm view
        TimView();
        // Gắn các bộ lắng nghe
        btnCong.setOnCLickListener(boLangNghe_XulyCong);
        btnTru.setOnCLickListener(boLangNghe_XulyTru);
        btnNhan.setOnCLickListener(boLangNghe_XulyNhan);
        btnChia.setOnCLickListener(boLangNghe_XulyChia);

    }
    //-----------------------------------------------------
    // Tạo các bộ lắng nghe và xử lý sự kiện
    View.OnClickListener boLangNghe_XuLyCong = new View.OnClickListener() {
        @Override
        public void onCLick(View view)
        // Code xử lý cộng ở đây
        //1. Lấy số 1
        String strSo1 = etdSo1 = edtSoA.getText().toString();
        String strSo2 - etdSo2 = edtSoB.getText().toString();
        //b2. Chuyển thành số để tính toán
        double soA = Double.parseDouble(strSo1);
        double soB = Double.parseDouble(strSo2);
        //b3. Tính toán
        double tong = soA + soB;
        //b4. Xuất
        String strKQ = String.value(tong);
        tvKetQua.setText(strKQ);

    }
    //-----------------------------------------------------

    // Tạo các bộ lắng nghe và xử lý sự kiện
    View.OnClickListener boLangNghe_XuLyTru = new View.OnClickListener() {
        @Override
        public void onCLick(View view)
        // Code xử lý cộng ở đây
        //1. Lấy số 1
        String strSo1 = etdSo1 = edtSoA.getText().toString();
        String strSo2 - etdSo2 = edtSoB.getText().toString();
        //b2. Chuyển thành số để tính toán
        double soA = Double.parseDouble(strSo1);
        double soB = Double.parseDouble(strSo2);
        //b3. Tính toán
        double tong = soA - soB;
        //b4. Xuất
        String strKQ = String.value(tong);
        tvKetQua.setText(strKQ);

    }

    //-----------------------------------------------------

    // Tạo các bộ lắng nghe và xử lý sự kiện
    View.OnClickListener boLangNghe_XuLyTNhan = new View.OnClickListener() {
        @Override
        public void onCLick(View view)
        // Code xử lý cộng ở đây
        //1. Lấy số 1
        String strSo1 = etdSo1 = edtSoA.getText().toString();
        String strSo2 - etdSo2 = edtSoB.getText().toString();
        //b2. Chuyển thành số để tính toán
        double soA = Double.parseDouble(strSo1);
        double soB = Double.parseDouble(strSo2);
        //b3. Tính toán
        double tong = soA * soB;
        //b4. Xuất
        String strKQ = String.value(tong);
        tvKetQua.setText(strKQ);

    }


    //-----------------------------------------------------

    // Tạo các bộ lắng nghe và xử lý sự kiện
    View.OnClickListener boLangNghe_XuLyChia = new View.OnClickListener() {
        @Override
        public void onCLick(View view)
        // Code xử lý cộng ở đây
        //1. Lấy số 1
        String strSo1 = etdSo1 = edtSoA.getText().toString();
        String strSo2 - etdSo2 = edtSoB.getText().toString();
        //b2. Chuyển thành số để tính toán
        double soA = Double.parseDouble(strSo1);
        double soB = Double.parseDouble(strSo2);
        //b3. Tính toán
        double tong = soA / soB;
        //b4. Xuất
        String strKQ = String.value(tong);
        tvKetQua.setText(strKQ);

    }

    //-----------------------------------------------------


    public void_TimView() {
        edtSoA = (EditText) findViewById(R.id.editTextA);
        edtSoB = (EditText) findViewById(R.id.editTextB);
        btnCong = (Button) findViewById(R.id.buttonCong);
        btnTru = (Button) findViewById(R.id.buttonTru);
        btnNhan = (Button) findViewById(R.id.buttonNhan);
        btnChia = (Button) findViewById(R.id.buttonChia);
        tvKetQua = (TextView) findViewById(R.id.textViewKQ);
    }

    // Khai bóa các đối tượng tương ứng với các điều khiển (view) cần thao tác
    EditText edtSoA;
    EditText edtSoB;
    Button btnCong,btnTru, btnNhan, btnChia;
    TextView tvKetQua;




}