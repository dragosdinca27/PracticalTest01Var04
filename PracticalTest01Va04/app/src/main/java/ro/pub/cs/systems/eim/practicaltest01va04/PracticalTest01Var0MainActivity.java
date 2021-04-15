package ro.pub.cs.systems.eim.practicaltest01va04;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class PracticalTest01Var0MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var04_main);

        EditText nameEditText = (EditText) findViewById(R.id.name_edit_text);
        EditText groupEditText = (EditText) findViewById(R.id.group_edit_text);

        CheckBox nameCheckBox = (CheckBox) findViewById(R.id.name_check_box);
        CheckBox groupCheckBox = (CheckBox) findViewById(R.id.group_check_box);

        Button displayInformation = (Button) findViewById(R.id.display_information_button);

        TextView resultText = (TextView) findViewById(R.id.result_text);


        displayInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameText = nameEditText.getText().toString();
                String groupText = groupEditText.getText().toString();

                if (nameCheckBox.isChecked()) {
                    if (nameText == null){
                        Toast.makeText(getApplicationContext(), "Name not set", Toast.LENGTH_LONG).show();
                    } else {
                        resultText.setText(nameText);
                    }
                if (nameCheckBox.isChecked()) {
                    if (groupText == null){
                        Toast.makeText(getApplicationContext(), "Group not set", Toast.LENGTH_LONG).show();
                    } else {
                        resultText.setText(groupText);
                    }

                }}
            }
        });
    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle savedInstanceState) {
//        super.onSaveInstanceState(savedInstanceState);
//        savedInstanceState.putString(Constants.LEFT_COUNT, nameEditText.getText().toString());
//        savedInstanceState.putString(Constants.RIGHT_COUNT, rightEditText.getText().toString());
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        if (savedInstanceState.containsKey(Constants.LEFT_COUNT)) {
//            nameEditText.setText(savedInstanceState.getString(Constants.LEFT_COUNT));
//        } else {
//            nameEditText.setText(String.valueOf(0));
//        }
//        if (savedInstanceState.containsKey(Constants.RIGHT_COUNT)) {
//            groupEditText.setText(savedInstanceState.getString(Constants.RIGHT_COUNT));
//        } else {
//            groupEditText.setText(String.valueOf(0));
//        }
//    }

}