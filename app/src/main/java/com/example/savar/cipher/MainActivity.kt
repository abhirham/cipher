package com.example.savar.cipher

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView
import android.text.Editable
import android.view.View.OnLongClickListener





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lessbtn.setText("<")
        autosizetext()
        editText.setSelection(editText.length())
        var txt : String
        //set pointer to right
        editText.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                editText.setSelection(editText.length())
            }
        })

        //till here

        //diable keybaord

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
            editText.setShowSoftInputOnFocus(false);
        }
        //till here

        dot.setOnClickListener(View.OnClickListener {
           editText.setText(""+editText.text+".")
        })
        zero.setOnClickListener(View.OnClickListener {
            editText.text.append("0")
        })

        one.setOnClickListener(View.OnClickListener {
            editText.text.append("1")
        })

        two.setOnClickListener(View.OnClickListener {
            editText.text.append("2")
        })

        three.setOnClickListener(View.OnClickListener {
            editText.text.append("3")
        })

        four.setOnClickListener(View.OnClickListener {
            editText.text.append("4")
        })

        five.setOnClickListener(View.OnClickListener {
            editText.text.append("5")
        })

        six.setOnClickListener(View.OnClickListener {
            editText.text.append("6")
        })

        seven.setOnClickListener(View.OnClickListener {
            editText.text.append("7")
        })

        eight.setOnClickListener(View.OnClickListener {
            editText.text.append("8")
        })

        nine.setOnClickListener(View.OnClickListener {
            editText.text.append("9")
        })



        del.setOnClickListener(View.OnClickListener {
            txt = editText.text.toString()
            if(txt.length>0)
                editText.setText(txt.substring(0, txt.length-1))
        })

        del.setOnLongClickListener(OnLongClickListener {
            editText.setText("")
            textView3.setText("")
            true
        })

        minus.setOnClickListener(View.OnClickListener {

            editText.setText(""+editText.text+"-")
        })

        div.setOnClickListener(View.OnClickListener {
            editText.setText(""+editText.text+"÷")
        })

        mul.setOnClickListener(View.OnClickListener {
            editText.setText(""+editText.text+"×")
        })

        plus.setOnClickListener(View.OnClickListener {
            editText.setText(""+editText.text+"+")
        })

    }

    fun autosizetext(){
        val dm = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(dm)
        val width = dm.widthPixels
        val w=0.2f*width
        val x=0.12f*width
        val unit=TypedValue.COMPLEX_UNIT_PX
        editText.setTextSize(unit,w)
        textView3.setTextSize(unit,x)
    }
}
