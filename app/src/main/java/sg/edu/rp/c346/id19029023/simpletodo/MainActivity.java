package sg.edu.rp.c346.id19029023.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText edt;
Button add;
Button clear;
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = findViewById(R.id.taskname);
        add = findViewById(R.id.buttonadd);
        clear = findViewById(R.id.buttonclear);
        lv = findViewById(R.id.taskslist);
        final ArrayList<String> list = new ArrayList<String>();
        final ArrayAdapter<String > alist = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        lv.setAdapter(alist);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = edt.getText().toString();
                list.add(text);
                alist.notifyDataSetChanged();

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.clear();
                alist.notifyDataSetChanged();
            }
        });
    }
}
