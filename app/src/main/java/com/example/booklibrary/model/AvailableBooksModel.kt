package com.example.booklibrary.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "book")
data class AvailableBooksModel (
    @SerializedName("book_author")
    val bookAuthor: String,
    @SerializedName("book_desc")
    val bookDesc: String,
    @SerializedName("book_id")
    @PrimaryKey
    val bookId: Int,
    @SerializedName("book_img_url")
    val bookImgUrl: String,
    @SerializedName("book_name")
    val bookName: String,
    @SerializedName("book_price")
    val bookPrice: String
)