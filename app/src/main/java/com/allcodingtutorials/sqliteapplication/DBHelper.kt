package com.allcodingtutorials.sqliteapplication

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.annotation.Nullable

class DBHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        const val DATABASE_NAME = "Userdata.db"
        const val DATABASE_VERSION = 1
    }

    private lateinit var db: SQLiteDatabase

    override fun onCreate(db: SQLiteDatabase) {
        this.db = db
        db.execSQL("create table Userdetails(name TEXT primary key, contact TEXT, dob TEXT)")
    }


    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("drop table if exists Userdetails")
    }

    fun insertuserdata(name: String, contact: String, dob: String): Boolean {
        val db = writableDatabase
        return with(db) {
            val contentValues = ContentValues()
            contentValues.put("name", name)
            contentValues.put("contact", contact)
            contentValues.put("dob", dob)
            insert("Userdetails", null, contentValues) != -1L
        }
    }

    fun updateuserdata(name: String, contact: String, dob: String): Boolean {
        val db = this.db ?: return false // return false if db is not initialized
        val contentValues = ContentValues()
        contentValues.put("contact", contact)
        contentValues.put("dob", dob)
        val cursor = db.rawQuery("Select * from Userdetails where name = ?", arrayOf(name))
        return if (cursor.count > 0) {
            val result = db.update("Userdetails", contentValues, "name=?", arrayOf(name))
            result != -1
        } else {
            false
        }
    }

    fun deletedata(name: String): Boolean {
        val db = this.db ?: return false // return false if db is not initialized
        val cursor = db.rawQuery("Select * from Userdetails where name = ?", arrayOf(name))
        return if (cursor.count > 0) {
            val result = db.delete("Userdetails", "name=?", arrayOf(name))
            result != -1// Explicit conversion to int for comparison
        } else {
            false
        }
    }

    fun getdata(): Cursor {
        val db = writableDatabase
        return db.rawQuery("Select * from Userdetails", null)
    }
}
