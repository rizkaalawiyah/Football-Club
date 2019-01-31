package com.example.rizka.footballclub

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.dip
import org.jetbrains.anko.padding
import org.jetbrains.anko.textView
import org.jetbrains.anko.*
import org.jetbrains.anko.verticalLayout

class DetailActivity : AppCompatActivity() {

    private var name: String = ""
    private lateinit var nameTextView: TextView

    private lateinit var imageView: ImageView

    private var desc: String = ""
    private lateinit var descTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        verticalLayout{
            lparams(matchParent, matchParent)


            imageView = imageView{
                setImageResource(R.drawable.img_barca)
            }.lparams(width=dip(70), height = dip(70) ) {
                    topMargin=dip(40)
                    gravity = Gravity.CENTER
                    bottomPadding = dip(10)
                }

            nameTextView = textView{
                textSize = sp(17).toFloat()
                gravity = Gravity.CENTER
                typeface = Typeface.DEFAULT_BOLD
                bottomPadding = dip(15)

            }

            descTextView = textView{
                padding = dip(10)
            }


        }

        imageView.setImageResource(intent.getIntExtra("image", R.drawable.img_barca))

        val intent = intent
        name = intent.getStringExtra("name")
        nameTextView.text = name

        desc = intent.getStringExtra("desc")
        descTextView.text = desc


    }
}
