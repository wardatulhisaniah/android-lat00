package id.ac.poliban.mi.atul.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menentukan layout yang digunakan oleh MainActivity
        //ada di folder res/layout
        setContentView(R.layout.activity_main);

        //hubungkan view/ komponen yang ada di layout
        //ke object dari kelas yang sesuai dengan view/komponen tersebut
        Button btFirst = findViewById(R.id.btFirst);
        Button btSecond = findViewById(R.id.btSecond);
        Button btThird = findViewById(R.id.btThird);
        Button btForth = findViewById(R.id.btForth);
        //memasang event listener kepada masing2 object Button
        //Dengan parameter this (object dari kelas sekarang)
        btFirst.setOnClickListener(this);
        btSecond.setOnClickListener(this);
        btThird.setOnClickListener(this);
        btForth.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btFirst :
                Toast.makeText(this, "Hei Anda Sudah Mengklik tombol First", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btSecond :
                Toast.makeText(this, "Hei Anda Sudah Mengklik tombol Second", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btThird :
                Toast.makeText(this, "Hei Anda Sudah Mengklik tombol Third", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btForth :
                Toast.makeText(this, "Hei Anda Sudah Mengklik tombol Forth", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
