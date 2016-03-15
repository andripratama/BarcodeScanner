package geek.nekad.barcodescanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button scannerButton;
    private TextView textBarcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textBarcode = (EditText) findViewById(R.id.edit_barcode);

        //menerima parsing Intent dari BarcodeScanner.java
        Intent intent = getIntent();

        String barcodeString = intent.getStringExtra("value");
        textBarcode.setText(barcodeString);




        scannerButton = (Button) findViewById(R.id.scannerButton);

        scannerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BarcodeScanner.class);
                startActivity(intent);
            }
        });
    }
}
