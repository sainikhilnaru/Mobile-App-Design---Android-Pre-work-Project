package com.example.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.TintableBackgroundView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.button)
        button.setOnClickListener {
            // Do something in response to button click
           // Log.i("Sai","Button Clicked")
           findViewById<TextView>(R.id.textView3).setTextColor(getResources().getColor(R.color.colorPrimaryDark))
        }

        val button2 = findViewById<View>(R.id.button2)
        button2.setOnClickListener {
            findViewById<View>(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorAccent))
           // Log.i("Sai","Button2 Clicked")
        }

        val changeText = findViewById<View>(R.id.button3)
        changeText.setOnClickListener {
            //grab text user inputted
             val inputText  = findViewById<EditText>(R.id.editText).getText().toString()
            //if empty
            if(TextUtils.isEmpty(inputText)){
                findViewById<TextView>(R.id.textView3).setText("Android is Awesome!"    )
            }else {
                //put text into textView once change text button is clicked
                findViewById<TextView>(R.id.textView3).setText(inputText)
            }
            //Log.i("Sai","changeText Clicked")
        }

        val ResetProperties = findViewById<View>(R.id.rootView)
        ResetProperties.setOnClickListener {
            //reset text color
            findViewById<TextView>(R.id.textView3).setTextColor(getResources().getColor(R.color.black))
            //reset Background color
            findViewById<View>(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorPrimary))
            //reset text content
            findViewById<TextView>(R.id.textView3).setText("Hello From Sainikhil"    )

            // Log.i("Sai","ResetProperties Clicked")
        }


    }


}
