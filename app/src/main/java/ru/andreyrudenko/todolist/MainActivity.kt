package ru.andreyrudenko.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import ru.andreyrudenko.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController
    lateinit var navHostFragment: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        println(object : Any(){}.javaClass.enclosingMethod?.name + " MainActivity")
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        APP = this
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }

    override fun onStart() {
        println(object : Any(){}.javaClass.enclosingMethod?.name + " MainActivity")
        super.onStart()
    }

    override fun onRestart() {
        println(object : Any(){}.javaClass.enclosingMethod?.name + " MainActivity")
        super.onRestart()
    }

    override fun onResume() {
        println(object : Any(){}.javaClass.enclosingMethod?.name + " MainActivity")
        super.onResume()
    }

    override fun onPause() {
        println(object : Any(){}.javaClass.enclosingMethod?.name + " MainActivity")
        super.onPause()
    }

    override fun onStop() {
        println(object : Any(){}.javaClass.enclosingMethod?.name + " MainActivity")
        super.onStop()
    }

    override fun onDestroy() {
        println(object : Any(){}.javaClass.enclosingMethod?.name + " MainActivity")
        super.onDestroy()
    }
}