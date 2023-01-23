package com.example.dortislemyenikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var sayi1 : Int? = null
    var sayi2 : Int? = null
    var sonuc : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view : View){
        var sayi1 = editText.text.toString().toDoubleOrNull()
        var sayi2 = editText1.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2 == null ) {
            textView.text = "Sayı giriniz"
        }else {
            var sonuc = sayi1 + sayi2
            textView.text = "Sonuç: ${sonuc}"
        }

    }
    fun cikar(view: View){
        var sayi1 = editText.text.toString().toDoubleOrNull()
        var sayi2 = editText1.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2 == null ) {
            textView.text = "Sayı giriniz"
        }else {
            var sonuc = sayi1 - sayi2
            textView.text = "Sonuç: ${sonuc}"
        }

    }
    fun bolme(view: View){
        var sayi1 = editText.text.toString().toDoubleOrNull()
        var sayi2 = editText1.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2 == null ) {
            textView.text = "Sayı giriniz"
        }else {
            var sonuc = sayi1 / sayi2
            textView.text = "Sonuç: ${sonuc}"
        }

    }
    fun carp(view: View){
        var sayi1 = editText.text.toString().toDoubleOrNull()
        var sayi2 = editText1.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2 == null ) {
            textView.text = "Sayı giriniz"
        }else {
            var sonuc = sayi1 * sayi2
            textView.text = "Sonuç: ${sonuc}"
        }

    }
}