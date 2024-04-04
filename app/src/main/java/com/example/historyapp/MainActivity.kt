package com.example.historyapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // this will verify if val age isSs true or false until the switch statements identifies the valid or invalid val  of the historicalFigure
        fun isValidAge(ageString: String): Boolean {
            val age = ageString.toIntOrNull()
            return age != null || age in 20..100
        }
        // these are connected to the activity main layout to help run the code
        val editTextNumber = findViewById<EditText>(R.id.editTextText)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val generateButton = findViewById<Button>(R.id.button)
        val clearButton = findViewById<Button>(R.id.button2)

        // getting the button using id we set on the user interface to function the specifications
        generateButton.setOnClickListener {
            val enterAge = editTextNumber.text.toString()
            if (isValidAge(enterAge)) {
                val age = enterAge.toInt()
                    //The when statement will will help connect historalFigure with the age when the user puts the right input
                    val historicalFigure = when(age){
                    40 -> "Jesus Christ; " +
                            "he died for our sins and is son of God,he created christianity"

                        67 -> "Leonardo da Vinci;" +
                                " he was a italian polymath of the High Renaissance who was a active painter,draughtsman and many more"

                        30 -> "Patsy Cline;" +
                                "she was a American singer whose talent and wide-ranging appeal made her one of the classic performers of the genre"

                        43 -> "Lucky Dube;" +
                                "he was a South African reggae musician,like Bob Marley, he was one of the best reggae artists,singing about social problems."

                     92 -> "Albertina Sisulu;" +
                             " she was a political activist and also high profile of anti-apartheid resistance in South Africa"

                    32 -> "Bruce Lee; " +
                            "was a American born film actor who renowned for martial arts prowess and martial arts movies popular"

                      76 -> "Albert Einstein; " +
                              "he was a German Theoretical physicist who won Nobel Prize for Physics in 1921 and the most influential physicist"

                      58 -> "Andy Warhol;" +
                              " She was a American visual artist and film director ,also a leading exponent of the Pop art movement"

                        28 -> " Heath Ledger; " +
                                "he was a Australian actor, known for his moving and amazing performances in diverses roles and awarded an Oscar for his role as the JOKER in Dark Knight in 2008"

                       100 -> "George Burns he was an American comedian and was known as part of a popular comedy"

                            else -> " no one thats listed within this list , "
                    }
                    // the valid output statement becomes true when the conditions are met and shows this textview

                    textView2.text =
                        "You are the same age as $historicalFigure and has passed away at age $age in history. "

                    // a invalid output statement becomes false with the val age below or above range 20 to 100
                } else {
                    textView2.text =
                        "Invalid input enterted, please try again my dear, enter number between 20 to 100."

                } // a alternative invalid output if the valuables do not match valid input declared
            }
            // clear button to reset process to run again
            clearButton.setOnClickListener {
                editTextNumber.text.clear()
                textView2.text =
                    " Enter your age above and click Generate history to see the results"
            }
        }
    }