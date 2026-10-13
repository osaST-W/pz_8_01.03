package com.example.pz_8;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Лук", "кг."));
        products.add(new Product("Чай", "шт."));
        products.add(new Product("Яйца", "шт."));
        products.add(new Product("Молоко", "л."));
        products.add(new Product("Сахар", "кг."));
        products.add(new Product("Картофель", "кг."));

        ListView productList = findViewById(R.id.productList);
        final ProductAdapter adapter = new ProductAdapter(this, R.layout.list_item, products);
        productList.setAdapter(adapter);

        final EditText nameInput = findViewById(R.id.nameInput);
        final EditText unitInput = findViewById(R.id.unitInput);
        Button createButton = findViewById(R.id.createButton);

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameInput.getText().toString();
                String unit = unitInput.getText().toString();

                if (name.length() > 0 && unit.length() > 0) {
                    products.add(new Product(name, unit));
                    adapter.notifyDataSetChanged();
                    nameInput.setText("");
                    unitInput.setText("");
                }
            }
        });
    }
}
