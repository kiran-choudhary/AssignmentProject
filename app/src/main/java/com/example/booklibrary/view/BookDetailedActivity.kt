@file:Suppress("SpellCheckingInspection")
package com.example.booklibrary.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.booklibrary.R
import kotlinx.android.synthetic.main.book_detail.*

/**
 * Created by Kiran Kumar Choudhary on 02,March,2021).
 */

class BookDetailedActivity  : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.book_detail)
        initView()
    }

    private fun initView() {
        //set actionbar title
        supportActionBar!!.title = intent.getStringExtra(getString(R.string.book_name))

        //set back button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        book_detail_author.text = getString(R.string.author_name,intent.getStringExtra(getString(R.string.book_author)))
        book_detail_desc.text = intent.getStringExtra(getString(R.string.book_desc))
        book_detail_price.text = getString(R.string.book_price_value,intent.getStringExtra(getString(R.string.book_price)))
        try {
            //load image from URI to image view
            Glide.with(this)
                .load(intent.getStringExtra(getString(R.string.book_img_url)))
                .into(book_detail_image)
        } catch (e: Exception) {
            Log.e("dev", e.printStackTrace().toString())
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}