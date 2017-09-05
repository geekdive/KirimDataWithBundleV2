package id.co.decoded.moeslim.kirimdatawithbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvNama = (TextView)findViewById(R.id.txtNama);
        final TextView tvEmail = (TextView)findViewById(R.id.txtEmail);

        Button btKirim = (Button)findViewById(R.id.btnKirimbdl);
        btKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle adpBundle = new Bundle();
                adpBundle.putString("NamaLengkapUser", tvNama.getText().toString());
                adpBundle.putString("EmailUserValid", tvEmail.getText().toString());

                Intent adpIntent = new Intent(mainActivity.this, homeActivity.class);
                //Resolve Alt+Enter putExtras
                adpIntent.putExtras(adpBundle);
                startActivity(adpIntent);
            }
        });

        Button btKirimIntent = (Button)findViewById(R.id.btnKirimIntent);
        btKirimIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainActivity.this, homeActivity.class);
                intent.putExtra("NamaLengkapUser", tvNama.getText().toString());
                intent.putExtra("EmailUserValid", tvEmail.getText().toString());
                startActivity(intent);
            }
        });
    }
}
