package com.example.contactsandroid

// DetailActivity.kt
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)

        val contact = intent.getSerializableExtra("contact") as ContactDetail
        findViewById<TextView>(R.id.textName).text = contact.name
        // Hiển thị các thông tin khác nếu cần
    }
}
