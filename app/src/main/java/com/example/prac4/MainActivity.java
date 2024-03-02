package com.example.prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        GridLayout gridLayout = new GridLayout(this);
//
//        // Set the number of rows and columns for GridLayout
//        gridLayout.setRowCount(3);
//        gridLayout.setColumnCount(2);
//
//        // Create and add Buttons to GridLayout
//        for (int i = 0; i < 6; i++) {
//            Button button = new Button(this);
//            button.setText("Button " + (i + 1));
//
//            // Create LayoutParams to set the position and size of Button in GridLayout
//            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
//
//            // Define Button rows and columns using GridLayout.Spec
//            GridLayout.Spec rowSpec = GridLayout.spec(i / 2); // Hàng
//            GridLayout.Spec colSpec = GridLayout.spec(i % 2); // Cột
//            layoutParams.rowSpec = rowSpec;
//            layoutParams.columnSpec = colSpec;
//
//            // Set margin for Button
//            layoutParams.setMargins(10, 10, 10, 10); // left, top, right, bottom
//
//            // Set width and height for Button
//            layoutParams.width = GridLayout.LayoutParams.WRAP_CONTENT;
//            layoutParams.height = GridLayout.LayoutParams.WRAP_CONTENT;
//
//            // Add Button to GridLayout with specified LayoutParams
//            gridLayout.addView(button, layoutParams);
//        }
//
//        // Set ContentView for Activity to GridLayout
//        setContentView(gridLayout);
        setContentView(R.layout.activity_main);
//        LinearLayout linearLayout = new LinearLayout(this);
//        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
//        TextView textView = new TextView(this);
//        textView.setText("Hello");
//        textView.setTextSize(30);
//        // создаем параметры позиционирования для элемента
//        LinearLayout.LayoutParams layoutParams = new
//                LinearLayout.LayoutParams
//                (LinearLayout.LayoutParams.WRAP_CONTENT,
//                        LinearLayout.LayoutParams.WRAP_CONTENT);
//        // устанавливаем отступы
//        layoutParams.setMargins(100, 100, 0, 0);
//        textView.setLayoutParams(layoutParams);
//        // добавляем элемент в LinearLayout
//        linearLayout.addView(textView);
//        setContentView(linearLayout);
//        RelativeLayout relativeLayout = new RelativeLayout(this);
//        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.MATCH_PARENT, // width
//                RelativeLayout.LayoutParams.MATCH_PARENT); // height
//        relativeLayout.setLayoutParams(layoutParams);

        // Create a button
//        Button button = new Button(this);
//        button.setText("Hello World");
//
//        // Set the properties of Button in RelativeLayout.LayoutParams
//        RelativeLayout.LayoutParams buttonLayoutParams = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT, // width
//                RelativeLayout.LayoutParams.WRAP_CONTENT); // height
//        buttonLayoutParams.addRule(RelativeLayout.CENTER_IN_PARENT); // Đặt Button ở giữa RelativeLayout
//        button.setLayoutParams(buttonLayoutParams);
//
//        // Add Button to RelativeLayout
//        relativeLayout.addView(button);
//
//        // Set RelativeLayout as the Activity's interface
//        setContentView(relativeLayout);
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        FrameLayout frameLayout = new FrameLayout(this);
//
//        Button button = new Button(this);
//        button.setText("Click Me");
//
//        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
//                FrameLayout.LayoutParams.WRAP_CONTENT,
//                FrameLayout.LayoutParams.WRAP_CONTENT
//        );
//        layoutParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.TOP;
//        button.setLayoutParams(layoutParams);
//        button.setTextSize(26);
//
//        frameLayout.addView(button);
//        setContentView(frameLayout);
    }
}


//import android.os.Bundle;
//        import android.support.v7.app.AppCompatActivity;
//        import android.widget.LinearLayout;
//        import android.widget.ScrollView;
//        import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Tạo một ScrollView
//        ScrollView scrollView = new ScrollView(this);
//
//        // Tạo một LinearLayout để chứa nội dung
//        LinearLayout linearLayout = new LinearLayout(this);
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
//
//        // Tạo và thêm các TextView vào LinearLayout
//        for (int i = 0; i < 20; i++) {
//            TextView textView = new TextView(this);
//            textView.setText("Text " + i);
//            linearLayout.addView(textView);
//        }
//
//        // Đặt LinearLayout làm nội dung cho ScrollView
//        scrollView.addView(linearLayout);
//
//        // Đặt ScrollView làm nội dung cho activity
//        setContentView(scrollView);
//    }
//}


