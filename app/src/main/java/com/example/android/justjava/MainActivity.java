package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity=2;
    int numberOfCoffees=quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){
//        display(77*2+1);
//        display(numberOfCoffees);
//        displayPrice(numberOfCoffees*5);

        int price = quantity*5;
        String priceMessage = "Total: $"+ price;
        priceMessage = priceMessage + "\nThank you!";
        displayMessage(priceMessage);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    public void increment(View view){
//        int quantity=2;
        quantity=quantity*2;
        display(quantity);
    }
    public void decrement(View view){
//        int quantity=2;
        quantity= quantity/2;
        display(quantity);
    }
}
