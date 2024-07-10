package com.shalomu.mycontacts

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shalomu.mycontacts.databinding.ContactListItemBinding

class ContactsAdapter ( var contactsList: List<Contact>):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val binding =ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val  contact = contactsList[position]
        holder.binding.tvName.text=contact.name
        holder.binding.tvPhoneNumber.text = contact.phoneNumber
        holder.binding.tvEmail.text = contact.email
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}
class ContactsViewHolder(var binding: ContactListItemBinding):RecyclerView.ViewHolder(binding.root){
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    val tvEmail= itemView.findViewById<TextView>(R.id.tvEmail)
}

//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.shalomu.mycontacts.databinding.ContactListItemBinding
//
//class ContactsAdapter(var contactsList: List<Contact>): RecyclerView.Adapter<ContactsViewHolder>(){
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
//        val binding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return ContactsViewHolder(binding)
//    }
//
//        override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
//            val  contact = contactsList[position]
//            holder.binding.tvName.text=contact.name
//            holder.binding.tvPhoneNumber.text = contact.phoneNumber
//            holder.binding.tvEmail.text = contact.email
//        }
//
//        override fun getItemCount(): Int {
//            return contactsList.size
//        }
//
//
//
//
//class ContactsViewHolder(var binding: ContactListItemBinding, position: Int) {
//    val tvName = itemView.findViewById<TextView>(R.id.tvName)
//    val tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
//    val tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
//
//}
//
//
