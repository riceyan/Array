package sg.edu.rp.c346.id21017809.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;
    //ArrayList<String>fruits = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        //fruits.add("apple");
        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";

        String text = "Fruits\n";
        text += "=====\n";

        for (int i = 0; i<fruits.length(); i++) {
            text += fruits.get(i) + "\n";
        }

    }
}