package com.example.rishabh.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void Increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void Decrement(View view) {
        if (quantity != 0) {
            quantity = quantity - 1;
            display(quantity);
        }

    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.textView2);
        quantityTextView.setText("" + number);
    }

    private void displaytext() {
        CheckBox whipped = (CheckBox) findViewById(R.id.checkBox2);
        boolean whippedCheckedchecked = whipped.isChecked();
        CheckBox choco = (CheckBox) findViewById(R.id.checkBox);
        boolean chocoChecked = choco.isChecked();
        TextView magic = (TextView) findViewById(
                R.id.textView);
        EditText Tname = (EditText) findViewById(R.id.EDIT);
        String name = Tname.getText().toString();


        if (whippedCheckedchecked == true && chocoChecked == false) {
            magic.setText("Hii " + name + " Your order has been Placed With WhippedCream ");
        }

        if (whippedCheckedchecked == false && chocoChecked == true) {
            magic.setText("Hii " + name + " Your order has been Placed With ChocoChips ");
        }

        if (whippedCheckedchecked == true && chocoChecked == true) {
            magic.setText("Hii " + name + " Your order has been Placed With Both Extras ");
        }
        if (whippedCheckedchecked == false && chocoChecked == false) {
            magic.setText("Hii " + name + " Your order has been Placed of simple coffee. ");
        }
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.zero);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


    public void submitOrder(View view) {

        CheckBox whipped = (CheckBox) findViewById(R.id.checkBox2);
        boolean whippedCheckedchecked = whipped.isChecked();
        CheckBox choco = (CheckBox) findViewById(R.id.checkBox);
        boolean chocoChecked = choco.isChecked();

        if (whippedCheckedchecked == true && chocoChecked == false) {
            displayPrice(quantity * 10 + quantity * 5);
        }

        if (whippedCheckedchecked == false && chocoChecked == true) {
            displayPrice(quantity * 10 + quantity * 5);
        }

        if (whippedCheckedchecked == true && chocoChecked == true) {
            displayPrice(quantity * 10 + quantity * 10);
        }

        if (whippedCheckedchecked == false && chocoChecked == false) {
            displayPrice(quantity * 10);
        }


        displaytext();
    }

}