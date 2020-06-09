package com.cochipcho.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    // onCreate() is the first function when activity is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagureActivity::class.java) // Intent is an object that lets you interactwith other applications as well as your own
            // eg. using Intent to go to Camera App
            // or to go to another Activity class
            // Android system is going to receive the "INTENT" that it wants to open up a browser and it's going to go
            // Intent has 2 different types : implicit VS explicit
            // We don't want to use implicit to open a specific app
            // Implicit : send an action to Android system and let the entry system serve up options that can fulfill that action. Android system will look through the apps and see which apps
            // match that action and serving those up as options to fulfill
            // Explicit : we know which class we want to response to this intent

            startActivity(leagueIntent)
        }


    }
}
