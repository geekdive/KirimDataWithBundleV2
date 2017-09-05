package id.co.decoded.moeslim.kirimdatawithbundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView viewNama = (TextView)findViewById(R.id.txNama);
        TextView viewEmail = (TextView)findViewById(R.id.txEmail);

        if(getIntent().getExtras() != null){
            Bundle tampungBundle = getIntent().getExtras();
            viewNama.setText(tampungBundle.getString("NamaLengkapUser"));
            viewEmail.setText(tampungBundle.getString("EmailUserValid"));
        }else{

        }
    }
}
