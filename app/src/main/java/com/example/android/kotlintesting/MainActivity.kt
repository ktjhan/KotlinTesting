package com.example.android.kotlintesting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    internal var homeScore = 0
    internal var awayScore = 0
    internal var homeScoreDisplay: TextView? = null
    internal var awayScoreDisplay: TextView? = null
    internal var homeButton: Button? = null
    internal var awayButton: Button? = null
    internal var resetButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViews()
        updateScore()
        bindListeners()
    }

    private fun bindViews() {
        homeScoreDisplay = findViewById(R.id.home_score) as TextView
        awayScoreDisplay = findViewById(R.id.away_score) as TextView
        homeButton = findViewById(R.id.home_inc) as Button
        awayButton = findViewById(R.id.away_inc) as Button
        resetButton = findViewById(R.id.reset_button) as Button

    }

    private fun updateScore() {
        homeScoreDisplay!!.text = homeScore.toString() + ""
        awayScoreDisplay!!.text = awayScore.toString() + ""
    }

    private fun bindListeners() {
        homeButton!!.setOnClickListener {
            homeScore++
            updateScore()
        }

        awayButton!!.setOnClickListener {
            awayScore++
            updateScore()
        }

        resetButton!!.setOnClickListener {
            homeScore = 0
            awayScore = 0
            updateScore()
        }

    }

}
