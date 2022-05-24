package kiemtra.phi.sinhvien;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    EditText chieucao,canhday,canhben;
    Button tinhChuvi, tinhDientich;
    TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        chieucao = (EditText)findViewById(R.id.chieucao);
        canhben = (EditText)findViewById(R.id.canhben);
        canhday = (EditText)findViewById(R.id.day);
        tinhChuvi = (Button)findViewById(R.id.tinhChuVi);
        tinhDientich = (Button)findViewById(R.id.tinhDienTich);
        ketqua = (TextView)findViewById(R.id.ketqua);

        tinhChuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ccao = Integer.parseInt(chieucao.getText().toString());
                int day = Integer.parseInt(canhday.getText().toString());
                int kqua = (ccao + day) * 2;
                ketqua.setText("Chu vi hinh binh hanh la: " + kqua);
            }
        });


        tinhDientich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ccao = Integer.parseInt(chieucao.getText().toString());
                int day = Integer.parseInt(canhday.getText().toString());
                int kqua = ccao * day;
                ketqua.setText("Dien tich hinh binh hanh la: " + kqua);

            }
        });



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
