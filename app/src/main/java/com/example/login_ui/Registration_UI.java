package com.example.login_ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registration_UI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_ui);

        Button submitButton = findViewById(R.id.Submit);
        submitButton.setOnClickListener(view -> {
            // Perform validation before allowing submission
            if (isFormValid()) {
                // Start the main activity when the Submit button is clicked
                Intent intent = new Intent(Registration_UI.this, MainActivity.class);
                startActivity(intent);

                // Finish the current activity to remove it from the back stack
                finish();
            } else {
                // Display a message indicating that all required fields must be filled
                Toast.makeText(Registration_UI.this, "Please fill out all required fields", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean isFormValid() {
        // Check if all required fields are filled out
        EditText usernameInput = findViewById(R.id.signup_username_input);
        EditText passwordInput = findViewById(R.id.signup_password_input);
        EditText confirmPasswordInput = findViewById(R.id.confirm_password_input);
        EditText firstnameInput = findViewById(R.id.firstname_input);
        EditText lastnameInput = findViewById(R.id.lastname_input);
        EditText emailInput = findViewById(R.id.email_input);
        RadioGroup genderRadioGroup = findViewById(R.id.rgGender);

        // Add additional validation rules as needed
        return !TextUtils.isEmpty(usernameInput.getText())
                && !TextUtils.isEmpty(passwordInput.getText())
                && !TextUtils.isEmpty(confirmPasswordInput.getText())
                && !TextUtils.isEmpty(firstnameInput.getText())
                && !TextUtils.isEmpty(lastnameInput.getText())
                && !TextUtils.isEmpty(emailInput.getText())
                && genderRadioGroup.getCheckedRadioButtonId() != -1;
    }
}