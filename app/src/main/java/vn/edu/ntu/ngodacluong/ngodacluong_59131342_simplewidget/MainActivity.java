package vn.edu.ntu.ngodacluong.ngodacluong_59131342_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtNgaySinh, edtSTK;
    RadioGroup rdgGioiTinh, rdgSoThich;
    Button btXacNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }
    private void addViews()
    {
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSTK = findViewById(R.id.edtSTK);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        rdgSoThich = findViewById(R.id.rdgSoThich);
        btXacNhan = findViewById(R.id.btXacNhan);
    }
    private void addEvents()
    {
        btXacNhan.setOnClickListener((v)->{suKien();});

    }
    //dinh nghia ham suKien
    private void suKien()
    {

    }
}
