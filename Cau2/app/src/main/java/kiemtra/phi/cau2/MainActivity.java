package kiemtra.phi.cau2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Data
        ArrayList<String> listTho =  new ArrayList<String>();
        listTho.add("Viet Nam Que Huong Ta");
        listTho.add("Que Huong");
        listTho.add("Trang Giang");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listTho);
        ListView lv= (ListView)findViewById(R.id.listView_Cac_cai_tho);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // do sth
                // Cần làm Lấy về tên bài hát
                String tenBaiHat = listTho.get(i);
                // Chuyển Activity
                Intent intentBH = new Intent(MainActivity.this, ShowListThoActivity.class);
                // gói tên vào
                intentBH.putExtra("tenBH",tenBaiHat);
                // Đẩy sang
                startActivity(intentBH);
            }
        });
    }


}