package com.example.sharedpreferences

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var spref=getPreferences(Context.MODE_PRIVATE)
        //initially when first run app it has default colori.e white
     val color=spref.getInt("COLOR",Color.WHITE)
        llbackground.setBackgroundColor(color);

        fun saveColor(color: Int) {
            var editor=spref.edit();
            editor.putInt("COLOR",color)
            editor.apply()
        }

        red.setOnClickListener{
            llbackground.setBackgroundColor(Color.RED);
            saveColor(Color.RED)
        }
        blue.setOnClickListener{
            llbackground.setBackgroundColor(Color.BLUE);
            saveColor(Color.BLUE)
        }
        green.setOnClickListener{
            llbackground.setBackgroundColor(Color.GREEN);
            saveColor(Color.GREEN)
        }
    }

}