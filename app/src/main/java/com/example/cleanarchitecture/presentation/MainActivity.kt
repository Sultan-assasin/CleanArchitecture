package com.example.cleanarchitecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.cleanarchitecture.R
import com.example.cleanarchitecture.domain.models.SaveUserNameParam
import com.example.cleanarchitecture.domain.useCase.GetUserNameUseCase
import com.example.cleanarchitecture.domain.useCase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {

    private val getUserNameUseCase = GetUserNameUseCase()
    private val saveUserNameUseCase = SaveUserNameUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataTextView= findViewById<TextView>(R.id.dataTextView)
        val dataEditView = findViewById<EditText>(R.id.dataEditText)
        val sendButton = findViewById<Button>(R.id.sendButton)
        val receiveButton = findViewById<Button>(R.id.receiveButton)

        sendButton.setOnClickListener{
            val text = dataEditView.text.toString()
            val params = SaveUserNameParam(text)
            val result : Boolean = saveUserNameUseCase.execute(params)
            dataTextView.text = "Save Result = $result"
        }
        receiveButton.setOnClickListener{
            val userName = getUserNameUseCase.execute()
            dataTextView.text = userName.firstName
        }

    }
}