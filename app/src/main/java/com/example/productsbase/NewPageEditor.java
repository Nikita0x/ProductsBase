package com.example.productsbase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class NewPageEditor extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_page_editor);

        TextInputEditText titleValue = findViewById(R.id.titleValue);
        TextInputEditText numberValue = findViewById(R.id.numberValue);
        TextInputEditText generalWidthValue = findViewById(R.id.generalWidthValue);
        TextInputEditText generalLengthValue = findViewById(R.id.generalLengthValue);
        TextInputEditText generalFoldValue = findViewById(R.id.generalFoldValue);
        TextInputEditText generalThicknessValue = findViewById(R.id.generalThicknessValue);
        TextInputEditText generalWeightOfFilmValue = findViewById(R.id.generalWeightOfFilmValue);
        TextInputEditText packageOfPackagesValue = findViewById(R.id.packageOfPackagesValue);
        TextInputEditText amountOfPacksValue = findViewById(R.id.amountOfPacksValue);
        TextInputEditText packagesInPacksValue = findViewById(R.id.packagesInPacksValue);
        TextInputEditText weightOfPackValue = findViewById(R.id.weightOfPackValue);
        TextInputEditText weightOfBagValue = findViewById(R.id.weightOfBagValue);
        Button saveButton = findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = Objects.requireNonNull(titleValue.getText()).toString();
                String number = Objects.requireNonNull(numberValue.getText()).toString();
                String generalWidth = Objects.requireNonNull(generalWidthValue.getText()).toString();
                String generalLength = Objects.requireNonNull(generalLengthValue.getText()).toString();
                String generalFold = Objects.requireNonNull(generalFoldValue.getText()).toString();
                String generalThickness = Objects.requireNonNull(generalThicknessValue.getText()).toString();
                String generalWeightOfFilm = Objects.requireNonNull(generalWeightOfFilmValue.getText()).toString();
                String packageOfPackages = Objects.requireNonNull(packageOfPackagesValue.getText()).toString();
                String amountOfPacks = Objects.requireNonNull(amountOfPacksValue.getText()).toString();
                String packagesInPacks = Objects.requireNonNull(packagesInPacksValue.getText()).toString();
                String weightOfPack = Objects.requireNonNull(weightOfPackValue.getText()).toString();
                String weightOfBag = Objects.requireNonNull(weightOfBagValue.getText()).toString();

                Product newPage = new Product(title, number, generalWidth, generalLength, generalFold, generalThickness, generalWeightOfFilm, packageOfPackages, amountOfPacks, packagesInPacks, weightOfPack, weightOfBag);

                Intent intent = new Intent(NewPageEditor.this, MainActivity.class);
                intent.putExtra("data_key", (CharSequence) newPage);
                startActivity(intent);
            }
        });

    }
}
