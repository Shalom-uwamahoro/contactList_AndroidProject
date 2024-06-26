package com.shalomu.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.shalomu.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)

        displayContacts()
    }

    fun displayContacts(){

        val contact1 = Contact("Anna","0783430955", "anni@gmail.com", "")
        val contact2 = Contact("Abraham","0783430955", "abrai@gmail.com", "")
        val contact3 = Contact("Edward","0783430955", "edwi@gmail.com", "")
        val contact4 = Contact("Christian","0783430955", "chnni@gmail.com", "")
        val contact5 = Contact("Anita","0783430955", "anit@gmail.com", "")
        val contact6 = Contact("Bonke","0783430955", "bon@gmail.com", "")
        val contact7 = Contact("Eddy","0783430955", "eddi@gmail.com", "")
        val contact8 = Contact("Nikitta","0783430955", "niki@gmail.com", "")
        val contact9 = Contact("Racheal","0783430955", "rach@gmail.com", "")
        val contact10 = Contact("Mervielle","0783430955", "mervni@gmail.com", "")
        val contact11 = Contact("Annick","0783430955", "annick@gmail.com", "")

        val contactList = listOf(contact1, contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11)
        val contactsAdapter = ContactsAdapter(contactList)
        binding.rvContacts.adapter = contactsAdapter
    }
}