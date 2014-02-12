package com.kit.dairymanager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	//Declaring activity's views.
	private Button btnLogin;
    private EditText edtTxtUserName,edtTxtPassword;

    
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Define/set activities screen.
		setContentView(R.layout.activity_login);
		
		//Initializing activity views.
		edtTxtUserName=(EditText) findViewById(R.id.userName);
		edtTxtPassword=(EditText) findViewById(R.id.password);
		btnLogin=(Button) findViewById(R.id.loginButton);
		
		//Adding on click listener to  login button.
		btnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (edtTxtUserName.getText().toString().equals("manoj")&& edtTxtPassword.getText().toString().equals("dgm")) {
					//Here u can use application or activity context for toast context.
					Toast.makeText(LoginActivity.this,"Login Successfully !!!", Toast.LENGTH_LONG).show();
				} else {
					Toast.makeText(LoginActivity.this,"Invalid Username/Password. Try Agin!!", Toast.LENGTH_LONG).show();
				}
				 
				 
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
