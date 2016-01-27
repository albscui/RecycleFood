package com.uofthacks.recyclefood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.uofthacks.Model.DBHandler;
import com.uofthacks.Model.Products;

public class EditPersonActivity extends Activity {

    EditText firstNameInput;
    TextView firstNameText;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_person);

        firstNameInput = (EditText) findViewById(R.id.editFirstName);
        firstNameText = (TextView) findViewById(R.id.textTest);
        dbHandler = new DBHandler(this, null, null, 1);

        printDatabase();

        TextView balanceText = (TextView) findViewById(R.id.textBalance);
        balanceText.setText("balance placeholder");

        TextView ratingText = (TextView) findViewById(R.id.textRating);
        ratingText.setText("rating placeholder");
    }

    //Add a product to the database
    public void addButtonClicked(View view){
        Products product = new Products(firstNameInput.getText().toString());
        dbHandler.addProduct(product);
        printDatabase();
    }

    //Delete items
    public void deleteButtonClicked(View view){
        String inputText = firstNameInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
    }
    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        firstNameText.setText(dbString);
        firstNameInput.setText("");
    }

    public void saveUserInfo(View view){

    }

}
