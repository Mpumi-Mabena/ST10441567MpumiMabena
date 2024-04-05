package com.example.historyapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity













class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val compareButton = findViewById<Button>(R.id.comparebutton)
        val clearButton = findViewById<Button>(R.id.clearbutton)
        val ageEditText = findViewById<EditText>(R.id.ageEdittext)
        val resultTextView = findViewById<TextView>(R.id.resultTextview)

        compareButton.setOnClickListener {
            val userInput = ageEditText.text.toString()

            if (userInput.isEmpty()) {
                resultTextView.text = "Please enter a valid age - it must be a whole number without decimals or text"
            } else {
                val userAge = userInput.toIntOrNull()

                if (userAge == null) {
                    resultTextView.text = "Please enter a valid age - it must be a whole number without decimals or text"
                } else {
                    if (userAge < 20 || userAge > 100) {
                        resultTextView.text = "Please enter an age between 20 and 100."
                        ageEditText.text.clear()
                    } else {
                        val result = when (userAge) {
                            28 -> "Somebody, famous for something else, died at this age"
                            39 -> "Martin Luther King Jr, famous for Master Oratorical skills, died at this age"
                            62 -> "Another Somebody, famous for something, died at this age"
                            else -> "Nobody known to me died at this age"
                        }
                        resultTextView.text = result
                    }
                }
            }
        }

        clearButton.setOnClickListener {
            ageEditText.text.clear()
            resultTextView.text = ""
        }
    }
}
        /*Reference List

        1. https://kotlinlang.org/
        2.https://chat.openai.com/
        3.https://www.programiz.com/java-programming
        4. https://www.programiz.com/kotlin-programming
        5. https://www.w3schools.com/KOTLIN/index.php
         */