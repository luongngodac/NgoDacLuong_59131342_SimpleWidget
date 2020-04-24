package vn.edu.ntu.ngodacluong.ngodacluong_59131342_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtNgaySinh, edtSTK;
    RadioGroup rdgGioiTinh, rdgSoThich;
    Button btXacNhan;
    TextView txtKQ;
    RadioButton rdbNam, rdbNu;
    CheckBox cbPhim, cbNhac, cbCafe, cbONha, cbNauAn;
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
        txtKQ = findViewById(R.id.txtKQ);
        rdbNam = (RadioButton)findViewById(R.id.rdbNam);
        rdbNu = (RadioButton)findViewById(R.id.rdbNu);
        cbPhim = (CheckBox)findViewById(R.id.cbPhim);
        cbNhac = (CheckBox)findViewById(R.id.cbNhac);
        cbCafe = (CheckBox)findViewById(R.id.cbCafe);
        cbONha = (CheckBox)findViewById(R.id.cbONha);
        cbNauAn = (CheckBox)findViewById(R.id.cbNauAn);
    }

    private void addEvents()
    {
        btXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suKien();
            }
        });
    }
    //dinh nghia ham suKien
    private void suKien()
    {
        String textKQ = "";
        textKQ = txtKQ.getText().toString();
        textKQ = textKQ + edtTen.getText() + "\nNgày sinh: " + edtNgaySinh.getText() +"\nGiới tính: ";
        if(rdgGioiTinh.getCheckedRadioButtonId() == R.id.rdbNam)
        {
            textKQ = textKQ + rdbNam.getText();
        }
        else
        {
            textKQ = textKQ + rdbNu.getText();
        }
        textKQ = textKQ + "\nSở thích: ";
        if(cbPhim.isChecked())
        {
            textKQ = textKQ + cbPhim.getText() +"; ";
        }
        if(cbNhac.isChecked())
        {
            textKQ = textKQ + cbNhac.getText() +"; ";
        }
        if(cbCafe.isChecked())
        {
            textKQ = textKQ +cbCafe.getText() +"; ";
        }
        if(cbONha.isChecked())
        {
            textKQ = textKQ + cbONha.getText() +"; ";
        }
        if(cbNauAn.isChecked())
        {
            textKQ = textKQ + cbNauAn.getText() +"; ";
        }
        textKQ = textKQ + edtSTK.getText();



        Toast.makeText(MainActivity.this, textKQ, Toast.LENGTH_LONG).show();
    }
}
//        sologan = String.valueOf(tvName.getText());
//        if (cbMautim.isChecked()) {
//            sologan = sologan + cbMautim.getText() + " - ";
//        }
//        if (cbMauhong.isChecked()) {
//            sologan = sologan + cbMauhong.getText() + " - ";
//        }
//        Toast.makeText(MainActivity.this, sologan, Toast.LENGTH_LONG).show();