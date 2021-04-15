package ro.pub.cs.systems.eim.practicaltest01va04;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.SyncStateContract;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class PracticalTest01Var0MainActivity extends AppCompatActivity {

    private EditText  nameEditText, groupEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var04_main);

        nameEditText = (EditText) findViewById(R.id.name_edit_text);
        groupEditText = (EditText) findViewById(R.id.group_edit_text);

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

        if (savedInstanceState != null) {
            if (savedInstanceState.containsKey(Constants.NAME_TEXT)) {
                nameEditText.setText(savedInstanceState.getString(Constants.NAME_TEXT));
            } else {
                nameEditText.setText(String.valueOf("Studentul Perfect"));
            }
            if (savedInstanceState.containsKey(Constants.GROUP_TEXT)) {
                groupEditText.setText(savedInstanceState.getString(Constants.GROUP_TEXT));
            } else {
                groupEditText.setText(String.valueOf("343C4"));
            }
        } else {
            nameEditText.setText(String.valueOf("Studentul Perfect"));
            groupEditText.setText(String.valueOf("343C4"));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString(Constants.NAME_TEXT, nameEditText.getText().toString());
        savedInstanceState.putString(Constants.GROUP_TEXT, groupEditText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if (savedInstanceState.containsKey(Constants.NAME_TEXT)) {
            nameEditText.setText(savedInstanceState.getString(Constants.NAME_TEXT));
        } else {
            nameEditText.setText(String.valueOf("Studentul Perfect"));
        }
        if (savedInstanceState.containsKey(Constants.GROUP_TEXT)) {
            groupEditText.setText(savedInstanceState.getString(Constants.GROUP_TEXT));
        } else {
            groupEditText.setText(String.valueOf("343C4"));
        }
    }

}