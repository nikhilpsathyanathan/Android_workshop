package in.makesimple.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText input_username = (EditText) findViewById(R.id.name);
        final EditText input_password = (EditText) findViewById(R.id.pass);

        Button login = (Button) findViewById(R.id.signin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = input_username.getText().toString().trim();
                String password = input_password.getText().toString().trim();


                if (TextUtils.isEmpty(name)) {
                    Toast.makeText(getApplicationContext(), "Enter user name", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.length() < 6) {
                    Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (name.equals("admin") && password.equals("12345678")) {
                    Toast.makeText(getApplicationContext(), "Login completed", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, SecondActivity.class));
                } else {
                    Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
