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


                suKien1();
                suKien2();
                suKien3();
                suKien4();
                suKien5();
            }
        });

    }
    //dinh nghia ham suKien
    private void suKien1()
    {
        String editTen = edtTen.getText().toString().trim();
        edtTen.setText(editTen);
        Toast.makeText(getApplicationContext(), editTen , Toast.LENGTH_SHORT).show();
    }
    private  void suKien2()
    {
        String editNgaySinh = edtNgaySinh.getText().toString().trim();
        edtNgaySinh.setText(editNgaySinh);
        Toast.makeText(getApplicationContext(), editNgaySinh, Toast.LENGTH_SHORT).show();
    }
    private void suKien3()
    {
        StringBuffer result = new StringBuffer();
        result.append(rdbNam.isChecked());
        result.append(rdbNu.isChecked());
        Toast.makeText(getApplicationContext(), result.toString(),Toast.LENGTH_LONG).show();
    }
    private void suKien4()
    {
        StringBuffer resultcb = new StringBuffer();
        resultcb.append(cbPhim.isChecked());
        resultcb.append(cbNhac.isChecked());
        resultcb.append(cbCafe.isChecked());
        resultcb.append(cbONha.isChecked());
        resultcb.append(cbNauAn.isChecked());
        Toast.makeText(getApplicationContext(), resultcb.toString(), Toast.LENGTH_LONG).show();
    }
    private void suKien5()
    {
        String editSTK = edtSTK.getText().toString().trim();
        edtSTK.setText(editSTK);
        Toast.makeText(getApplicationContext(), editSTK, Toast.LENGTH_SHORT).show();
    }

    /** Called when the user touches the button */




//    final CheckBox checkBox = findViewById(R.id.checkbox_id);
////Kiểm tra checked
//if (checkBox.isChecked())
//    {
//        //Checked
//    }
//else
//    {
//        //Unchecked
//    }
//
//    //Thiết lập trạng thái check
//    boolean toi_chon = true;
//checkBox.setChecked(toi_chon);
//
////Bắt sự kiện thay đổi trạng thái
//checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//            //Code khi trạng thái check thay đổi
//            Toast.makeText(
//                    compoundButton.getContext(),
//                    compoundButton.getText()+"|"+b,
//                    Toast.LENGTH_SHORT).show();
//        }
//    });
//
////Bắt sự kiện Click
//checkBox.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(
//                    view.getContext(), "Click!",
//                    Toast.LENGTH_SHORT).show();
//        }
//    });

}
