package com.example.productsbase;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager = findViewById(R.id.viewPager);
        FloatingActionButton addNewPage = findViewById(R.id.addNewPage);

        // Создаем список данных для страниц
        List<Product> productList = new ArrayList<>();

        //Создаем двумерный массив с продуктами, через который мы будем пробегать циклом
        //и добавлять в productList
        String[][] products = {
                {"ВИД № 1.1", "22x36 (6)", "220", "360", "2 х 60+", "6", "20.8 гр (4 стола)", "25х25", "80", "100 (2x50)", "~114 гр", "9.2 - 9.4"},
                {"ВИД № 1.2", "22x36 (7)", "220", "360", "2 х 60+", "7", "23.8 гр (4 стола)", "25х25", "80", "100 (2x50)", "~131 гр", "10.5 - 10.7"},
                {"ВИД № 1.3", "22x39 (7)", "220", "390", "2 х 60+", "7", "23 гр (4 стола)", "25х26", "70", "100 (2x50)", "~138 гр", "9.7 - 9.9"},
                {"ВИД № 1.4", "22x39 (8)", "220", "390", "2 х 60+", "8", "25.6 гр (4 стола)", "25х26", "70", "100 (2x50)", "~155 гр", "10.8 - 11"},
                {"ВИД № 1.5", "24x43 (8)", "240", "430", "2 х 70+", "8", "31 гр (4 стола)", "28х31", "20", "250 (5x50)", "~510 гр", "10.2 - 10.4"},
                {"ВИД № 1.5.1", "24x43 (8)", "240", "430", "2 х 70+", "8", "31 гр (4 стола)", "28х31", "25", "200 (4x50)", "~410 гр", "10.2 - 10.4"},
                {"ВИД № 1.6", "22x43 (9)", "220", "430", "2 х 60+", "9", "31.5 гр (4 стола)", "28х31", "25", "200 (4x50)", "~426 гр", "10.7 - 10.9"},
                {"ВИД № 1.7", "24x45 (9)", "240", "450", "2 х 70+", "9", "33.7 гр (4 стола)", "28х32", "20", "250 (5x50)", "~580 гр", "11.6 - 11.8"},
                {"ВИД № 1.8", "24x45 (10)", "240", "450", "2 х 70+", "10", "40.3 гр (4 стола)", "28х32", "20", "200 (4x50)", "~555 гр", "11.1 - 11.3"},
                {"ВИД № 1.9", "24x45 (12)", "240", "450", "2 х 70+", "12", "45.3 гр (4 стола)", "28х32", "20", "200 (4x50)", "~635 гр", "12.7 - 12.9"},
                {"ВИД № 1.10", "18х35 (5)", "180", "350", "2 х 40", "5", "22.2 гр (6 столiв)", "ЖОВТА УКРАЇНА \nЗ КАРТОНКОЮ", "10", "1000", "~930 гр", "9.4 - 9.6"},
                {"ВИД № 1.11", "18х35 (7)", "180", "350", "2 х 40", "7", "28.2 гр (6 столiв)", "ЗЕЛЕНА УКРАЇНА \nЗ КАРТОНКОЮ", "10", "700", "~850 гр", "8.6 - 8.8"},
                {"ВИД № 1.12", "18х42 (7)", "180", "420", "2 х 40", "7", "28.2 гр (6 столiв)", "ЗЕЛЕНА \nБЕЗ КАРТОНКИ", "10", "700", "~985 гр", "9.9 - 10.1"},
                {"ВИД № 1.13", "26х45 (7)", "260", "450", "0", "7", "28.2 гр (6 столiв)", "30х30", "20", "400 (4 х 100)", "~600 гр", "12.1 - 12.3"}
        };

        for (int i = 0; i < products.length; i++) {
            // Инициализируем новый продукт с нужными характеристиками из массива products
            Product product = new Product(
                    products[i][0],
                    products[i][1],
                    products[i][2],
                    products[i][3],
                    products[i][4],
                    products[i][5],
                    products[i][6],
                    products[i][7],
                    products[i][8],
                    products[i][9],
                    products[i][10],
                    products[i][11]
            );

            // Добавляем новосозданный продукт в наш массив productList
            productList.add(product);
        }



        ViewPagerAdapter adapter = new ViewPagerAdapter(productList);
        viewPager.setAdapter(adapter);

        //Добавляем новый элемент
        addNewPage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               showInputDialog();
            }
        });


        // Здесь вызываем метод для отображения диалогового окна
        findViewById(R.id.addNewPage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInputDialog();
            }
        });
    }

    private void showInputDialog() {
        // Создаем EditText для ввода
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT); // Настройка типа ввода

        // Создаем диалоговое окно
        new AlertDialog.Builder(this)
                .setTitle("Введите данные")
                .setMessage("Введите ваше сообщение:")
                .setView(input) // Добавляем EditText в диалог
                .setTitle("Введите данные")
                .setMessage("Введите ваше сообщение:")
                .setView(input) // Добавляем EditText в диалог
                .setTitle("Введите данные")
                .setMessage("Введите ваше сообщение:")
                .setView(input) // Добавляем EditText в диалог
                .setMessage("Введите ваше сообщение:")
                .setView(input) // Добавляем EditText в диалог
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String userInput = input.getText().toString(); // Получаем введенные данные
                        handleUserInput(userInput); // Обрабатываем данные
                    }
                })
                .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel(); // Закрываем диалог при отмене
                    }
                })
                .show();
    }

    // Метод для обработки пользовательского ввода
    private void handleUserInput(String input) {
        // Например, выводим данные через Toast или используем их в логике активности
        Toast.makeText(this, "Введено: " + input, Toast.LENGTH_SHORT).show();
        // Здесь можно добавить любую логику для работы с данными
    }
}

