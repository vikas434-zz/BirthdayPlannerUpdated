package com.birthdayplanner.birthdayplanner;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Vikas on 24/01/16.
 * This is a test.
 */
public class PackageActivity extends Activity {
    private String TAG = PackageActivity.class.getSimpleName();
    private String POSITION = "position";
    private TextView price;
    private ListView listView;
    private String[] packageDetails;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int position = getIntent().getIntExtra(POSITION,0);
        Log.e(TAG, "Postion is "+position);
        setContentView(R.layout.package_1);
        price = (TextView) findViewById(R.id.tv_price);
        listView = (ListView) findViewById(R.id.listView1);
        setValue(position);

    }

    private void setValue(int position) {
        switch (position) {
            case 0: {
                price.setText("Total Price : 4499");
                packageDetails = getResources().getStringArray(R.array.package1);
                adapter = new ArrayAdapter<String>(this,R.layout.package_1, R.id.rowTextView, packageDetails);
                listView.setAdapter(adapter);
                break;
            }
        }
    }
}
