package com.example.contactsandroid

import androidx.*
import android.os.Bundle

// MainActivity.kt
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val contacts = listOf(
        ContactDetail(1, "John Doe 1", "123-456-7890", "john1@example.com"),
        ContactDetail(2, "John Doe 2", "123-456-7890", "john2@example.com"),
        ContactDetail(3, "John Doe 3", "123-456-7890", "john3@example.com"),
        ContactDetail(4, "John Doe 4", "123-456-7890", "john4@example.com"),
        ContactDetail(5, "John Doe 5", "123-456-7890", "john5@example.com"),
        ContactDetail(6, "John Doe 6", "123-456-7890", "john6@example.com"),
        ContactDetail(7, "John Doe 7", "123-456-7890", "john7@example.com"),
        ContactDetail(8, "John Doe 8", "123-456-7890", "john8@example.com"),
        ContactDetail(9, "John Doe 9", "123-456-7890", "john9@example.com"),
        ContactDetail(10, "John Doe 10", "123-456-7890", "john10@example.com"),
        ContactDetail(11, "John Doe 11", "123-456-7890", "john11@example.com"),
        ContactDetail(12, "John Doe 12", "123-456-7890", "john12@example.com"),
        ContactDetail(13, "John Doe 13", "123-456-7890", "john13@example.com"),
        ContactDetail(14, "John Doe 14", "123-456-7890", "john14@example.com"),
        ContactDetail(15, "John Doe 15", "123-456-7890", "john15@example.com"),
        // Thêm liên hệ khác nếu cần
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactAdapter(contacts) { contact ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("contact", contact)
            startActivity(intent)
        }
    }
}

private fun Intent.putExtra(s: String, contact: ContactDetail) {

}
